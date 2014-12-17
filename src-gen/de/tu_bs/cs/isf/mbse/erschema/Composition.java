/**
 */
package de.tu_bs.cs.isf.mbse.erschema;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.Composition#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getComposition()
 * @model
 * @generated
 */
public interface Composition extends Element {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.erschema.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getComposition_Attributes()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // Composition
