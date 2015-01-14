/**
 */
package de.tu_bs.cs.isf.mbse.erschema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.Role#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.Role#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.Role#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends Element {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"\'0\'"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(char)
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getRole_LowerBound()
	 * @model default="\'0\'" required="true"
	 * @generated
	 */
	char getLowerBound();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.erschema.Role#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(char value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"\'1\'"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(char)
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getRole_UpperBound()
	 * @model default="\'1\'" required="true"
	 * @generated
	 */
	char getUpperBound();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.erschema.Role#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(char value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getRole_Entity()
	 * @model required="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.erschema.Role#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // Role
