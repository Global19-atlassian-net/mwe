/**
 */
package org.eclipse.emf.mwe2.language.mwe2;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.Assignment#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.Assignment#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.Assignment#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends EObject
{
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(JvmIdentifiableElement)
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getAssignment_Feature()
	 * @model
	 * @generated
	 */
	JvmIdentifiableElement getFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe2.language.mwe2.Assignment#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(JvmIdentifiableElement value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getAssignment_Value()
	 * @model containment="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe2.language.mwe2.Assignment#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getAssignment_FeatureName()
	 * @model transient="true" changeable="false"
	 * @generated
	 */
	String getFeatureName();

} // Assignment
