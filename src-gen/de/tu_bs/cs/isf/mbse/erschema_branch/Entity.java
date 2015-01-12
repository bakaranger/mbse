/**
 */
package de.tu_bs.cs.isf.mbse.erschema_branch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema_branch.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema_branch.Entity#getCompositions <em>Compositions</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema_branch.Entity#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema_branch.Entity#getDummyConstraints <em>Dummy Constraints</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema_branch.Entity#getKeys <em>Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.erschema_branch.ErschemaPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Element {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.erschema_branch.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.ErschemaPackage#getEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Compositions</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.erschema_branch.Composition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compositions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compositions</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.ErschemaPackage#getEntity_Compositions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Composition> getCompositions();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.erschema_branch.SimpleConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.ErschemaPackage#getEntity_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimpleConstraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Dummy Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.erschema_branch.DummyConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dummy Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dummy Constraints</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.ErschemaPackage#getEntity_DummyConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<DummyConstraint> getDummyConstraints();

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.erschema_branch.KeyValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.ErschemaPackage#getEntity_Keys()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<KeyValue> getKeys();

} // Entity
