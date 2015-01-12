/**
 */
package de.tu_bs.cs.isf.mbse.erschema_branch;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see de.tu_bs.cs.isf.mbse.erschema_branch.ErschemaFactory
 * @model kind="package"
 * @generated
 */
public interface ErschemaPackage extends EPackage {
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
	ErschemaPackage eINSTANCE = de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ModelImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getModel()
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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ElementImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getElement()
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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.EntityImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getEntity()
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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.AttributeImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getAttribute()
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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.RelationImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getRelation()
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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.RoleImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getRole()
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
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ENTITY = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__UPPER_BOUND = ELEMENT_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.CompositionImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getComposition()
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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.SimpleConstraintImpl <em>Simple Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.SimpleConstraintImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getSimpleConstraint()
	 * @generated
	 */
	int SIMPLE_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONSTRAINT__LEFT = 0;

	/**
	 * The feature id for the '<em><b>Compare</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONSTRAINT__COMPARE = 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONSTRAINT__RIGHT = 2;

	/**
	 * The number of structural features of the '<em>Simple Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Simple Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.DummyConstraintImpl <em>Dummy Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.DummyConstraintImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getDummyConstraint()
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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.KeyValueImpl <em>Key Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.KeyValueImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getKeyValue()
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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.DatatypeImpl <em>Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.DatatypeImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getDatatype()
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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.NumberImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getNumber()
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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.CharSequenceImpl <em>Char Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.CharSequenceImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getCharSequence()
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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.TextImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getText()
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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.StringImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getString()
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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.IntegerImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getInteger()
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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.BooleanImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getBoolean()
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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.DoubleImpl <em>Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.DoubleImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getDouble()
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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.DateImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getDate()
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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ExpressionImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OPERATORS = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.OperatorImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 42;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__LITERALS = 1;

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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.ArithmeticOperatorImpl <em>Arithmetic Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ArithmeticOperatorImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getArithmeticOperator()
	 * @generated
	 */
	int ARITHMETIC_OPERATOR = 20;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR__ATTRIBUTES = OPERATOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR__LITERALS = OPERATOR__LITERALS;

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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.LogicalOperatorImpl <em>Logical Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.LogicalOperatorImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 21;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR__ATTRIBUTES = OPERATOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR__LITERALS = OPERATOR__LITERALS;

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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.ComparativeImpl <em>Comparative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ComparativeImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getComparative()
	 * @generated
	 */
	int COMPARATIVE = 28;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE__ATTRIBUTES = LOGICAL_OPERATOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE__LITERALS = LOGICAL_OPERATOR__LITERALS;

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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.IsNotImpl <em>Is Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.IsNotImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getIsNot()
	 * @generated
	 */
	int IS_NOT = 22;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NOT__ATTRIBUTES = COMPARATIVE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NOT__LITERALS = COMPARATIVE__LITERALS;

	/**
	 * The number of structural features of the '<em>Is Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NOT_FEATURE_COUNT = COMPARATIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NOT_OPERATION_COUNT = COMPARATIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.EqualsImpl <em>Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.EqualsImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getEquals()
	 * @generated
	 */
	int EQUALS = 23;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__ATTRIBUTES = COMPARATIVE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__LITERALS = COMPARATIVE__LITERALS;

	/**
	 * The number of structural features of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FEATURE_COUNT = COMPARATIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_OPERATION_COUNT = COMPARATIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.AddImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 24;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__ATTRIBUTES = ARITHMETIC_OPERATOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__LITERALS = ARITHMETIC_OPERATOR__LITERALS;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = ARITHMETIC_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPERATION_COUNT = ARITHMETIC_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.MulImpl <em>Mul</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.MulImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getMul()
	 * @generated
	 */
	int MUL = 25;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL__ATTRIBUTES = ARITHMETIC_OPERATOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL__LITERALS = ARITHMETIC_OPERATOR__LITERALS;

	/**
	 * The number of structural features of the '<em>Mul</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_FEATURE_COUNT = ARITHMETIC_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mul</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OPERATION_COUNT = ARITHMETIC_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.SubImpl <em>Sub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.SubImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getSub()
	 * @generated
	 */
	int SUB = 26;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__ATTRIBUTES = ARITHMETIC_OPERATOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__LITERALS = ARITHMETIC_OPERATOR__LITERALS;

	/**
	 * The number of structural features of the '<em>Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FEATURE_COUNT = ARITHMETIC_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OPERATION_COUNT = ARITHMETIC_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.DivImpl <em>Div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.DivImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getDiv()
	 * @generated
	 */
	int DIV = 27;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__ATTRIBUTES = ARITHMETIC_OPERATOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__LITERALS = ARITHMETIC_OPERATOR__LITERALS;

