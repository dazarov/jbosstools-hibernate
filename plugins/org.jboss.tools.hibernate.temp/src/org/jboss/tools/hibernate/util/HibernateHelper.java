package org.jboss.tools.hibernate.util;

import java.util.ServiceLoader;

import org.jboss.tools.hibernate.spi.IService;

public class HibernateHelper {
	
	public static HibernateHelper INSTANCE = new HibernateHelper();
	
	private IService hibernateService = null;
	
	public IService getHibernateService() {
		if (hibernateService == null) {
			hibernateService = loadHibernateService();
		}
		return hibernateService;
	}
	
	private IService loadHibernateService() {
		ServiceLoader<IService> loader = 
				ServiceLoader.load(IService.class);
		return loader.iterator().next();
	}

}