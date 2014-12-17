/**
 */
package de.tu_bs.cs.isf.mbse.erschema.impl;

import de.tu_bs.cs.isf.mbse.erschema.Attribute;
import de.tu_bs.cs.isf.mbse.erschema.Composition;
import de.tu_bs.cs.isf.mbse.erschema.Constraint;
import de.tu_bs.cs.isf.mbse.erschema.DummyConstraint;
import de.tu_bs.cs.isf.mbse.erschema.Entity;
import de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.EntityImpl#getKey <em>Key</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.EntityImpl#getCompositions <em>Compositions</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.EntityImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.EntityImpl#getDummyConstraints <em>Dummy Constraints</em>}</li>
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
	 * The cached value of the '{@link #getKey() <em>Key</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> key;

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
	protected EList<Constraint> constraints;

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
		return ErschemaPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, ErschemaPackage.ENTITY__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getKey() {
		if (key == null) {
			key = new EObjectResolvingEList<Attribute>(Attribute.class, this, ErschemaPackage.ENTITY__KEY);
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Composition> getCompositions() {
		if (compositions == null) {
			compositions = new EObjectContainmentEList<Composition>(Composition.class, this, ErschemaPackage.ENTITY__COMPOSITIONS);
		}
		return compositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, ErschemaPackage.ENTITY__CONSTRAINTS);
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
			dummyConstraints = new EObjectContainmentEList<DummyConstraint>(DummyConstraint.class, this, ErschemaPackage.ENTITY__DUMMY_CONSTRAINTS);
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
			case ErschemaPackage.ENTITY__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case ErschemaPackage.ENTITY__COMPOSITIONS:
				return ((InternalEList<?>)getCompositions()).basicRemove(otherEnd, msgs);
			case ErschemaPackage.ENTITY__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case ErschemaPackage.ENTITY__DUMMY_CONSTRAINTS:
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
			case ErschemaPackage.ENTITY__ATTRIBUTES:
				return getAttributes();
			case ErschemaPackage.ENTITY__KEY:
				return getKey();
			case ErschemaPackage.ENTITY__COMPOSITIONS:
				return getCompositions();
			case ErschemaPackage.ENTITY__CONSTRAINTS:
				return getConstraints();
			case ErschemaPackage.ENTITY__DUMMY_CONSTRAINTS:
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
			case ErschemaPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case ErschemaPackage.ENTITY__KEY:
				getKey().clear();
				getKey().addAll((Collection<? extends Attribute>)newValue);
				return;
			case ErschemaPackage.ENTITY__COMPOSITIONS:
				getCompositions().clear();
				getCompositions().addAll((Collection<? extends Composition>)newValue);
				return;
			case ErschemaPackage.ENTITY__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case ErschemaPackage.ENTITY__DUMMY_CONSTRAINTS:
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
			case ErschemaPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				return;
			case ErschemaPackage.ENTITY__KEY:
				getKey().clear();
				return;
			case ErschemaPackage.ENTITY__COMPOSITIONS:
				getCompositions().clear();
				return;
			case ErschemaPackage.ENTITY__CONSTRAINTS:
				getConstraints().clear();
				return;
			case ErschemaPackage.ENTITY__DUMMY_CONSTRAINTS:
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
			case ErschemaPackage.ENTITY__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case ErschemaPackage.ENTITY__KEY:
				return key != null && !key.isEmpty();
			case ErschemaPackage.ENTITY__COMPOSITIONS:
				return compositions != null && !compositions.isEmpty();
			case ErschemaPackage.ENTITY__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case ErschemaPackage.ENTITY__DUMMY_CONSTRAINTS:
				return dummyConstraints != null && !dummyConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityImpl
