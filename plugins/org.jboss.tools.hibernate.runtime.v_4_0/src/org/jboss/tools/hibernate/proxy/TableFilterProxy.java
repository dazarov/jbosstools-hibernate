package org.jboss.tools.hibernate.proxy;

import org.hibernate.cfg.reveng.TableFilter;
import org.jboss.tools.hibernate.runtime.spi.ITableFilter;

public class TableFilterProxy implements ITableFilter {
	
	private TableFilter target = null;

	public TableFilterProxy(TableFilter tableFilter) {
		target = tableFilter;
	}

	@Override
	public void setExclude(Boolean exclude) {
		target.setExclude(exclude);
	}

	@Override
	public void setMatchCatalog(String catalog) {
		target.setMatchCatalog(catalog);
	}

	@Override
	public void setMatchSchema(String schema) {
		target.setMatchSchema(schema);
	}

	@Override
	public void setMatchName(String name) {
		target.setMatchName(name);
	}

	@Override
	public Boolean getExclude() {
		return target.getExclude();
	}

	@Override
	public String getMatchCatalog() {
		return target.getMatchCatalog();
	}

	@Override
	public String getMatchSchema() {
		return target.getMatchSchema();
	}

	@Override
	public String getMatchName() {
		return target.getMatchName();
	}

	TableFilter getTarget() {
		return target;
	}

}
