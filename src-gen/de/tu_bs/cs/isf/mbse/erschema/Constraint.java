/**
 */
package de.tu_bs.cs.isf.mbse.erschema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.Constraint#getPredicates <em>Predicates</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.Constraint#getOperators <em>Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Predicates</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.erschema.Predicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicates</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getConstraint_Predicates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Predicate> getPredicates();

	/**
	 * Returns the value of the '<em><b>Operators</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.erschema.PredicateOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operators</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getConstraint_Operators()
	 * @model containment="true"
	 * @generated
	 */
	EList<PredicateOperator> getOperators();

} // Constraint