	/**
	 * The number of structural features of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_FEATURE_COUNT = ARITHMETIC_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_OPERATION_COUNT = ARITHMETIC_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.ConnectiveImpl <em>Connective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ConnectiveImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getConnective()
	 * @generated
	 */
	int CONNECTIVE = 29;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVE__ATTRIBUTES = LOGICAL_OPERATOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVE__LITERALS = LOGICAL_OPERATOR__LITERALS;

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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.AndImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 30;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__ATTRIBUTES = CONNECTIVE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LITERALS = CONNECTIVE__LITERALS;

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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.OrImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getOr()
	 * @generated
	 */
	int OR = 31;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__ATTRIBUTES = CONNECTIVE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LITERALS = CONNECTIVE__LITERALS;

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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.ModuloImpl <em>Modulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ModuloImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getModulo()
	 * @generated
	 */
	int MODULO = 32;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__ATTRIBUTES = ARITHMETIC_OPERATOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__LITERALS = ARITHMETIC_OPERATOR__LITERALS;

	/**
	 * The number of structural features of the '<em>Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO_FEATURE_COUNT = ARITHMETIC_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO_OPERATION_COUNT = ARITHMETIC_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.GreaterThanImpl <em>Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.GreaterThanImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getGreaterThan()
	 * @generated
	 */
	int GREATER_THAN = 33;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__ATTRIBUTES = COMPARATIVE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__LITERALS = COMPARATIVE__LITERALS;

	/**
	 * The number of structural features of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FEATURE_COUNT = COMPARATIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATION_COUNT = COMPARATIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.SmallerImpl <em>Smaller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.SmallerImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getSmaller()
	 * @generated
	 */
	int SMALLER = 34;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER__ATTRIBUTES = COMPARATIVE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER__LITERALS = COMPARATIVE__LITERALS;

	/**
	 * The number of structural features of the '<em>Smaller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_FEATURE_COUNT = COMPARATIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Smaller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_OPERATION_COUNT = COMPARATIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.SmallerThanImpl <em>Smaller Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.SmallerThanImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getSmallerThan()
	 * @generated
	 */
	int SMALLER_THAN = 35;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_THAN__ATTRIBUTES = COMPARATIVE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_THAN__LITERALS = COMPARATIVE__LITERALS;

	/**
	 * The number of structural features of the '<em>Smaller Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_THAN_FEATURE_COUNT = COMPARATIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Smaller Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_THAN_OPERATION_COUNT = COMPARATIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.GreaterImpl <em>Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.GreaterImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getGreater()
	 * @generated
	 */
	int GREATER = 36;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__ATTRIBUTES = COMPARATIVE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__LITERALS = COMPARATIVE__LITERALS;

	/**
	 * The number of structural features of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_FEATURE_COUNT = COMPARATIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATION_COUNT = COMPARATIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.StringOperatorImpl <em>String Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.StringOperatorImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getStringOperator()
	 * @generated
	 */
	int STRING_OPERATOR = 37;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATOR__ATTRIBUTES = OPERATOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATOR__LITERALS = OPERATOR__LITERALS;

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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.LikeImpl <em>Like</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.LikeImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getLike()
	 * @generated
	 */
	int LIKE = 38;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE__ATTRIBUTES = STRING_OPERATOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE__LITERALS = STRING_OPERATOR__LITERALS;

	/**
	 * The number of structural features of the '<em>Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE_FEATURE_COUNT = STRING_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE_OPERATION_COUNT = STRING_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.LengthImpl <em>Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.LengthImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 39;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__ATTRIBUTES = STRING_OPERATOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__LITERALS = STRING_OPERATOR__LITERALS;

	/**
	 * The number of structural features of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FEATURE_COUNT = STRING_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_OPERATION_COUNT = STRING_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.ConcatImpl <em>Concat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ConcatImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getConcat()
	 * @generated
	 */
	int CONCAT = 40;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT__ATTRIBUTES = STRING_OPERATOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT__LITERALS = STRING_OPERATOR__LITERALS;

