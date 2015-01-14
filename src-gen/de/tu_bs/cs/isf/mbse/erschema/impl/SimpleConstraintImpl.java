/**
 */
package de.tu_bs.cs.isf.mbse.erschema.impl;

import de.tu_bs.cs.isf.mbse.erschema.Comparative;
import de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage;
import de.tu_bs.cs.isf.mbse.erschema.Expression;
import de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.SimpleConstraintImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.SimpleConstraintImpl#getCompare <em>Compare</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.SimpleConstraintImpl#getRight <em>Right</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.SimpleConstraintImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleConstraintImpl extends MinimalEObjectImpl.Container implements SimpleConstraint {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected Expression left;

	/**
	 * The cached value of the '{@link #getCompare() <em>Compare</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompare()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparative> compare;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected Expression right;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErschemaPackage.Literals.SIMPLE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(Expression newLeft, NotificationChain msgs) {
		Expression oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErschemaPackage.SIMPLE_CONSTRAINT__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(Expression newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErschemaPackage.SIMPLE_CONSTRAINT__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErschemaPackage.SIMPLE_CONSTRAINT__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErschemaPackage.SIMPLE_CONSTRAINT__LEFT, newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comparative> getCompare() {
		if (compare == null) {
			compare = new EObjectContainmentEList<Comparative>(Comparative.class, this, ErschemaPackage.SIMPLE_CONSTRAINT__COMPARE);
		}
		return compare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(Expression newRight, NotificationChain msgs) {
		Expression oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErschemaPackage.SIMPLE_CONSTRAINT__RIGHT, oldRight, newRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(Expression newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErschemaPackage.SIMPLE_CONSTRAINT__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErschemaPackage.SIMPLE_CONSTRAINT__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErschemaPackage.SIMPLE_CONSTRAINT__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getExpression() {
		if (expression == null) {
			expression = new EObjectContainmentEList<Expression>(Expression.class, this, ErschemaPackage.SIMPLE_CONSTRAINT__EXPRESSION);
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErschemaPackage.SIMPLE_CONSTRAINT__LEFT:
				return basicSetLeft(null, msgs);
			case ErschemaPackage.SIMPLE_CONSTRAINT__COMPARE:
				return ((InternalEList<?>)getCompare()).basicRemove(otherEnd, msgs);
			case ErschemaPackage.SIMPLE_CONSTRAINT__RIGHT:
				return basicSetRight(null, msgs);
			case ErschemaPackage.SIMPLE_CONSTRAINT__EXPRESSION:
				return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
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
			case ErschemaPackage.SIMPLE_CONSTRAINT__LEFT:
				return getLeft();
			case ErschemaPackage.SIMPLE_CONSTRAINT__COMPARE:
				return getCompare();
			case ErschemaPackage.SIMPLE_CONSTRAINT__RIGHT:
				return getRight();
			case ErschemaPackage.SIMPLE_CONSTRAINT__EXPRESSION:
				return getExpression();
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
			case ErschemaPackage.SIMPLE_CONSTRAINT__LEFT:
				setLeft((Expression)newValue);
				return;
			case ErschemaPackage.SIMPLE_CONSTRAINT__COMPARE:
				getCompare().clear();
				getCompare().addAll((Collection<? extends Comparative>)newValue);
				return;
			case ErschemaPackage.SIMPLE_CONSTRAINT__RIGHT:
				setRight((Expression)newValue);
				return;
			case ErschemaPackage.SIMPLE_CONSTRAINT__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends Expression>)newValue);
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
			case ErschemaPackage.SIMPLE_CONSTRAINT__LEFT:
				setLeft((Expression)null);
				return;
			case ErschemaPackage.SIMPLE_CONSTRAINT__COMPARE:
				getCompare().clear();
				return;
			case ErschemaPackage.SIMPLE_CONSTRAINT__RIGHT:
				setRight((Expression)null);
				return;
			case ErschemaPackage.SIMPLE_CONSTRAINT__EXPRESSION:
				getExpression().clear();
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
			case ErschemaPackage.SIMPLE_CONSTRAINT__LEFT:
				return left != null;
			case ErschemaPackage.SIMPLE_CONSTRAINT__COMPARE:
				return compare != null && !compare.isEmpty();
			case ErschemaPackage.SIMPLE_CONSTRAINT__RIGHT:
				return right != null;
			case ErschemaPackage.SIMPLE_CONSTRAINT__EXPRESSION:
				return expression != null && !expression.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SimpleConstraintImpl
