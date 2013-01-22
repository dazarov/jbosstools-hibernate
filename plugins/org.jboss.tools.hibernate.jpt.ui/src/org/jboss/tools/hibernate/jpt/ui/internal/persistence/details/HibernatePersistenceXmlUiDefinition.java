/*******************************************************************************
  * Copyright (c) 2010 Red Hat, Inc.
  * Distributed under license by Red Hat, Inc. All rights reserved.
  * This program is made available under the terms of the
  * Eclipse Public License v1.0 which accompanies this distribution,
  * and is available at http://www.eclipse.org/legal/epl-v10.html
  *
  * Contributor:
  *     Red Hat, Inc. - initial API and implementation
  ******************************************************************************/
package org.jboss.tools.hibernate.jpt.ui.internal.persistence.details;

import org.eclipse.jpt.common.core.JptResourceType;
import org.eclipse.jpt.common.core.internal.utility.PlatformTools;
import org.eclipse.jpt.common.ui.jface.ItemTreeStateProviderFactoryProvider;
import org.eclipse.jpt.jpa.core.resource.persistence.JPA;
import org.eclipse.jpt.jpa.core.resource.persistence.XmlPersistence;
import org.eclipse.jpt.jpa.ui.ResourceUiDefinition;
import org.eclipse.jpt.jpa.ui.internal.persistence.AbstractPersistenceXmlResourceUiDefinition;
import org.eclipse.jpt.jpa.ui.internal.persistence.PersistenceXmlUiDefinition;
import org.eclipse.jpt.jpa.ui.internal.persistence.PersistenceXmlUiFactory;

/**
 * @author Dmitry Geraskov
 *
 */
public class HibernatePersistenceXmlUiDefinition extends
		AbstractPersistenceXmlResourceUiDefinition {
	// singleton
	private static final ResourceUiDefinition INSTANCE = new HibernatePersistenceXmlUiDefinition();
	
	
	/**
	 * Return the singleton
	 */
	public static ResourceUiDefinition instance() {
		return INSTANCE;
	}
	
	
	/**
	 * Enforce singleton usage
	 */
	private HibernatePersistenceXmlUiDefinition() {
		super();
	}
	
	
	@Override
	protected PersistenceXmlUiFactory buildPersistenceXmlUiFactory() {
		return new HibernatePersistenceXmlUiFactory();
	}
	
	public boolean providesUi(JptResourceType resourceType) {
		JptResourceType resType = PlatformTools.getResourceType(XmlPersistence.CONTENT_TYPE, JPA.SCHEMA_VERSION);
		return resourceType.equals(resType);
	}

	public ItemTreeStateProviderFactoryProvider getStructureViewFactoryProvider() {
		return PersistenceXmlUiDefinition.STRUCTURE_VIEW_FACTORY_PROVIDER;
	}
}
