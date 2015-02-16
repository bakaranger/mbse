/**
 */
package de.tu_bs.cs.isf.mbse.erschema.impl;

import de.tu_bs.cs.isf.mbse.erschema.ArithmeticOperator;
import de.tu_bs.cs.isf.mbse.erschema.Attribute;
import de.tu_bs.cs.isf.mbse.erschema.Comparative;
import de.tu_bs.cs.isf.mbse.erschema.Connective;
import de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint;
import de.tu_bs.cs.isf.mbse.erschema.StringOperator;
import de.tu_bs.cs.isf.mbse.erschema.erschemaPackage;
import java.lang.Double;
import java.lang.String;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.SimpleConstraintImpl#getCompare <em>Compare</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.SimpleConstraintImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.SimpleConstraintImpl#getConnect <em>Connect</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.SimpleConstraintImpl#getStringop <em>Stringop</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.SimpleConstraintImpl#getArithmeticop <em>Arithmeticop</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.SimpleConstraintImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.SimpleConstraintImpl#getNumValue <em>Num Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleConstraintImpl extends MinimalEObjectImpl.Container implements SimpleConstraint {
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
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getConnect() <em>Connect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnect()
	 * @generated
	 * @ordered
	 */
	protected EList<Connective> connect;

	/**
	 * The cached value of the '{@link #getStringop() <em>Stringop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringop()
	 * @generated
	 * @ordered
	 */
	protected EList<StringOperator> stringop;

	/**
	 * The cached value of the '{@link #getArithmeticop() <em>Arithmeticop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArithmeticop()
	 * @generated
	 * @ordered
	 */
	protected EList<ArithmeticOperator> arithmeticop;

	/**
	 * The cached value of the '{@link #getStringValue() <em>String Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> stringValue;

	/**
	 * The cached value of the '{@link #getNumValue() <em>Num Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> numValue;

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
		return erschemaPackage.Literals.SIMPLE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comparative> getCompare() {
		if (compare == null) {
			compare = new EObjectContainmentEList<Comparative>(Comparative.class, this, erschemaPackage.SIMPLE_CONSTRAINT__COMPARE);
		}
		return compare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectResolvingEList<Attribute>(Attribute.class, this, erschemaPackage.SIMPLE_CONSTRAINT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connective> getConnect() {
		if (connect == null) {
			connect = new EObjectContainmentEList<Connective>(Connective.class, this, erschemaPackage.SIMPLE_CONSTRAINT__CONNECT);
		}
		return connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringOperator> getStringop() {
		if (stringop == null) {
			stringop = new EObjectContainmentEList<StringOperator>(StringOperator.class, this, erschemaPackage.SIMPLE_CONSTRAINT__STRINGOP);
		}
		return stringop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArithmeticOperator> getArithmeticop() {
		if (arithmeticop == null) {
			arithmeticop = new EObjectContainmentEList<ArithmeticOperator>(ArithmeticOperator.class, this, erschemaPackage.SIMPLE_CONSTRAINT__ARITHMETICOP);
		}
		return arithmeticop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStringValue() {
		if (stringValue == null) {
			stringValue = new EDataTypeUniqueEList<String>(String.class, this, erschemaPackage.SIMPLE_CONSTRAINT__STRING_VALUE);
		}
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getNumValue() {
		if (numValue == null) {
			numValue = new EDataTypeUniqueEList<Double>(Double.class, this, erschemaPackage.SIMPLE_CONSTRAINT__NUM_VALUE);
		}
		return numValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case erschemaPackage.SIMPLE_CONSTRAINT__COMPARE:
				return ((InternalEList<?>)getCompare()).basicRemove(otherEnd, msgs);
			case erschemaPackage.SIMPLE_CONSTRAINT__CONNECT:
				return ((InternalEList<?>)getConnect()).basicRemove(otherEnd, msgs);
			case erschemaPackage.SIMPLE_CONSTRAINT__STRINGOP:
				return ((InternalEList<?>)getStringop()).basicRemove(otherEnd, msgs);
			case erschemaPackage.SIMPLE_CONSTRAINT__ARITHMETICOP:
				return ((InternalEList<?>)getArithmeticop()).basicRemove(otherEnd, msgs);
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
			case erschemaPackage.SIMPLE_CONSTRAINT__COMPARE:
				return getCompare();
			case erschemaPackage.SIMPLE_CONSTRAINT__ATTRIBUTES:
				return getAttributes();
			case erschemaPackage.SIMPLE_CONSTRAINT__CONNECT:
				return getConnect();
			case erschemaPackage.SIMPLE_CONSTRAINT__STRINGOP:
				return getStringop();
			case erschemaPackage.SIMPLE_CONSTRAINT__ARITHMETICOP:
				return getArithmeticop();
			case erschemaPackage.SIMPLE_CONSTRAINT__STRING_VALUE:
				return getStringValue();
			case erschemaPackage.SIMPLE_CONSTRAINT__NUM_VALUE:
				return getNumValue();
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
			case erschemaPackage.SIMPLE_CONSTRAINT__COMPARE:
				getCompare().clear();
				getCompare().addAll((Collection<? extends Comparative>)newValue);
				return;
			case erschemaPackage.SIMPLE_CONSTRAINT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case erschemaPackage.SIMPLE_CONSTRAINT__CONNECT:
				getConnect().clear();
				getConnect().addAll((Collection<? extends Connective>)newValue);
				return;
			case erschemaPackage.SIMPLE_CONSTRAINT__STRINGOP:
				getStringop().clear();
				getStringop().addAll((Collection<? extends StringOperator>)newValue);
				return;
			case erschemaPackage.SIMPLE_CONSTRAINT__ARITHMETICOP:
				getArithmeticop().clear();
				getArithmeticop().addAll((Collection<? extends ArithmeticOperator>)newValue);
				return;
			case erschemaPackage.SIMPLE_CONSTRAINT__STRING_VALUE:
				getStringValue().clear();
				getStringValue().addAll((Collection<? extends String>)newValue);
				return;
			case erschemaPackage.SIMPLE_CONSTRAINT__NUM_VALUE:
				getNumValue().clear();
				getNumValue().addAll((Collection<? extends Double>)newValue);
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
			case erschemaPackage.SIMPLE_CONSTRAINT__COMPARE:
				getCompare().clear();
				return;
			case erschemaPackage.SIMPLE_CONSTRAINT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case erschemaPackage.SIMPLE_CONSTRAINT__CONNECT:
				getConnect().clear();
				return;
			case erschemaPackage.SIMPLE_CONSTRAINT__STRINGOP:
				getStringop().clear();
				return;
			case erschemaPackage.SIMPLE_CONSTRAINT__ARITHMETICOP:
				getArithmeticop().clear();
				return;
			case erschemaPackage.SIMPLE_CONSTRAINT__STRING_VALUE:
				getStringValue().clear();
				return;
			case erschemaPackage.SIMPLE_CONSTRAINT__NUM_VALUE:
				getNumValue().clear();
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
			case erschemaPackage.SIMPLE_CONSTRAINT__COMPARE:
				return compare != null && !compare.isEmpty();
			case erschemaPackage.SIMPLE_CONSTRAINT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case erschemaPackage.SIMPLE_CONSTRAINT__CONNECT:
				return connect != null && !connect.isEmpty();
			case erschemaPackage.SIMPLE_CONSTRAINT__STRINGOP:
				return stringop != null && !stringop.isEmpty();
			case erschemaPackage.SIMPLE_CONSTRAINT__ARITHMETICOP:
				return arithmeticop != null && !arithmeticop.isEmpty();
			case erschemaPackage.SIMPLE_CONSTRAINT__STRING_VALUE:
				return stringValue != null && !stringValue.isEmpty();
			case erschemaPackage.SIMPLE_CONSTRAINT__NUM_VALUE:
				return numValue != null && !numValue.isEmpty();
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
		result.append(" (StringValue: ");
		result.append(stringValue);
		result.append(", numValue: ");
		result.append(numValue);
		result.append(')');
		return result.toString();
	}

} //SimpleConstraintImpl
