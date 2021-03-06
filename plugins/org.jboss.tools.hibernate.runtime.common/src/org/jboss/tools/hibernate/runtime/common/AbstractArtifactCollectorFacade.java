package org.jboss.tools.hibernate.runtime.common;

import java.io.File;
import java.util.Set;

import org.jboss.tools.hibernate.runtime.spi.IArtifactCollector;
import org.jboss.tools.hibernate.runtime.spi.IFacadeFactory;

public abstract class AbstractArtifactCollectorFacade 
extends AbstractFacade 
implements IArtifactCollector {
	
	public AbstractArtifactCollectorFacade(IFacadeFactory facadeFactory) {
		super(facadeFactory);
	}
	
	protected String getTargetClassName() {
		return "org.hibernate.tool.hbm2x.ArtifactCollector";
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Set<String> getFileTypes() {
		return (Set<String>)Util.invokeMethod(
				getTarget(), 
				"getFileTypes", 
				new Class[] {},
				new Object[] {});
	}

	@Override
	public void formatFiles() {
		Util.invokeMethod(
				getTarget(), 
				"formatFiles", 
				new Class[] {}, 
				new Object[] {});
	}

	@Override
	public File[] getFiles(String string) {
		return (File[])Util.invokeMethod(
				getTarget(), 
				"getFiles", 
				new Class[] {String.class}, 
				new Object[] { string });
	}

}
