/**
 */
package de.tu_bs.cs.isf.mbse.erschema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.Attribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends Element {
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
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getAttribute_Type()
	 * @model required="true" changeable="false"
	 * @generated
	 */
	Datatype getType();

} // Attribute