	/**
	 * The number of structural features of the '<em>Concat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_FEATURE_COUNT = STRING_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Concat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_OPERATION_COUNT = STRING_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.UnaryNotImpl <em>Unary Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.UnaryNotImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getUnaryNot()
	 * @generated
	 */
	int UNARY_NOT = 41;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NOT__ATTRIBUTES = CONNECTIVE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NOT__LITERALS = CONNECTIVE__LITERALS;

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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.LiteralImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 43;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VAL = 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Model#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Model#getEntities()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Model#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Model#getRelations()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Relations();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Entity#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compositions</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Entity#getCompositions()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Compositions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Entity#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Entity#getConstraints()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Entity#getDummyConstraints <em>Dummy Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dummy Constraints</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Entity#getDummyConstraints()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_DummyConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Entity#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keys</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Entity#getKeys()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Keys();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Relation#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Relation#getRoles()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Relation#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Relation#getAttributes()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Relation#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Relation#getConstraints()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Relation#getDummyConstraints <em>Dummy Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dummy Constraints</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Relation#getDummyConstraints()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_DummyConstraints();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Role#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Role#getLowerBound()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Role#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Role#getEntity()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Entity();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Role#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Role#getUpperBound()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_UpperBound();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Composition#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Composition#getAttributes()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Attributes();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.SimpleConstraint <em>Simple Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Constraint</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.SimpleConstraint
	 * @generated
	 */
	EClass getSimpleConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.erschema_branch.SimpleConstraint#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.SimpleConstraint#getLeft()
	 * @see #getSimpleConstraint()
	 * @generated
	 */
	EReference getSimpleConstraint_Left();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema_branch.SimpleConstraint#getCompare <em>Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compare</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.SimpleConstraint#getCompare()
	 * @see #getSimpleConstraint()
	 * @generated
	 */
	EReference getSimpleConstraint_Compare();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.erschema_branch.SimpleConstraint#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.SimpleConstraint#getRight()
	 * @see #getSimpleConstraint()
	 * @generated
	 */
	EReference getSimpleConstraint_Right();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.DummyConstraint <em>Dummy Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dummy Constraint</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.DummyConstraint
	 * @generated
	 */
	EClass getDummyConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.erschema_branch.DummyConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.DummyConstraint#getConstraint()
	 * @see #getDummyConstraint()
	 * @generated
	 */
	EAttribute getDummyConstraint_Constraint();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.KeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.KeyValue
	 * @generated
	 */
	EClass getKeyValue();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.erschema_branch.KeyValue#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.KeyValue#getAttribute()
	 * @see #getKeyValue()
	 * @generated
	 */
	EReference getKeyValue_Attribute();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.erschema_branch.KeyValue#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composition</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.KeyValue#getComposition()
	 * @see #getKeyValue()
	 * @generated
	 */
	EReference getKeyValue_Composition();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Datatype
	 * @generated
	 */
	EClass getDatatype();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.CharSequence <em>Char Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.CharSequence
	 * @generated
	 */
	EClass getCharSequence();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Double
	 * @generated
	 */
	EClass getDouble();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Expression#getOperators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operators</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Expression#getOperators()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Operators();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.ArithmeticOperator <em>Arithmetic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Operator</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.ArithmeticOperator
	 * @generated
	 */
	EClass getArithmeticOperator();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Operator</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.LogicalOperator
	 * @generated
	 */
	EClass getLogicalOperator();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.IsNot <em>Is Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Not</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.IsNot
	 * @generated
	 */
	EClass getIsNot();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Equals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equals</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Equals
	 * @generated
	 */
	EClass getEquals();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Mul <em>Mul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mul</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Mul
	 * @generated
	 */
	EClass getMul();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Sub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Sub
	 * @generated
	 */
	EClass getSub();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Div
	 * @generated
	 */
	EClass getDiv();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Comparative <em>Comparative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparative</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Comparative
	 * @generated
	 */
	EClass getComparative();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Connective <em>Connective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connective</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Connective
	 * @generated
	 */
	EClass getConnective();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Modulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modulo</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Modulo
	 * @generated
	 */
	EClass getModulo();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.GreaterThan
	 * @generated
	 */
	EClass getGreaterThan();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Smaller <em>Smaller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smaller</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Smaller
	 * @generated
	 */
	EClass getSmaller();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.SmallerThan <em>Smaller Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smaller Than</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.SmallerThan
	 * @generated
	 */
	EClass getSmallerThan();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Greater
	 * @generated
	 */
	EClass getGreater();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.StringOperator <em>String Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Operator</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.StringOperator
	 * @generated
	 */
	EClass getStringOperator();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Like <em>Like</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Like</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Like
	 * @generated
	 */
	EClass getLike();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Length
	 * @generated
	 */
	EClass getLength();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Concat <em>Concat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concat</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Concat
	 * @generated
	 */
	EClass getConcat();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.UnaryNot <em>Unary Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Not</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.UnaryNot
	 * @generated
	 */
	EClass getUnaryNot();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Operator#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Operator#getAttributes()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Operator#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Operator#getLiterals()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Literals();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.erschema_branch.Literal#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema_branch.Literal#getVal()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Val();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ErschemaFactory getErschemaFactory();

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
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ModelImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getModel()
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
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.EntityImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getEntity()
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
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.AttributeImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getAttribute()
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
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ElementImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getElement()
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
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.RelationImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getRelation()
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
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.RoleImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getRole()
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
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ENTITY = eINSTANCE.getRole_Entity();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__UPPER_BOUND = eINSTANCE.getRole_UpperBound();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.CompositionImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getComposition()
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
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.SimpleConstraintImpl <em>Simple Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.SimpleConstraintImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getSimpleConstraint()
		 * @generated
		 */
		EClass SIMPLE_CONSTRAINT = eINSTANCE.getSimpleConstraint();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CONSTRAINT__LEFT = eINSTANCE.getSimpleConstraint_Left();

