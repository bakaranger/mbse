/**
 */
package de.tu_bs.cs.isf.mbse.erschema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.Term#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getTerm()
 * @model
 * @generated
 */
public interface Term extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.mbse.erschema.Datatype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Datatype
	 * @see #setType(Datatype)
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getTerm_Type()
	 * @model
	 * @generated
	 */
	Datatype getType();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.erschema.Term#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Datatype
	 * @see #getType()
	 * @generated
	 */
	void setType(Datatype value);

} // Term
