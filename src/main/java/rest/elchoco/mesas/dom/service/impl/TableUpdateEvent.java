package rest.elchoco.mesas.dom.service.impl;

import org.springframework.context.ApplicationEvent;

import rest.elchoco.mesas.dom.domain.Table;

public class TableUpdateEvent extends ApplicationEvent {

	public TableUpdateEvent(Table table) {
		super(table);
	}

}
