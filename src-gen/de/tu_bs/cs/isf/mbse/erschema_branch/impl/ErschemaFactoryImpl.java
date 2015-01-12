/**
 */
package de.tu_bs.cs.isf.mbse.erschema_branch.impl;

import de.tu_bs.cs.isf.mbse.erschema_branch.Add;
import de.tu_bs.cs.isf.mbse.erschema_branch.And;
import de.tu_bs.cs.isf.mbse.erschema_branch.Attribute;
import de.tu_bs.cs.isf.mbse.erschema_branch.Composition;
import de.tu_bs.cs.isf.mbse.erschema_branch.Concat;
import de.tu_bs.cs.isf.mbse.erschema_branch.Date;
import de.tu_bs.cs.isf.mbse.erschema_branch.Div;
import de.tu_bs.cs.isf.mbse.erschema_branch.DummyConstraint;
import de.tu_bs.cs.isf.mbse.erschema_branch.Entity;
import de.tu_bs.cs.isf.mbse.erschema_branch.Equals;
import de.tu_bs.cs.isf.mbse.erschema_branch.ErschemaFactory;
import de.tu_bs.cs.isf.mbse.erschema_branch.ErschemaPackage;
import de.tu_bs.cs.isf.mbse.erschema_branch.Expression;
import de.tu_bs.cs.isf.mbse.erschema_branch.Greater;
import de.tu_bs.cs.isf.mbse.erschema_branch.GreaterThan;
import de.tu_bs.cs.isf.mbse.erschema_branch.IsNot;
import de.tu_bs.cs.isf.mbse.erschema_branch.KeyValue;
import de.tu_bs.cs.isf.mbse.erschema_branch.Length;
import de.tu_bs.cs.isf.mbse.erschema_branch.Like;
import de.tu_bs.cs.isf.mbse.erschema_branch.Literal;
import de.tu_bs.cs.isf.mbse.erschema_branch.Model;
import de.tu_bs.cs.isf.mbse.erschema_branch.Modulo;
import de.tu_bs.cs.isf.mbse.erschema_branch.Mul;
import de.tu_bs.cs.isf.mbse.erschema_branch.Or;
import de.tu_bs.cs.isf.mbse.erschema_branch.Relation;
import de.tu_bs.cs.isf.mbse.erschema_branch.Role;
import de.tu_bs.cs.isf.mbse.erschema_branch.SimpleConstraint;
import de.tu_bs.cs.isf.mbse.erschema_branch.Smaller;
import de.tu_bs.cs.isf.mbse.erschema_branch.SmallerThan;
import de.tu_bs.cs.isf.mbse.erschema_branch.Sub;
import de.tu_bs.cs.isf.mbse.erschema_branch.Text;
import de.tu_bs.cs.isf.mbse.erschema_branch.UnaryNot;

import org.eclipse.emf.ecore.EClass;
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
public class ErschemaFactoryImpl extends EFactoryImpl implements ErschemaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ErschemaFactory init() {
		try {
			ErschemaFactory theErschemaFactory = (ErschemaFactory)EPackage.Registry.INSTANCE.getEFactory(ErschemaPackage.eNS_URI);
			if (theErschemaFactory != null) {
				return theErschemaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ErschemaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErschemaFactoryImpl() {
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
			case ErschemaPackage.MODEL: return createModel();
			case ErschemaPackage.ENTITY: return createEntity();
			case ErschemaPackage.ATTRIBUTE: return createAttribute();
			case ErschemaPackage.RELATION: return createRelation();
			case ErschemaPackage.ROLE: return createRole();
			case ErschemaPackage.COMPOSITION: return createComposition();
			case ErschemaPackage.SIMPLE_CONSTRAINT: return createSimpleConstraint();
			case ErschemaPackage.DUMMY_CONSTRAINT: return createDummyConstraint();
			case ErschemaPackage.KEY_VALUE: return createKeyValue();
			case ErschemaPackage.TEXT: return createText();
			case ErschemaPackage.STRING: return createString();
			case ErschemaPackage.INTEGER: return createInteger();
			case ErschemaPackage.BOOLEAN: return createBoolean();
			case ErschemaPackage.DOUBLE: return createDouble();
			case ErschemaPackage.DATE: return createDate();
			case ErschemaPackage.EXPRESSION: return createExpression();
			case ErschemaPackage.IS_NOT: return createIsNot();
			case ErschemaPackage.EQUALS: return createEquals();
			case ErschemaPackage.ADD: return createAdd();
			case ErschemaPackage.MUL: return createMul();
			case ErschemaPackage.SUB: return createSub();
			case ErschemaPackage.DIV: return createDiv();
			case ErschemaPackage.AND: return createAnd();
			case ErschemaPackage.OR: return createOr();
			case ErschemaPackage.MODULO: return createModulo();
			case ErschemaPackage.GREATER_THAN: return createGreaterThan();
			case ErschemaPackage.SMALLER: return createSmaller();
			case ErschemaPackage.SMALLER_THAN: return createSmallerThan();
			case ErschemaPackage.GREATER: return createGreater();
			case ErschemaPackage.LIKE: return createLike();
			case ErschemaPackage.LENGTH: return createLength();
			case ErschemaPackage.CONCAT: return createConcat();
			case ErschemaPackage.UNARY_NOT: return createUnaryNot();
			case ErschemaPackage.LITERAL: return createLiteral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public de.tu_bs.cs.isf.mbse.erschema_branch.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.tu_bs.cs.isf.mbse.erschema_branch.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.tu_bs.cs.isf.mbse.erschema_branch.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.tu_bs.cs.isf.mbse.erschema_branch.Double createDouble() {
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
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
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
	public ErschemaPackage getErschemaPackage() {
		return (ErschemaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ErschemaPackage getPackage() {
		return ErschemaPackage.eINSTANCE;
	}

} //ErschemaFactoryImpl
