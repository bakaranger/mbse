/**
 */
package de.tu_bs.cs.isf.mbse.erschema.impl;

import de.tu_bs.cs.isf.mbse.erschema.Add;
import de.tu_bs.cs.isf.mbse.erschema.And;
import de.tu_bs.cs.isf.mbse.erschema.Attribute;
import de.tu_bs.cs.isf.mbse.erschema.Composition;
import de.tu_bs.cs.isf.mbse.erschema.Concat;
import de.tu_bs.cs.isf.mbse.erschema.Date;
import de.tu_bs.cs.isf.mbse.erschema.Div;
import de.tu_bs.cs.isf.mbse.erschema.DummyConstraint;
import de.tu_bs.cs.isf.mbse.erschema.Entity;
import de.tu_bs.cs.isf.mbse.erschema.Equals;
import de.tu_bs.cs.isf.mbse.erschema.Greater;
import de.tu_bs.cs.isf.mbse.erschema.GreaterThan;
import de.tu_bs.cs.isf.mbse.erschema.IsNot;
import de.tu_bs.cs.isf.mbse.erschema.KeyValue;
import de.tu_bs.cs.isf.mbse.erschema.Length;
import de.tu_bs.cs.isf.mbse.erschema.Like;
import de.tu_bs.cs.isf.mbse.erschema.Literal;
import de.tu_bs.cs.isf.mbse.erschema.Model;
import de.tu_bs.cs.isf.mbse.erschema.Modulo;
import de.tu_bs.cs.isf.mbse.erschema.Mul;
import de.tu_bs.cs.isf.mbse.erschema.Or;
import de.tu_bs.cs.isf.mbse.erschema.Primitive;
import de.tu_bs.cs.isf.mbse.erschema.Relation;
import de.tu_bs.cs.isf.mbse.erschema.Role;
import de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint;
import de.tu_bs.cs.isf.mbse.erschema.Smaller;
import de.tu_bs.cs.isf.mbse.erschema.SmallerThan;
import de.tu_bs.cs.isf.mbse.erschema.Sub;
import de.tu_bs.cs.isf.mbse.erschema.Text;
import de.tu_bs.cs.isf.mbse.erschema.UnaryNot;
import de.tu_bs.cs.isf.mbse.erschema.erschemaFactory;
import de.tu_bs.cs.isf.mbse.erschema.erschemaPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class erschemaFactoryImpl extends EFactoryImpl implements erschemaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static erschemaFactory init() {
		try {
			erschemaFactory theerschemaFactory = (erschemaFactory)EPackage.Registry.INSTANCE.getEFactory(erschemaPackage.eNS_URI);
			if (theerschemaFactory != null) {
				return theerschemaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new erschemaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public erschemaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case erschemaPackage.MODEL: return createModel();
			case erschemaPackage.ENTITY: return createEntity();
			case erschemaPackage.ATTRIBUTE: return createAttribute();
			case erschemaPackage.RELATION: return createRelation();
			case erschemaPackage.ROLE: return createRole();
			case erschemaPackage.COMPOSITION: return createComposition();
			case erschemaPackage.SIMPLE_CONSTRAINT: return createSimpleConstraint();
			case erschemaPackage.DUMMY_CONSTRAINT: return createDummyConstraint();
			case erschemaPackage.KEY_VALUE: return createKeyValue();
			case erschemaPackage.TEXT: return createText();
			case erschemaPackage.STRING: return createString();
			case erschemaPackage.INTEGER: return createInteger();
			case erschemaPackage.BOOLEAN: return createBoolean();
			case erschemaPackage.DOUBLE: return createDouble();
			case erschemaPackage.DATE: return createDate();
			case erschemaPackage.IS_NOT: return createIsNot();
			case erschemaPackage.EQUALS: return createEquals();
			case erschemaPackage.ADD: return createAdd();
			case erschemaPackage.MUL: return createMul();
			case erschemaPackage.SUB: return createSub();
			case erschemaPackage.DIV: return createDiv();
			case erschemaPackage.AND: return createAnd();
			case erschemaPackage.OR: return createOr();
			case erschemaPackage.MODULO: return createModulo();
			case erschemaPackage.GREATER_THAN: return createGreaterThan();
			case erschemaPackage.SMALLER: return createSmaller();
			case erschemaPackage.SMALLER_THAN: return createSmallerThan();
			case erschemaPackage.GREATER: return createGreater();
			case erschemaPackage.LIKE: return createLike();
			case erschemaPackage.LENGTH: return createLength();
			case erschemaPackage.CONCAT: return createConcat();
			case erschemaPackage.UNARY_NOT: return createUnaryNot();
			case erschemaPackage.LITERAL: return createLiteral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case erschemaPackage.PRIMITIVE:
				return createPrimitiveFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case erschemaPackage.PRIMITIVE:
				return convertPrimitiveToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleConstraint createSimpleConstraint() {
		SimpleConstraintImpl simpleConstraint = new SimpleConstraintImpl();
		return simpleConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DummyConstraint createDummyConstraint() {
		DummyConstraintImpl dummyConstraint = new DummyConstraintImpl();
		return dummyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValue createKeyValue() {
		KeyValueImpl keyValue = new KeyValueImpl();
		return keyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.tu_bs.cs.isf.mbse.erschema.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.tu_bs.cs.isf.mbse.erschema.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.tu_bs.cs.isf.mbse.erschema.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.tu_bs.cs.isf.mbse.erschema.Double createDouble() {
		DoubleImpl double_ = new DoubleImpl();
		return double_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsNot createIsNot() {
		IsNotImpl isNot = new IsNotImpl();
		return isNot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equals createEquals() {
		EqualsImpl equals = new EqualsImpl();
		return equals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Add createAdd() {
		AddImpl add = new AddImpl();
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mul createMul() {
		MulImpl mul = new MulImpl();
		return mul;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sub createSub() {
		SubImpl sub = new SubImpl();
		return sub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Div createDiv() {
		DivImpl div = new DivImpl();
		return div;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modulo createModulo() {
		ModuloImpl modulo = new ModuloImpl();
		return modulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterThan createGreaterThan() {
		GreaterThanImpl greaterThan = new GreaterThanImpl();
		return greaterThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Smaller createSmaller() {
		SmallerImpl smaller = new SmallerImpl();
		return smaller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallerThan createSmallerThan() {
		SmallerThanImpl smallerThan = new SmallerThanImpl();
		return smallerThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Greater createGreater() {
		GreaterImpl greater = new GreaterImpl();
		return greater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Like createLike() {
		LikeImpl like = new LikeImpl();
		return like;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length createLength() {
		LengthImpl length = new LengthImpl();
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concat createConcat() {
		ConcatImpl concat = new ConcatImpl();
		return concat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryNot createUnaryNot() {
		UnaryNotImpl unaryNot = new UnaryNotImpl();
		return unaryNot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primitive createPrimitiveFromString(EDataType eDataType, String initialValue) {
		Primitive result = Primitive.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public erschemaPackage geterschemaPackage() {
		return (erschemaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static erschemaPackage getPackage() {
		return erschemaPackage.eINSTANCE;
	}

} //erschemaFactoryImpl
