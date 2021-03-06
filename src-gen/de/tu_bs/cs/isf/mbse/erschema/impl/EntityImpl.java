/**
 */
package de.tu_bs.cs.isf.mbse.erschema.impl;

import de.tu_bs.cs.isf.mbse.erschema.Attribute;
import de.tu_bs.cs.isf.mbse.erschema.Composition;
import de.tu_bs.cs.isf.mbse.erschema.DummyConstraint;
import de.tu_bs.cs.isf.mbse.erschema.Entity;
import de.tu_bs.cs.isf.mbse.erschema.KeyValue;
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
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.EntityImpl#getCompositions <em>Compositions</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.EntityImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.EntityImpl#getDummyConstraints <em>Dummy Constraints</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.EntityImpl#getKeys <em>Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends ElementImpl implements Entity {
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
	 * The cached value of the '{@link #getCompositions() <em>Compositions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositions()
	 * @generated
	 * @ordered
	 */
	protected EList<Composition> compositions;

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
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyValue> keys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return erschemaPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, erschemaPackage.ENTITY__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Composition> getCompositions() {
		if (compositions == null) {
			compositions = new EObjectContainmentEList<Composition>(Composition.class, this, erschemaPackage.ENTITY__COMPOSITIONS);
		}
		return compositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<SimpleConstraint>(SimpleConstraint.class, this, erschemaPackage.ENTITY__CONSTRAINTS);
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
			dummyConstraints = new EObjectContainmentEList<DummyConstraint>(DummyConstraint.class, this, erschemaPackage.ENTITY__DUMMY_CONSTRAINTS);
		}
		return dummyConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyValue> getKeys() {
		if (keys == null) {
			keys = new EObjectContainmentEList<KeyValue>(KeyValue.class, this, erschemaPackage.ENTITY__KEYS);
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case erschemaPackage.ENTITY__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case erschemaPackage.ENTITY__COMPOSITIONS:
				return ((InternalEList<?>)getCompositions()).basicRemove(otherEnd, msgs);
			case erschemaPackage.ENTITY__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case erschemaPackage.ENTITY__DUMMY_CONSTRAINTS:
				return ((InternalEList<?>)getDummyConstraints()).basicRemove(otherEnd, msgs);
			case erschemaPackage.ENTITY__KEYS:
				return ((InternalEList<?>)getKeys()).basicRemove(otherEnd, msgs);
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
			case erschemaPackage.ENTITY__ATTRIBUTES:
				return getAttributes();
			case erschemaPackage.ENTITY__COMPOSITIONS:
				return getCompositions();
			case erschemaPackage.ENTITY__CONSTRAINTS:
				return getConstraints();
			case erschemaPackage.ENTITY__DUMMY_CONSTRAINTS:
				return getDummyConstraints();
			case erschemaPackage.ENTITY__KEYS:
				return getKeys();
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
			case erschemaPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case erschemaPackage.ENTITY__COMPOSITIONS:
				getCompositions().clear();
				getCompositions().addAll((Collection<? extends Composition>)newValue);
				return;
			case erschemaPackage.ENTITY__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends SimpleConstraint>)newValue);
				return;
			case erschemaPackage.ENTITY__DUMMY_CONSTRAINTS:
				getDummyConstraints().clear();
				getDummyConstraints().addAll((Collection<? extends DummyConstraint>)newValue);
				return;
			case erschemaPackage.ENTITY__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends KeyValue>)newValue);
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
			case erschemaPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				return;
			case erschemaPackage.ENTITY__COMPOSITIONS:
				getCompositions().clear();
				return;
			case erschemaPackage.ENTITY__CONSTRAINTS:
				getConstraints().clear();
				return;
			case erschemaPackage.ENTITY__DUMMY_CONSTRAINTS:
				getDummyConstraints().clear();
				return;
			case erschemaPackage.ENTITY__KEYS:
				getKeys().clear();
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
			case erschemaPackage.ENTITY__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case erschemaPackage.ENTITY__COMPOSITIONS:
				return compositions != null && !compositions.isEmpty();
			case erschemaPackage.ENTITY__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case erschemaPackage.ENTITY__DUMMY_CONSTRAINTS:
				return dummyConstraints != null && !dummyConstraints.isEmpty();
			case erschemaPackage.ENTITY__KEYS:
				return keys != null && !keys.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityImpl
