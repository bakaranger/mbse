/**
 */
package de.tu_bs.cs.isf.mbse.erschema.impl;

import de.tu_bs.cs.isf.mbse.erschema.BinaryOperator;
import de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage;
import de.tu_bs.cs.isf.mbse.erschema.LogicalBinaryOperator;
import de.tu_bs.cs.isf.mbse.erschema.Predicate;
import de.tu_bs.cs.isf.mbse.erschema.Term;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.PredicateImpl#getTerms <em>Terms</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.PredicateImpl#getLop <em>Lop</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.PredicateImpl#getBop <em>Bop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PredicateImpl extends MinimalEObjectImpl.Container implements Predicate {
	/**
	 * The cached value of the '{@link #getTerms() <em>Terms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> terms;

	/**
	 * The default value of the '{@link #getLop() <em>Lop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLop()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalBinaryOperator LOP_EDEFAULT = LogicalBinaryOperator.OR;

	/**
	 * The cached value of the '{@link #getLop() <em>Lop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLop()
	 * @generated
	 * @ordered
	 */
	protected LogicalBinaryOperator lop = LOP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBop() <em>Bop</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBop()
	 * @generated
	 * @ordered
	 */
	protected EList<BinaryOperator> bop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErschemaPackage.Literals.PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Term> getTerms() {
		if (terms == null) {
			terms = new EObjectContainmentEList<Term>(Term.class, this, ErschemaPackage.PREDICATE__TERMS);
		}
		return terms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalBinaryOperator getLop() {
		return lop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLop(LogicalBinaryOperator newLop) {
		LogicalBinaryOperator oldLop = lop;
		lop = newLop == null ? LOP_EDEFAULT : newLop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErschemaPackage.PREDICATE__LOP, oldLop, lop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BinaryOperator> getBop() {
		if (bop == null) {
			bop = new EDataTypeUniqueEList<BinaryOperator>(BinaryOperator.class, this, ErschemaPackage.PREDICATE__BOP);
		}
		return bop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErschemaPackage.PREDICATE__TERMS:
				return ((InternalEList<?>)getTerms()).basicRemove(otherEnd, msgs);
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
			case ErschemaPackage.PREDICATE__TERMS:
				return getTerms();
			case ErschemaPackage.PREDICATE__LOP:
				return getLop();
			case ErschemaPackage.PREDICATE__BOP:
				return getBop();
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
			case ErschemaPackage.PREDICATE__TERMS:
				getTerms().clear();
				getTerms().addAll((Collection<? extends Term>)newValue);
				return;
			case ErschemaPackage.PREDICATE__LOP:
				setLop((LogicalBinaryOperator)newValue);
				return;
			case ErschemaPackage.PREDICATE__BOP:
				getBop().clear();
				getBop().addAll((Collection<? extends BinaryOperator>)newValue);
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
			case ErschemaPackage.PREDICATE__TERMS:
				getTerms().clear();
				return;
			case ErschemaPackage.PREDICATE__LOP:
				setLop(LOP_EDEFAULT);
				return;
			case ErschemaPackage.PREDICATE__BOP:
				getBop().clear();
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
			case ErschemaPackage.PREDICATE__TERMS:
				return terms != null && !terms.isEmpty();
			case ErschemaPackage.PREDICATE__LOP:
				return lop != LOP_EDEFAULT;
			case ErschemaPackage.PREDICATE__BOP:
				return bop != null && !bop.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lop: ");
		result.append(lop);
		result.append(", bop: ");
		result.append(bop);
		result.append(')');
		return result.toString();
	}

} //PredicateImpl
