/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di;

import org.eclipse.xtext.service.IServiceScope;
import org.eclipse.xtext.service.ServiceScopeFactory;

public interface IMWE {

	/**
	 * the unique identifier of this language. 
	 * To be used to get the language descriptor and related services from the registry.
	 * Within ILanguageServices it is encouraged to use dependency injection instead
	 * of directly accessing the ServiceRegistry 
	 */
	public static final String ID = "org.eclipse.emf.mwe.di.MWE";
	public static final String NAME = "MWE";
	public static final String NAMESPACE = "org.eclipse.emf.mwe.di";
	public static final String[] FILE_EXTENSIONS = new String[]{"xtext","mwe"};
	public static final IServiceScope SCOPE = ServiceScopeFactory.createScope(ID, org.eclipse.xtext.builtin.IXtextBuiltin.SCOPE);
	
}
