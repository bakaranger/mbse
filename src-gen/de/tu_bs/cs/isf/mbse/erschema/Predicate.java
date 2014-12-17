/**
 */
package de.tu_bs.cs.isf.mbse.erschema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.Predicate#getTerms <em>Terms</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.Predicate#getLop <em>Lop</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.Predicate#getBop <em>Bop</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getPredicate()
 * @model
 * @generated
 */
public interface Predicate extends EObject {
	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.erschema.Term}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getPredicate_Terms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Term> getTerms();

	/**
	 * Returns the value of the '<em><b>Lop</b></em>' attribute.
	 * The default value is <code>"or"</code>.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.mbse.erschema.LogicalBinaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lop</em>' attribute.
	 * @see de.tu_bs.cs.isf.mbse.erschema.LogicalBinaryOperator
	 * @see #setLop(LogicalBinaryOperator)
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getPredicate_Lop()
	 * @model default="or"
	 * @generated
	 */
	LogicalBinaryOperator getLop();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.erschema.Predicate#getLop <em>Lop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lop</em>' attribute.
	 * @see de.tu_bs.cs.isf.mbse.erschema.LogicalBinaryOperator
	 * @see #getLop()
	 * @generated
	 */
	void setLop(LogicalBinaryOperator value);

	/**
	 * Returns the value of the '<em><b>Bop</b></em>' attribute list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.erschema.BinaryOperator}.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.mbse.erschema.BinaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bop</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bop</em>' attribute list.
	 * @see de.tu_bs.cs.isf.mbse.erschema.BinaryOperator
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getPredicate_Bop()
	 * @model
	 * @generated
	 */
	EList<BinaryOperator> getBop();

} // Predicate