		/**
		 * The meta object literal for the '<em><b>Compare</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CONSTRAINT__COMPARE = eINSTANCE.getSimpleConstraint_Compare();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CONSTRAINT__RIGHT = eINSTANCE.getSimpleConstraint_Right();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.DummyConstraintImpl <em>Dummy Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.DummyConstraintImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getDummyConstraint()
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
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.KeyValueImpl <em>Key Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.KeyValueImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getKeyValue()
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
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.DatatypeImpl <em>Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.DatatypeImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getDatatype()
		 * @generated
		 */
		EClass DATATYPE = eINSTANCE.getDatatype();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.NumberImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.CharSequenceImpl <em>Char Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.CharSequenceImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getCharSequence()
		 * @generated
		 */
		EClass CHAR_SEQUENCE = eINSTANCE.getCharSequence();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.TextImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.StringImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.IntegerImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.BooleanImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.DoubleImpl <em>Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.DoubleImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getDouble()
		 * @generated
		 */
		EClass DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.DateImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ExpressionImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Operators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__OPERATORS = eINSTANCE.getExpression_Operators();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.ArithmeticOperatorImpl <em>Arithmetic Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ArithmeticOperatorImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getArithmeticOperator()
		 * @generated
		 */
		EClass ARITHMETIC_OPERATOR = eINSTANCE.getArithmeticOperator();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.LogicalOperatorImpl <em>Logical Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.LogicalOperatorImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getLogicalOperator()
		 * @generated
		 */
		EClass LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.IsNotImpl <em>Is Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.IsNotImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getIsNot()
		 * @generated
		 */
		EClass IS_NOT = eINSTANCE.getIsNot();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.EqualsImpl <em>Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.EqualsImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getEquals()
		 * @generated
		 */
		EClass EQUALS = eINSTANCE.getEquals();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.AddImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.MulImpl <em>Mul</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.MulImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getMul()
		 * @generated
		 */
		EClass MUL = eINSTANCE.getMul();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.SubImpl <em>Sub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.SubImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getSub()
		 * @generated
		 */
		EClass SUB = eINSTANCE.getSub();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.DivImpl <em>Div</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.DivImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getDiv()
		 * @generated
		 */
		EClass DIV = eINSTANCE.getDiv();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.ComparativeImpl <em>Comparative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ComparativeImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getComparative()
		 * @generated
		 */
		EClass COMPARATIVE = eINSTANCE.getComparative();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.ConnectiveImpl <em>Connective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ConnectiveImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getConnective()
		 * @generated
		 */
		EClass CONNECTIVE = eINSTANCE.getConnective();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.AndImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.OrImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.ModuloImpl <em>Modulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ModuloImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getModulo()
		 * @generated
		 */
		EClass MODULO = eINSTANCE.getModulo();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.GreaterThanImpl <em>Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.GreaterThanImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getGreaterThan()
		 * @generated
		 */
		EClass GREATER_THAN = eINSTANCE.getGreaterThan();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.SmallerImpl <em>Smaller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.SmallerImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getSmaller()
		 * @generated
		 */
		EClass SMALLER = eINSTANCE.getSmaller();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.SmallerThanImpl <em>Smaller Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.SmallerThanImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getSmallerThan()
		 * @generated
		 */
		EClass SMALLER_THAN = eINSTANCE.getSmallerThan();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.GreaterImpl <em>Greater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.GreaterImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getGreater()
		 * @generated
		 */
		EClass GREATER = eINSTANCE.getGreater();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.StringOperatorImpl <em>String Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.StringOperatorImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getStringOperator()
		 * @generated
		 */
		EClass STRING_OPERATOR = eINSTANCE.getStringOperator();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.LikeImpl <em>Like</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.LikeImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getLike()
		 * @generated
		 */
		EClass LIKE = eINSTANCE.getLike();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.LengthImpl <em>Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.LengthImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getLength()
		 * @generated
		 */
		EClass LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.ConcatImpl <em>Concat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ConcatImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getConcat()
		 * @generated
		 */
		EClass CONCAT = eINSTANCE.getConcat();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.UnaryNotImpl <em>Unary Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.UnaryNotImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getUnaryNot()
		 * @generated
		 */
		EClass UNARY_NOT = eINSTANCE.getUnaryNot();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.OperatorImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__ATTRIBUTES = eINSTANCE.getOperator_Attributes();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__LITERALS = eINSTANCE.getOperator_Literals();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema_branch.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.LiteralImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema_branch.impl.ErschemaPackageImpl#getLiteral()
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

	}

} //ErschemaPackage
