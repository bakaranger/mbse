/**
 */
package de.tu_bs.cs.isf.mbse.erschema_branch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema_branch.Relation#getRoles <em>Roles</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema_branch.Relation#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema_branch.Relation#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema_branch.Relation#getDummyConstraints <em>Dummy Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.erschema_branch.ErschemaPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends Element {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.erschema_branch.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.ErschemaPackage#getRelation_Roles()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Role> getRoles();

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
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.ErschemaPackage#getRelation_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

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
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.ErschemaPackage#getRelation_Constraints()
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
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.ErschemaPackage#getRelation_DummyConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<DummyConstraint> getDummyConstraints();

} // Relation
