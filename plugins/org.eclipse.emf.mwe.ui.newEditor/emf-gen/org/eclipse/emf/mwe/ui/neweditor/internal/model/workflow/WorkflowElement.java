/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowElement.java,v 1.1 2008/02/24 23:50:26 pschonbac Exp $
 */
package org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowElement#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowElement#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowElement#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowElement#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowPackage#getWorkflowElement()
 * @model
 * @generated
 */
public interface WorkflowElement extends EObject {
    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowPackage#getWorkflowElement_Label()
     * @model required="true"
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowElement#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Length</em>' attribute.
     * @see #setLength(int)
     * @see org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowPackage#getWorkflowElement_Length()
     * @model required="true"
     * @generated
     */
    int getLength();

    /**
     * Sets the value of the '{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowElement#getLength <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Length</em>' attribute.
     * @see #getLength()
     * @generated
     */
    void setLength(int value);

    /**
     * Returns the value of the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Offset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Offset</em>' attribute.
     * @see #setOffset(int)
     * @see org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowPackage#getWorkflowElement_Offset()
     * @model required="true"
     * @generated
     */
    int getOffset();

    /**
     * Sets the value of the '{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowElement#getOffset <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Offset</em>' attribute.
     * @see #getOffset()
     * @generated
     */
    void setOffset(int value);

    /**
     * Returns the value of the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Image</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Image</em>' attribute.
     * @see #setImage(String)
     * @see org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowPackage#getWorkflowElement_Image()
     * @model
     * @generated
     */
    String getImage();

    /**
     * Sets the value of the '{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowElement#getImage <em>Image</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Image</em>' attribute.
     * @see #getImage()
     * @generated
     */
    void setImage(String value);

} // WorkflowElement