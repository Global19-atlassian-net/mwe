/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.emf.mwe.core.resources;

import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

/**
 * 
 * @author Sven Efftinge (http://www.efftinge.de)

 */
public interface ResourceLoader {

    /**
     * 
     * @param uri
     *            Identifier for a resource
     * @return InputStream for the specified resource.
     */
    public InputStream getResourceAsStream(String uri);

    /**
     * 
     * @param clazzName
     *            The class name
     * @return The class instance or null if no such class could be found
     */
    public Class<?> loadClass(String clazzName);

    public URL getResource(String uri);
    
    public Enumeration<URL> getResources(String uri);
}
