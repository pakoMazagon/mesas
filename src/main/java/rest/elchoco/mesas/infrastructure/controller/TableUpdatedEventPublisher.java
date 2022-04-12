package rest.elchoco.mesas.infrastructure.controller;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Consumer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import reactor.core.publisher.FluxSink;
import rest.elchoco.mesas.dom.service.impl.TableUpdateEvent;

@Component
class TableUpdateEventPublisher implements
    ApplicationListener<TableUpdateEvent>, // <1>
    Consumer<FluxSink<TableUpdateEvent>> { //<2>

    private final Executor executor;
    private final BlockingQueue<TableUpdateEvent> queue =
        new LinkedBlockingQueue<>(); // <3>

    TableUpdateEventPublisher(Executor executor) {
        this.executor = executor;
    }

    // <4>
    @Override
    public void onApplicationEvent(TableUpdateEvent event) {
        this.queue.offer(event);
    }

     @Override
    public void accept(FluxSink<TableUpdateEvent> sink) {
        this.executor.execute(() -> {
            while (true)
                try {
                    TableUpdateEvent event = queue.take(); // <5>
                    sink.next(event); // <6>
                }
                catch (InterruptedException e) {
                    ReflectionUtils.rethrowRuntimeException(e);
                }
        });
    }
}
