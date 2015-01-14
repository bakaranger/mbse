/**
 */
package de.tu_bs.cs.isf.mbse.erschema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.KeyValue#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.KeyValue#getComposition <em>Composition</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getKeyValue()
 * @model
 * @generated
 */
public interface KeyValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference.
	 * @see #setAttribute(Attribute)
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getKeyValue_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.erschema.KeyValue#getAttribute <em>Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' containment reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Composition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' containment reference.
	 * @see #setComposition(Composition)
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getKeyValue_Composition()
	 * @model containment="true"
	 * @generated
	 */
	Composition getComposition();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.erschema.KeyValue#getComposition <em>Composition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition</em>' containment reference.
	 * @see #getComposition()
	 * @generated
	 */
	void setComposition(Composition value);

} // KeyValue
