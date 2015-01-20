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
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getCompare <em>Compare</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getEntity <em>Entity</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getConnect <em>Connect</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getStringop <em>Stringop</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getArithmeticop <em>Arithmeticop</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getSimpleConstraint()
 * @model
 * @generated
 */
public interface SimpleConstraint extends EObject {
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
	 * Returns the value of the '<em><b>Entity</b></em>' reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.erschema.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference list.
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getSimpleConstraint_Entity()
	 * @model lower="2"
	 * @generated
	 */
	EList<Entity> getEntity();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.erschema.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getSimpleConstraint_Attributes()
	 * @model lower="2"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Connect</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.erschema.Connective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getSimpleConstraint_Connect()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connective> getConnect();

	/**
	 * Returns the value of the '<em><b>Stringop</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.erschema.StringOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stringop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stringop</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getSimpleConstraint_Stringop()
	 * @model containment="true"
	 * @generated
	 */
	EList<StringOperator> getStringop();

	/**
	 * Returns the value of the '<em><b>Arithmeticop</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.erschema.ArithmeticOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arithmeticop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arithmeticop</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getSimpleConstraint_Arithmeticop()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArithmeticOperator> getArithmeticop();

} // SimpleConstraint
