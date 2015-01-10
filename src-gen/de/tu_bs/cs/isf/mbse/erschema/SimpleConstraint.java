/**
 */
package de.tu_bs.cs.isf.mbse.erschema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getLeft <em>Left</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getCompare <em>Compare</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getSimpleConstraint()
 * @model
 * @generated
 */
public interface SimpleConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getSimpleConstraint_Left()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Compare</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.erschema.Comparative}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compare</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compare</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getSimpleConstraint_Compare()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Comparative> getCompare();

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getSimpleConstraint_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // SimpleConstraint
