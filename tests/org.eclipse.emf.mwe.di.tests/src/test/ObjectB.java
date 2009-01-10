/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package test;

import java.util.ArrayList;
import java.util.List;

public class ObjectB {
	public ObjectA singleEle;
	public List<ObjectA> multiEle = new ArrayList<ObjectA>();
	
	public void setSingleEle(ObjectA singleEle) {
		this.singleEle = singleEle;
	}
	
	public void addMultiEle(ObjectA multi) {
		this.multiEle.add(multi);
	}
	
	public ObjectB another;
	public void setAnother(ObjectB another) {
		this.another = another;
	}
	
}
