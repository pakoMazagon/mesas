package rest.elchoco.mesas.config.dbmigrations;

import java.math.BigDecimal;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;

import rest.elchoco.mesas.dom.domain.Table;
import rest.elchoco.mesas.dom.repository.TableRepository;

@ChangeLog(order = "001")
public class DatabaseInitChangeLog {

	@ChangeSet(order = "001", id = "init_Tables_Terrace", author = "pako")
	public void initTerrace(TableRepository tableRepository) {
		
		for(int i=1;i<=40;i++) {
			tableRepository.save(Table.builder().originalName(String.format("Mesa %d",i)).price(BigDecimal.ZERO).place("t").free(Boolean.TRUE).build());
		}
	}
	
	@ChangeSet(order = "002", id = "init_Tables_Salon", author = "pako")
	public void initSalon(TableRepository tableRepository) {
		
		for(int i=1;i<=10;i++) {
			tableRepository.save(Table.builder().originalName(String.format("Mesa %d",i)).price(BigDecimal.ZERO).place("s").free(Boolean.TRUE).build());
		}
	}
	
	@ChangeSet(order = "003", id = "init_Tables_Barra", author = "pako")
	public void initBarra(TableRepository tableRepository) {
		
		for(int i=1;i<=10;i++) {
			tableRepository.save(Table.builder().originalName(String.format("Mesa %d",i)).price(BigDecimal.ZERO).place("b").free(Boolean.TRUE).build());
		}
	}
	

}
