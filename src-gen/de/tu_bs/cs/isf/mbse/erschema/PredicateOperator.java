/**
 */
package de.tu_bs.cs.isf.mbse.erschema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.PredicateOperator#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getPredicateOperator()
 * @model
 * @generated
 */
public interface PredicateOperator extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.mbse.erschema.LogicalBinaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.tu_bs.cs.isf.mbse.erschema.LogicalBinaryOperator
	 * @see #setType(LogicalBinaryOperator)
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getPredicateOperator_Type()
	 * @model
	 * @generated
	 */
	LogicalBinaryOperator getType();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.erschema.PredicateOperator#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.tu_bs.cs.isf.mbse.erschema.LogicalBinaryOperator
	 * @see #getType()
	 * @generated
	 */
	void setType(LogicalBinaryOperator value);

} // PredicateOperator
