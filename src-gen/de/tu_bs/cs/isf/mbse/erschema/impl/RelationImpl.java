/**
 */
package de.tu_bs.cs.isf.mbse.erschema.impl;

import de.tu_bs.cs.isf.mbse.erschema.Attribute;
import de.tu_bs.cs.isf.mbse.erschema.DummyConstraint;
import de.tu_bs.cs.isf.mbse.erschema.Relation;
import de.tu_bs.cs.isf.mbse.erschema.Role;
import de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint;
import de.tu_bs.cs.isf.mbse.erschema.erschemaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.RelationImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.RelationImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.RelationImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.RelationImpl#getDummyConstraints <em>Dummy Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationImpl extends ElementImpl implements Relation {
	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleConstraint> constraints;

	/**
	 * The cached value of the '{@link #getDummyConstraints() <em>Dummy Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDummyConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<DummyConstraint> dummyConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return erschemaPackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, erschemaPackage.RELATION__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, erschemaPackage.RELATION__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<SimpleConstraint>(SimpleConstraint.class, this, erschemaPackage.RELATION__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DummyConstraint> getDummyConstraints() {
		if (dummyConstraints == null) {
			dummyConstraints = new EObjectContainmentEList<DummyConstraint>(DummyConstraint.class, this, erschemaPackage.RELATION__DUMMY_CONSTRAINTS);
		}
		return dummyConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case erschemaPackage.RELATION__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case erschemaPackage.RELATION__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case erschemaPackage.RELATION__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case erschemaPackage.RELATION__DUMMY_CONSTRAINTS:
				return ((InternalEList<?>)getDummyConstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case erschemaPackage.RELATION__ROLES:
				return getRoles();
			case erschemaPackage.RELATION__ATTRIBUTES:
				return getAttributes();
			case erschemaPackage.RELATION__CONSTRAINTS:
				return getConstraints();
			case erschemaPackage.RELATION__DUMMY_CONSTRAINTS:
				return getDummyConstraints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case erschemaPackage.RELATION__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case erschemaPackage.RELATION__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case erschemaPackage.RELATION__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends SimpleConstraint>)newValue);
				return;
			case erschemaPackage.RELATION__DUMMY_CONSTRAINTS:
				getDummyConstraints().clear();
				getDummyConstraints().addAll((Collection<? extends DummyConstraint>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case erschemaPackage.RELATION__ROLES:
				getRoles().clear();
				return;
			case erschemaPackage.RELATION__ATTRIBUTES:
				getAttributes().clear();
				return;
			case erschemaPackage.RELATION__CONSTRAINTS:
				getConstraints().clear();
				return;
			case erschemaPackage.RELATION__DUMMY_CONSTRAINTS:
				getDummyConstraints().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case erschemaPackage.RELATION__ROLES:
				return roles != null && !roles.isEmpty();
			case erschemaPackage.RELATION__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case erschemaPackage.RELATION__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case erschemaPackage.RELATION__DUMMY_CONSTRAINTS:
				return dummyConstraints != null && !dummyConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RelationImpl
