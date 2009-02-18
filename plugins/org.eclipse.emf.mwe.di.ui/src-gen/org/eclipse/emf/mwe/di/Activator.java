
package org.eclipse.emf.mwe.di;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Generated from UIPlugin.xpt
 */
public class Activator extends AbstractUIPlugin {

	private Injector injector;
	private static Activator INSTANCE;

	public Injector getInjector() {
		return injector;
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		this.injector = Guice.createInjector(new org.eclipse.emf.mwe.di.MWERuntimeModule(), new org.eclipse.emf.mwe.di.MWEUiModule());
	}
	
	public static Activator getInstance() {
		return INSTANCE;
	}
	
}
