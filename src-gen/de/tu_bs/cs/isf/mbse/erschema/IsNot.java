/**
 */
package de.tu_bs.cs.isf.mbse.erschema;

import java.lang.Double;
import java.lang.String;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.IsNot#getValueInt <em>Value Int</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.IsNot#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.erschema.erschemaPackage#getIsNot()
 * @model
 * @generated
 */
public interface IsNot extends Comparative {
	/**
	 * Returns the value of the '<em><b>Value Int</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Int</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Int</em>' attribute list.
	 * @see de.tu_bs.cs.isf.mbse.erschema.erschemaPackage#getIsNot_ValueInt()
	 * @model default="0"
	 * @generated
	 */
	EList<Double> getValueInt();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"\" \""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.tu_bs.cs.isf.mbse.erschema.erschemaPackage#getIsNot_Value()
	 * @model default="\" \""
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.erschema.IsNot#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // IsNot
