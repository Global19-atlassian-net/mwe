/*
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.ui.neweditor.model.nodebuilder;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowFactory;
import org.eclipse.jface.text.Position;
import org.xml.sax.Attributes;


/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public abstract class AbstractNodeBuilderStrategy implements
        INodeBuilderStrategy {

    protected static final String WORKFLOW_TAG = "org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow";

    protected static final String COMPONENT_TAG = "component";

    protected static final String PROPERTY_TAG = "property";

    protected static final String[] ASSIGNMENT_TAGS =
            { WORKFLOW_TAG, COMPONENT_TAG };

    protected static final WorkflowFactory FACTORY = WorkflowFactory.eINSTANCE;

    private static final String IMAGE_FIELD = "image";

    private static final String LENGTH_FIELD = "length";

    private static final String OFFSET_FIELD = "offset";

    private static final String NAME_PROPERTY = "name";

    private static final String VALUE_PROPERTY = "value";

    private static final String FILE_PROPERTY = "file";

    /**
     * This automatically generated method overrides the implementation of
     * <code>create</code> inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.neweditor.model.nodebuilder.INodeBuilderStrategy#create(java.lang.String,
     *      org.xml.sax.Attributes, org.eclipse.emf.ecore.EObject, Position)
     */
    @Override
    public EObject create(final String localName, final Attributes attributes,
            final EObject ctx, final Position position) {
        EObject object = null;

        if (canCreate(localName, attributes, ctx))
            object = createObject();

        setParameters(object, attributes, position);
        setField(object, IMAGE_FIELD, getImage());
        return object;
    }

    protected abstract EObject createObject();

    protected String getElementName() {
        final Class<? extends INodeBuilderStrategy> clazz = this.getClass();
        final String className = clazz.getSimpleName();
        final int i = className.indexOf("Builder");
        assert (i > 0);
        final String elementName = className.substring(0, i);

        return elementName;
    }

    protected abstract String getImage();

    protected abstract String[] requiredAttributes();

    protected void setParameters(final EObject object,
            final Attributes attributes, final Position position) {
        for (int i = 0; i < attributes.getLength(); i++) {
            final String attrName = attributes.getLocalName(i);
            final String attrValue = attributes.getValue(i);

            setField(object, attrName, attrValue);
        }
        setField(object, OFFSET_FIELD, position.getOffset());
        setField(object, LENGTH_FIELD, position.getLength());
    }

    private boolean canCreate(final String localName,
            final Attributes attributes, final EObject ctx) {
        return isFeatureMatch(localName, attributes)
                && isAllowedInContext(ctx);
    }

    private boolean hasAttribute(final Attributes attributes, final String name) {
        boolean res = false;
        for (int i = 0; i < attributes.getLength(); i++) {
            final String attrName = attributes.getLocalName(i);
            if (attrName.equals(name)) {
                res = true;
                break;
            }
        }
        return res;
    }

    private boolean hasFeature(final EObject ctx, final String featureName) {
        final EClass clazz = ctx.eClass();
        final EStructuralFeature feature =
                clazz.getEStructuralFeature(featureName);
        return (feature != null);
    }

    private boolean hasFeatureType(final EObject ctx, final String typeName) {
        final EClass clazz = ctx.eClass();
        final EList<EStructuralFeature> featureList =
                clazz.getEAllStructuralFeatures();
        for (final EStructuralFeature feat : featureList) {
            final EClassifier classifier = feat.getEType();
            final String name = classifier.getInstanceTypeName();
            if (name.equalsIgnoreCase(name))
                return true;
        }
        return false;
    }

    private boolean isAllowedInContext(final EObject ctx) {
        return hasFeatureType(ctx, getElementName());
    }

    private boolean isAssignment(final String localName) {
        for (final String str : ASSIGNMENT_TAGS) {
            if (str.equals(localName))
                return true;
        }
        return false;
    }

    private boolean isFeatureMatch(final String localName,
            final Attributes attributes) {
        return isAssignment(localName) ^ isProperty(localName, attributes)
                ^ isValue(localName, attributes);
    }

    private boolean isProperty(final String localName,
            final Attributes attributes) {
        return localName.equals(PROPERTY_TAG)
                && ((hasAttribute(attributes, NAME_PROPERTY) && hasAttribute(
                        attributes, VALUE_PROPERTY)) || hasAttribute(
                        attributes, FILE_PROPERTY));
    }

    private boolean isValue(final String localName, final Attributes attributes) {
        if (isProperty(localName, attributes))
            return false;

        boolean res = true;
        for (final String name : requiredAttributes()) {
            if (!hasAttribute(attributes, name)) {
                res = false;
                break;
            }
        }
        return res;
    }

    private void setField(final EObject object, final String fieldName,
            final Object value) {
        final EClass eClass = object.eClass();
        final EStructuralFeature feature =
                eClass.getEStructuralFeature(fieldName);
        object.eSet(feature, value);
    }
}