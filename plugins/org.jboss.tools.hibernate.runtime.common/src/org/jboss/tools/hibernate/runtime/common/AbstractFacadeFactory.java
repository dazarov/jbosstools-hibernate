package org.jboss.tools.hibernate.runtime.common;

import org.jboss.tools.hibernate.runtime.spi.IArtifactCollector;
import org.jboss.tools.hibernate.runtime.spi.ICfg2HbmTool;
import org.jboss.tools.hibernate.runtime.spi.IFacadeFactory;

public abstract class AbstractFacadeFactory implements IFacadeFactory {

	public IArtifactCollector createArtifactCollector() {
		return new AbstractArtifactCollectorFacade(this) {};
	}
	
	public ICfg2HbmTool createCfg2HbmTool() {
		return new AbstractCfg2HbmToolFacade(this) {};
	}
	
}
