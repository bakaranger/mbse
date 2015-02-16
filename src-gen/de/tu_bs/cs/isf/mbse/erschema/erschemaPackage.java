/**
 */
package de.tu_bs.cs.isf.mbse.erschema;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.mbse.erschema.erschemaFactory
 * @model kind="package"
 * @generated
 */
public interface erschemaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "erschema";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tu-bs.de/cs/isf/mbse/erschema";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "erschema";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	erschemaPackage eINSTANCE = de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ModelImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__RELATIONS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ElementImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.EntityImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__COMPOSITIONS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CONSTRAINTS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dummy Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DUMMY_CONSTRAINTS = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__KEYS = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.AttributeImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.RelationImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ROLES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ATTRIBUTES = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__CONSTRAINTS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dummy Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__DUMMY_CONSTRAINTS = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.RoleImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__LOWER_BOUND = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__UPPER_BOUND = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ENTITY = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.CompositionImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__ATTRIBUTES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.SimpleConstraintImpl <em>Simple Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.SimpleConstraintImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getSimpleConstraint()
	 * @generated
	 */
	int SIMPLE_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Compare</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONSTRAINT__COMPARE = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONSTRAINT__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Connect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONSTRAINT__CONNECT = 2;

	/**
	 * The feature id for the '<em><b>Stringop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONSTRAINT__STRINGOP = 3;

	/**
	 * The feature id for the '<em><b>Arithmeticop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONSTRAINT__ARITHMETICOP = 4;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONSTRAINT__STRING_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Num Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONSTRAINT__NUM_VALUE = 6;

	/**
	 * The number of structural features of the '<em>Simple Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONSTRAINT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Simple Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.DummyConstraintImpl <em>Dummy Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.DummyConstraintImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getDummyConstraint()
	 * @generated
	 */
	int DUMMY_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CONSTRAINT__CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Dummy Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dummy Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.KeyValueImpl <em>Key Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.KeyValueImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getKeyValue()
	 * @generated
	 */
	int KEY_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE__COMPOSITION = 1;

	/**
	 * The number of structural features of the '<em>Key Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Key Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.DatatypeImpl <em>Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.DatatypeImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getDatatype()
	 * @generated
	 */
	int DATATYPE = 10;

	/**
	 * The number of structural features of the '<em>Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.NumberImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 11;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATION_COUNT = DATATYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.CharSequenceImpl <em>Char Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.CharSequenceImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getCharSequence()
	 * @generated
	 */
	int CHAR_SEQUENCE = 12;

	/**
	 * The number of structural features of the '<em>Char Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Char Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_OPERATION_COUNT = DATATYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.TextImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 13;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = CHAR_SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = CHAR_SEQUENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.StringImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getString()
	 * @generated
	 */
	int STRING = 14;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = CHAR_SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = CHAR_SEQUENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.IntegerImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 15;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = NUMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.BooleanImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 16;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = DATATYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.DoubleImpl <em>Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.DoubleImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 17;

	/**
	 * The number of structural features of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OPERATION_COUNT = NUMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.DateImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 18;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = DATATYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.OperatorImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 41;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__ENTITY = 1;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.ArithmeticOperatorImpl <em>Arithmetic Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ArithmeticOperatorImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getArithmeticOperator()
	 * @generated
	 */
	int ARITHMETIC_OPERATOR = 19;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR__ATTRIBUTE = OPERATOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR__ENTITY = OPERATOR__ENTITY;

	/**
	 * The number of structural features of the '<em>Arithmetic Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arithmetic Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.LogicalOperatorImpl <em>Logical Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.LogicalOperatorImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 20;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR__ATTRIBUTE = OPERATOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR__ENTITY = OPERATOR__ENTITY;

	/**
	 * The number of structural features of the '<em>Logical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.ComparativeImpl <em>Comparative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ComparativeImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getComparative()
	 * @generated
	 */
	int COMPARATIVE = 27;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE__ATTRIBUTE = LOGICAL_OPERATOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE__ENTITY = LOGICAL_OPERATOR__ENTITY;

	/**
	 * The number of structural features of the '<em>Comparative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Comparative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.IsNotImpl <em>Is Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.IsNotImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getIsNot()
	 * @generated
	 */
	int IS_NOT = 21;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NOT__ATTRIBUTE = COMPARATIVE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NOT__ENTITY = COMPARATIVE__ENTITY;

	/**
	 * The feature id for the '<em><b>Value Int</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NOT__VALUE_INT = COMPARATIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NOT__VALUE = COMPARATIVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Is Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NOT_FEATURE_COUNT = COMPARATIVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Is Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NOT_OPERATION_COUNT = COMPARATIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.EqualsImpl <em>Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.EqualsImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getEquals()
	 * @generated
	 */
	int EQUALS = 22;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__ATTRIBUTE = COMPARATIVE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__ENTITY = COMPARATIVE__ENTITY;

	/**
	 * The feature id for the '<em><b>Value Int</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__VALUE_INT = COMPARATIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__VALUE = COMPARATIVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FEATURE_COUNT = COMPARATIVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_OPERATION_COUNT = COMPARATIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.AddImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 23;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__ATTRIBUTE = ARITHMETIC_OPERATOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__ENTITY = ARITHMETIC_OPERATOR__ENTITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__VALUE = ARITHMETIC_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = ARITHMETIC_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPERATION_COUNT = ARITHMETIC_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.MulImpl <em>Mul</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.MulImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getMul()
	 * @generated
	 */
	int MUL = 24;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL__ATTRIBUTE = ARITHMETIC_OPERATOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL__ENTITY = ARITHMETIC_OPERATOR__ENTITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL__VALUE = ARITHMETIC_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mul</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_FEATURE_COUNT = ARITHMETIC_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mul</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OPERATION_COUNT = ARITHMETIC_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.SubImpl <em>Sub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.SubImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getSub()
	 * @generated
	 */
	int SUB = 25;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__ATTRIBUTE = ARITHMETIC_OPERATOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__ENTITY = ARITHMETIC_OPERATOR__ENTITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__VALUE = ARITHMETIC_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FEATURE_COUNT = ARITHMETIC_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OPERATION_COUNT = ARITHMETIC_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.DivImpl <em>Div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.DivImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getDiv()
	 * @generated
	 */
	int DIV = 26;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__ATTRIBUTE = ARITHMETIC_OPERATOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__ENTITY = ARITHMETIC_OPERATOR__ENTITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__VALUE = ARITHMETIC_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_FEATURE_COUNT = ARITHMETIC_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_OPERATION_COUNT = ARITHMETIC_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.ConnectiveImpl <em>Connective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ConnectiveImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getConnective()
	 * @generated
	 */
	int CONNECTIVE = 28;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVE__ATTRIBUTE = LOGICAL_OPERATOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVE__ENTITY = LOGICAL_OPERATOR__ENTITY;

	/**
	 * The number of structural features of the '<em>Connective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVE_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVE_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.AndImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 29;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__ATTRIBUTE = CONNECTIVE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__ENTITY = CONNECTIVE__ENTITY;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = CONNECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = CONNECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.OrImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getOr()
	 * @generated
	 */
	int OR = 30;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__ATTRIBUTE = CONNECTIVE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__ENTITY = CONNECTIVE__ENTITY;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = CONNECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = CONNECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.ModuloImpl <em>Modulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ModuloImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getModulo()
	 * @generated
	 */
	int MODULO = 31;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__ATTRIBUTE = ARITHMETIC_OPERATOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__ENTITY = ARITHMETIC_OPERATOR__ENTITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__VALUE = ARITHMETIC_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO_FEATURE_COUNT = ARITHMETIC_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO_OPERATION_COUNT = ARITHMETIC_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.GreaterThanImpl <em>Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.GreaterThanImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getGreaterThan()
	 * @generated
	 */
	int GREATER_THAN = 32;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__ATTRIBUTE = COMPARATIVE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__ENTITY = COMPARATIVE__ENTITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__VALUE = COMPARATIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FEATURE_COUNT = COMPARATIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATION_COUNT = COMPARATIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.SmallerImpl <em>Smaller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.SmallerImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getSmaller()
	 * @generated
	 */
	int SMALLER = 33;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER__ATTRIBUTE = COMPARATIVE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER__ENTITY = COMPARATIVE__ENTITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER__VALUE = COMPARATIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Smaller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_FEATURE_COUNT = COMPARATIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Smaller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_OPERATION_COUNT = COMPARATIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.SmallerThanImpl <em>Smaller Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.SmallerThanImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getSmallerThan()
	 * @generated
	 */
	int SMALLER_THAN = 34;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_THAN__ATTRIBUTE = COMPARATIVE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_THAN__ENTITY = COMPARATIVE__ENTITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_THAN__VALUE = COMPARATIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Smaller Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_THAN_FEATURE_COUNT = COMPARATIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Smaller Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_THAN_OPERATION_COUNT = COMPARATIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.GreaterImpl <em>Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.GreaterImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getGreater()
	 * @generated
	 */
	int GREATER = 35;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__ATTRIBUTE = COMPARATIVE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__ENTITY = COMPARATIVE__ENTITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__VALUE = COMPARATIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_FEATURE_COUNT = COMPARATIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATION_COUNT = COMPARATIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.StringOperatorImpl <em>String Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.StringOperatorImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getStringOperator()
	 * @generated
	 */
	int STRING_OPERATOR = 36;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATOR__ATTRIBUTE = OPERATOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATOR__ENTITY = OPERATOR__ENTITY;

	/**
	 * The number of structural features of the '<em>String Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.LikeImpl <em>Like</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.LikeImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getLike()
	 * @generated
	 */
	int LIKE = 37;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE__ATTRIBUTE = STRING_OPERATOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE__ENTITY = STRING_OPERATOR__ENTITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE__VALUE = STRING_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE_FEATURE_COUNT = STRING_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE_OPERATION_COUNT = STRING_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.LengthImpl <em>Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.LengthImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 38;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__ATTRIBUTE = STRING_OPERATOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__ENTITY = STRING_OPERATOR__ENTITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__VALUE = STRING_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FEATURE_COUNT = STRING_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_OPERATION_COUNT = STRING_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.ConcatImpl <em>Concat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ConcatImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getConcat()
	 * @generated
	 */
	int CONCAT = 39;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT__ATTRIBUTE = STRING_OPERATOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT__ENTITY = STRING_OPERATOR__ENTITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT__VALUE = STRING_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_FEATURE_COUNT = STRING_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Concat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_OPERATION_COUNT = STRING_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.UnaryNotImpl <em>Unary Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.UnaryNotImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getUnaryNot()
	 * @generated
	 */
	int UNARY_NOT = 40;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NOT__ATTRIBUTE = CONNECTIVE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NOT__ENTITY = CONNECTIVE__ENTITY;

	/**
	 * The number of structural features of the '<em>Unary Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NOT_FEATURE_COUNT = CONNECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unary Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NOT_OPERATION_COUNT = CONNECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.LiteralImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 42;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__ATTRIBUTE = OPERATOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__ENTITY = OPERATOR__ENTITY;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VAL = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.Primitive <em>Primitive</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.Primitive
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 43;


	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema.Model#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Model#getEntities()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema.Model#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Model#getRelations()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Relations();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.erschema.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema.Entity#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compositions</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Entity#getCompositions()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Compositions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema.Entity#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Entity#getConstraints()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema.Entity#getDummyConstraints <em>Dummy Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dummy Constraints</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Entity#getDummyConstraints()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_DummyConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema.Entity#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keys</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Entity#getKeys()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Keys();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.erschema.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.erschema.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema.Relation#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Relation#getRoles()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema.Relation#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Relation#getAttributes()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema.Relation#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Relation#getConstraints()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema.Relation#getDummyConstraints <em>Dummy Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dummy Constraints</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Relation#getDummyConstraints()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_DummyConstraints();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.erschema.Role#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Role#getLowerBound()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.erschema.Role#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Role#getUpperBound()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_UpperBound();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.mbse.erschema.Role#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Role#getEntity()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Entity();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema.Composition#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Composition#getAttributes()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Attributes();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint <em>Simple Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Constraint</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint
	 * @generated
	 */
	EClass getSimpleConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getCompare <em>Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compare</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getCompare()
	 * @see #getSimpleConstraint()
	 * @generated
	 */
	EReference getSimpleConstraint_Compare();

	/**
	 * Returns the meta object for the reference list '{@link de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getAttributes()
	 * @see #getSimpleConstraint()
	 * @generated
	 */
	EReference getSimpleConstraint_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getConnect <em>Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connect</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getConnect()
	 * @see #getSimpleConstraint()
	 * @generated
	 */
	EReference getSimpleConstraint_Connect();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getStringop <em>Stringop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stringop</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getStringop()
	 * @see #getSimpleConstraint()
	 * @generated
	 */
	EReference getSimpleConstraint_Stringop();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getArithmeticop <em>Arithmeticop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arithmeticop</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getArithmeticop()
	 * @see #getSimpleConstraint()
	 * @generated
	 */
	EReference getSimpleConstraint_Arithmeticop();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>String Value</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getStringValue()
	 * @see #getSimpleConstraint()
	 * @generated
	 */
	EAttribute getSimpleConstraint_StringValue();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getNumValue <em>Num Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Num Value</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint#getNumValue()
	 * @see #getSimpleConstraint()
	 * @generated
	 */
	EAttribute getSimpleConstraint_NumValue();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.DummyConstraint <em>Dummy Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dummy Constraint</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.DummyConstraint
	 * @generated
	 */
	EClass getDummyConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.erschema.DummyConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.DummyConstraint#getConstraint()
	 * @see #getDummyConstraint()
	 * @generated
	 */
	EAttribute getDummyConstraint_Constraint();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.KeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.KeyValue
	 * @generated
	 */
	EClass getKeyValue();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.erschema.KeyValue#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.KeyValue#getAttribute()
	 * @see #getKeyValue()
	 * @generated
	 */
	EReference getKeyValue_Attribute();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.erschema.KeyValue#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composition</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.KeyValue#getComposition()
	 * @see #getKeyValue()
	 * @generated
	 */
	EReference getKeyValue_Composition();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Datatype
	 * @generated
	 */
	EClass getDatatype();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.CharSequence <em>Char Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.CharSequence
	 * @generated
	 */
	EClass getCharSequence();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Double
	 * @generated
	 */
	EClass getDouble();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.ArithmeticOperator <em>Arithmetic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Operator</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.ArithmeticOperator
	 * @generated
	 */
	EClass getArithmeticOperator();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Operator</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.LogicalOperator
	 * @generated
	 */
	EClass getLogicalOperator();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.IsNot <em>Is Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Not</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.IsNot
	 * @generated
	 */
	EClass getIsNot();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.mbse.erschema.IsNot#getValueInt <em>Value Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value Int</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.IsNot#getValueInt()
	 * @see #getIsNot()
	 * @generated
	 */
	EAttribute getIsNot_ValueInt();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.erschema.IsNot#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.IsNot#getValue()
	 * @see #getIsNot()
	 * @generated
	 */
	EAttribute getIsNot_Value();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Equals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equals</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Equals
	 * @generated
	 */
	EClass getEquals();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.mbse.erschema.Equals#getValueInt <em>Value Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value Int</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Equals#getValueInt()
	 * @see #getEquals()
	 * @generated
	 */
	EAttribute getEquals_ValueInt();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.erschema.Equals#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Equals#getValue()
	 * @see #getEquals()
	 * @generated
	 */
	EAttribute getEquals_Value();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.mbse.erschema.Add#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Add#getValue()
	 * @see #getAdd()
	 * @generated
	 */
	EAttribute getAdd_Value();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Mul <em>Mul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mul</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Mul
	 * @generated
	 */
	EClass getMul();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.mbse.erschema.Mul#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Mul#getValue()
	 * @see #getMul()
	 * @generated
	 */
	EAttribute getMul_Value();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Sub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Sub
	 * @generated
	 */
	EClass getSub();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.mbse.erschema.Sub#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Sub#getValue()
	 * @see #getSub()
	 * @generated
	 */
	EAttribute getSub_Value();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Div
	 * @generated
	 */
	EClass getDiv();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.mbse.erschema.Div#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Div#getValue()
	 * @see #getDiv()
	 * @generated
	 */
	EAttribute getDiv_Value();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Comparative <em>Comparative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparative</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Comparative
	 * @generated
	 */
	EClass getComparative();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Connective <em>Connective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connective</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Connective
	 * @generated
	 */
	EClass getConnective();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Modulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modulo</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Modulo
	 * @generated
	 */
	EClass getModulo();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.mbse.erschema.Modulo#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Modulo#getValue()
	 * @see #getModulo()
	 * @generated
	 */
	EAttribute getModulo_Value();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.GreaterThan
	 * @generated
	 */
	EClass getGreaterThan();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.mbse.erschema.GreaterThan#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.GreaterThan#getValue()
	 * @see #getGreaterThan()
	 * @generated
	 */
	EAttribute getGreaterThan_Value();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Smaller <em>Smaller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smaller</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Smaller
	 * @generated
	 */
	EClass getSmaller();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.mbse.erschema.Smaller#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Smaller#getValue()
	 * @see #getSmaller()
	 * @generated
	 */
	EAttribute getSmaller_Value();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.SmallerThan <em>Smaller Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smaller Than</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.SmallerThan
	 * @generated
	 */
	EClass getSmallerThan();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.mbse.erschema.SmallerThan#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.SmallerThan#getValue()
	 * @see #getSmallerThan()
	 * @generated
	 */
	EAttribute getSmallerThan_Value();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Greater
	 * @generated
	 */
	EClass getGreater();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.mbse.erschema.Greater#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Greater#getValue()
	 * @see #getGreater()
	 * @generated
	 */
	EAttribute getGreater_Value();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.StringOperator <em>String Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Operator</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.StringOperator
	 * @generated
	 */
	EClass getStringOperator();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Like <em>Like</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Like</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Like
	 * @generated
	 */
	EClass getLike();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.erschema.Like#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Like#getValue()
	 * @see #getLike()
	 * @generated
	 */
	EAttribute getLike_Value();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Length
	 * @generated
	 */
	EClass getLength();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.erschema.Length#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Length#getValue()
	 * @see #getLength()
	 * @generated
	 */
	EAttribute getLength_Value();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Concat <em>Concat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concat</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Concat
	 * @generated
	 */
	EClass getConcat();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.erschema.Concat#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Concat#getValue()
	 * @see #getConcat()
	 * @generated
	 */
	EAttribute getConcat_Value();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.UnaryNot <em>Unary Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Not</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.UnaryNot
	 * @generated
	 */
	EClass getUnaryNot();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the reference list '{@link de.tu_bs.cs.isf.mbse.erschema.Operator#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attribute</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Operator#getAttribute()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Attribute();

	/**
	 * Returns the meta object for the reference list '{@link de.tu_bs.cs.isf.mbse.erschema.Operator#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entity</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Operator#getEntity()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Entity();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.erschema.Literal#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Literal#getVal()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Val();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.mbse.erschema.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Primitive
	 * @generated
	 */
	EEnum getPrimitive();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	erschemaFactory geterschemaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ModelImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ENTITIES = eINSTANCE.getModel_Entities();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__RELATIONS = eINSTANCE.getModel_Relations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.EntityImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Compositions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__COMPOSITIONS = eINSTANCE.getEntity_Compositions();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__CONSTRAINTS = eINSTANCE.getEntity_Constraints();

		/**
		 * The meta object literal for the '<em><b>Dummy Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__DUMMY_CONSTRAINTS = eINSTANCE.getEntity_DummyConstraints();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__KEYS = eINSTANCE.getEntity_Keys();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.AttributeImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ElementImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.RelationImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__ROLES = eINSTANCE.getRelation_Roles();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__ATTRIBUTES = eINSTANCE.getRelation_Attributes();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__CONSTRAINTS = eINSTANCE.getRelation_Constraints();

		/**
		 * The meta object literal for the '<em><b>Dummy Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__DUMMY_CONSTRAINTS = eINSTANCE.getRelation_DummyConstraints();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.RoleImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__LOWER_BOUND = eINSTANCE.getRole_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__UPPER_BOUND = eINSTANCE.getRole_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ENTITY = eINSTANCE.getRole_Entity();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.CompositionImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__ATTRIBUTES = eINSTANCE.getComposition_Attributes();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.SimpleConstraintImpl <em>Simple Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.SimpleConstraintImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getSimpleConstraint()
		 * @generated
		 */
		EClass SIMPLE_CONSTRAINT = eINSTANCE.getSimpleConstraint();

		/**
		 * The meta object literal for the '<em><b>Compare</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CONSTRAINT__COMPARE = eINSTANCE.getSimpleConstraint_Compare();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CONSTRAINT__ATTRIBUTES = eINSTANCE.getSimpleConstraint_Attributes();

		/**
		 * The meta object literal for the '<em><b>Connect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CONSTRAINT__CONNECT = eINSTANCE.getSimpleConstraint_Connect();

		/**
		 * The meta object literal for the '<em><b>Stringop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CONSTRAINT__STRINGOP = eINSTANCE.getSimpleConstraint_Stringop();

		/**
		 * The meta object literal for the '<em><b>Arithmeticop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CONSTRAINT__ARITHMETICOP = eINSTANCE.getSimpleConstraint_Arithmeticop();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_CONSTRAINT__STRING_VALUE = eINSTANCE.getSimpleConstraint_StringValue();

		/**
		 * The meta object literal for the '<em><b>Num Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_CONSTRAINT__NUM_VALUE = eINSTANCE.getSimpleConstraint_NumValue();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.DummyConstraintImpl <em>Dummy Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.DummyConstraintImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getDummyConstraint()
		 * @generated
		 */
		EClass DUMMY_CONSTRAINT = eINSTANCE.getDummyConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUMMY_CONSTRAINT__CONSTRAINT = eINSTANCE.getDummyConstraint_Constraint();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.KeyValueImpl <em>Key Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.KeyValueImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getKeyValue()
		 * @generated
		 */
		EClass KEY_VALUE = eINSTANCE.getKeyValue();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_VALUE__ATTRIBUTE = eINSTANCE.getKeyValue_Attribute();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_VALUE__COMPOSITION = eINSTANCE.getKeyValue_Composition();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.DatatypeImpl <em>Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.DatatypeImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getDatatype()
		 * @generated
		 */
		EClass DATATYPE = eINSTANCE.getDatatype();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.NumberImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.CharSequenceImpl <em>Char Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.CharSequenceImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getCharSequence()
		 * @generated
		 */
		EClass CHAR_SEQUENCE = eINSTANCE.getCharSequence();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.TextImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.StringImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.IntegerImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.BooleanImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.DoubleImpl <em>Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.DoubleImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getDouble()
		 * @generated
		 */
		EClass DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.DateImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.ArithmeticOperatorImpl <em>Arithmetic Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ArithmeticOperatorImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getArithmeticOperator()
		 * @generated
		 */
		EClass ARITHMETIC_OPERATOR = eINSTANCE.getArithmeticOperator();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.LogicalOperatorImpl <em>Logical Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.LogicalOperatorImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getLogicalOperator()
		 * @generated
		 */
		EClass LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.IsNotImpl <em>Is Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.IsNotImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getIsNot()
		 * @generated
		 */
		EClass IS_NOT = eINSTANCE.getIsNot();

		/**
		 * The meta object literal for the '<em><b>Value Int</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_NOT__VALUE_INT = eINSTANCE.getIsNot_ValueInt();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_NOT__VALUE = eINSTANCE.getIsNot_Value();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.EqualsImpl <em>Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.EqualsImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getEquals()
		 * @generated
		 */
		EClass EQUALS = eINSTANCE.getEquals();

		/**
		 * The meta object literal for the '<em><b>Value Int</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUALS__VALUE_INT = eINSTANCE.getEquals_ValueInt();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUALS__VALUE = eINSTANCE.getEquals_Value();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.AddImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD__VALUE = eINSTANCE.getAdd_Value();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.MulImpl <em>Mul</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.MulImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getMul()
		 * @generated
		 */
		EClass MUL = eINSTANCE.getMul();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUL__VALUE = eINSTANCE.getMul_Value();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.SubImpl <em>Sub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.SubImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getSub()
		 * @generated
		 */
		EClass SUB = eINSTANCE.getSub();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB__VALUE = eINSTANCE.getSub_Value();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.DivImpl <em>Div</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.DivImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getDiv()
		 * @generated
		 */
		EClass DIV = eINSTANCE.getDiv();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIV__VALUE = eINSTANCE.getDiv_Value();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.ComparativeImpl <em>Comparative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ComparativeImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getComparative()
		 * @generated
		 */
		EClass COMPARATIVE = eINSTANCE.getComparative();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.ConnectiveImpl <em>Connective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ConnectiveImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getConnective()
		 * @generated
		 */
		EClass CONNECTIVE = eINSTANCE.getConnective();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.AndImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.OrImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.ModuloImpl <em>Modulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ModuloImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getModulo()
		 * @generated
		 */
		EClass MODULO = eINSTANCE.getModulo();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULO__VALUE = eINSTANCE.getModulo_Value();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.GreaterThanImpl <em>Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.GreaterThanImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getGreaterThan()
		 * @generated
		 */
		EClass GREATER_THAN = eINSTANCE.getGreaterThan();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GREATER_THAN__VALUE = eINSTANCE.getGreaterThan_Value();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.SmallerImpl <em>Smaller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.SmallerImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getSmaller()
		 * @generated
		 */
		EClass SMALLER = eINSTANCE.getSmaller();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALLER__VALUE = eINSTANCE.getSmaller_Value();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.SmallerThanImpl <em>Smaller Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.SmallerThanImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getSmallerThan()
		 * @generated
		 */
		EClass SMALLER_THAN = eINSTANCE.getSmallerThan();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALLER_THAN__VALUE = eINSTANCE.getSmallerThan_Value();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.GreaterImpl <em>Greater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.GreaterImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getGreater()
		 * @generated
		 */
		EClass GREATER = eINSTANCE.getGreater();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GREATER__VALUE = eINSTANCE.getGreater_Value();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.StringOperatorImpl <em>String Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.StringOperatorImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getStringOperator()
		 * @generated
		 */
		EClass STRING_OPERATOR = eINSTANCE.getStringOperator();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.LikeImpl <em>Like</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.LikeImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getLike()
		 * @generated
		 */
		EClass LIKE = eINSTANCE.getLike();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIKE__VALUE = eINSTANCE.getLike_Value();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.LengthImpl <em>Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.LengthImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getLength()
		 * @generated
		 */
		EClass LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENGTH__VALUE = eINSTANCE.getLength_Value();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.ConcatImpl <em>Concat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ConcatImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getConcat()
		 * @generated
		 */
		EClass CONCAT = eINSTANCE.getConcat();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCAT__VALUE = eINSTANCE.getConcat_Value();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.UnaryNotImpl <em>Unary Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.UnaryNotImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getUnaryNot()
		 * @generated
		 */
		EClass UNARY_NOT = eINSTANCE.getUnaryNot();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.OperatorImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__ATTRIBUTE = eINSTANCE.getOperator_Attribute();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__ENTITY = eINSTANCE.getOperator_Entity();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.LiteralImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VAL = eINSTANCE.getLiteral_Val();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.Primitive <em>Primitive</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.Primitive
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.erschemaPackageImpl#getPrimitive()
		 * @generated
		 */
		EEnum PRIMITIVE = eINSTANCE.getPrimitive();

	}

} //erschemaPackage
