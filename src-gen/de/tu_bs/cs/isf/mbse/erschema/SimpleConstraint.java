/**
 */
package de.tu_bs.cs.isf.mbse.erschema;

import java.lang.Double;
import java.lang.String;

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
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getStringValue <em>String Value</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getNumValue <em>Num Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.erschema.erschemaPackage#getSimpleConstraint()
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
	 * @see de.tu_bs.cs.isf.mbse.erschema.erschemaPackage#getSimpleConstraint_Compare()
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
	 * @see de.tu_bs.cs.isf.mbse.erschema.erschemaPackage#getSimpleConstraint_Entity()
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
	 * @see de.tu_bs.cs.isf.mbse.erschema.erschemaPackage#getSimpleConstraint_Attributes()
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
	 * @see de.tu_bs.cs.isf.mbse.erschema.erschemaPackage#getSimpleConstraint_Connect()
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
	 * @see de.tu_bs.cs.isf.mbse.erschema.erschemaPackage#getSimpleConstraint_Stringop()
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
	 * @see de.tu_bs.cs.isf.mbse.erschema.erschemaPackage#getSimpleConstraint_Arithmeticop()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArithmeticOperator> getArithmeticop();

	/**
	 * Returns the value of the '<em><b>String Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Value</em>' attribute list.
	 * @see de.tu_bs.cs.isf.mbse.erschema.erschemaPackage#getSimpleConstraint_StringValue()
	 * @model default="\"\"" upper="2"
	 * @generated
	 */
	EList<String> getStringValue();

	/**
	 * Returns the value of the '<em><b>Num Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Value</em>' attribute list.
	 * @see de.tu_bs.cs.isf.mbse.erschema.erschemaPackage#getSimpleConstraint_NumValue()
	 * @model default="0" upper="2"
	 * @generated
	 */
	EList<Double> getNumValue();

} // SimpleConstraint
