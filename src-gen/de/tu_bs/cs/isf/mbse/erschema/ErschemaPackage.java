/**
 */
package de.tu_bs.cs.isf.mbse.erschema;

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
 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaFactory
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
	ErschemaPackage eINSTANCE = de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ModelImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getModel()
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
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getElement()
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
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getEntity()
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
	 * The feature id for the '<em><b>Key</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__KEY = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__COMPOSITIONS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CONSTRAINTS = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dummy Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DUMMY_CONSTRAINTS = ELEMENT_FEATURE_COUNT + 4;

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
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getAttribute()
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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
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
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getRelation()
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
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getRole()
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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.CompositionImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getComposition()
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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ConstraintImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__PREDICATES = 0;

	/**
	 * The feature id for the '<em><b>Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OPERATORS = 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.PredicateImpl <em>Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.PredicateImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 8;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__TERMS = 0;

	/**
	 * The feature id for the '<em><b>Lop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__LOP = 1;

	/**
	 * The feature id for the '<em><b>Bop</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__BOP = 2;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.TermImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.PredicateOperatorImpl <em>Predicate Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.PredicateOperatorImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getPredicateOperator()
	 * @generated
	 */
	int PREDICATE_OPERATOR = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OPERATOR__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Predicate Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OPERATOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Predicate Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.DummyConstraintImpl <em>Dummy Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.DummyConstraintImpl
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getDummyConstraint()
	 * @generated
	 */
	int DUMMY_CONSTRAINT = 11;

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
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.Datatype <em>Datatype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.Datatype
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getDatatype()
	 * @generated
	 */
	int DATATYPE = 12;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.LogicalBinaryOperator <em>Logical Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.LogicalBinaryOperator
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getLogicalBinaryOperator()
	 * @generated
	 */
	int LOGICAL_BINARY_OPERATOR = 13;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.erschema.BinaryOperator <em>Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.erschema.BinaryOperator
	 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 14;


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
	 * Returns the meta object for the reference list '{@link de.tu_bs.cs.isf.mbse.erschema.Entity#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Key</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Entity#getKey()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Key();

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
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.erschema.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

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
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.erschema.Role#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Role#getEntity()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Entity();

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
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema.Constraint#getPredicates <em>Predicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predicates</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Constraint#getPredicates()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Predicates();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema.Constraint#getOperators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operators</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Constraint#getOperators()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Operators();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Predicate
	 * @generated
	 */
	EClass getPredicate();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.erschema.Predicate#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Predicate#getTerms()
	 * @see #getPredicate()
	 * @generated
	 */
	EReference getPredicate_Terms();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.erschema.Predicate#getLop <em>Lop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lop</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Predicate#getLop()
	 * @see #getPredicate()
	 * @generated
	 */
	EAttribute getPredicate_Lop();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.mbse.erschema.Predicate#getBop <em>Bop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bop</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Predicate#getBop()
	 * @see #getPredicate()
	 * @generated
	 */
	EAttribute getPredicate_Bop();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.erschema.Term#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Term#getType()
	 * @see #getTerm()
	 * @generated
	 */
	EAttribute getTerm_Type();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.erschema.PredicateOperator <em>Predicate Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Operator</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.PredicateOperator
	 * @generated
	 */
	EClass getPredicateOperator();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.erschema.PredicateOperator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.PredicateOperator#getType()
	 * @see #getPredicateOperator()
	 * @generated
	 */
	EAttribute getPredicateOperator_Type();

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
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.mbse.erschema.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datatype</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.Datatype
	 * @generated
	 */
	EEnum getDatatype();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.mbse.erschema.LogicalBinaryOperator <em>Logical Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Binary Operator</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.LogicalBinaryOperator
	 * @generated
	 */
	EEnum getLogicalBinaryOperator();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.mbse.erschema.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Operator</em>'.
	 * @see de.tu_bs.cs.isf.mbse.erschema.BinaryOperator
	 * @generated
	 */
	EEnum getBinaryOperator();

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
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ModelImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getModel()
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
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getEntity()
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
		 * The meta object literal for the '<em><b>Key</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__KEY = eINSTANCE.getEntity_Key();

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
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.AttributeImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ElementImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getElement()
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
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getRelation()
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
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getRole()
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
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.CompositionImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getComposition()
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
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ConstraintImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Predicates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__PREDICATES = eINSTANCE.getConstraint_Predicates();

		/**
		 * The meta object literal for the '<em><b>Operators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__OPERATORS = eINSTANCE.getConstraint_Operators();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.PredicateImpl <em>Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.PredicateImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE__TERMS = eINSTANCE.getPredicate_Terms();

		/**
		 * The meta object literal for the '<em><b>Lop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE__LOP = eINSTANCE.getPredicate_Lop();

		/**
		 * The meta object literal for the '<em><b>Bop</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE__BOP = eINSTANCE.getPredicate_Bop();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.TermImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM__TYPE = eINSTANCE.getTerm_Type();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.PredicateOperatorImpl <em>Predicate Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.PredicateOperatorImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getPredicateOperator()
		 * @generated
		 */
		EClass PREDICATE_OPERATOR = eINSTANCE.getPredicateOperator();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE_OPERATOR__TYPE = eINSTANCE.getPredicateOperator_Type();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.impl.DummyConstraintImpl <em>Dummy Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.DummyConstraintImpl
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getDummyConstraint()
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
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.Datatype <em>Datatype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.Datatype
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getDatatype()
		 * @generated
		 */
		EEnum DATATYPE = eINSTANCE.getDatatype();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.LogicalBinaryOperator <em>Logical Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.LogicalBinaryOperator
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getLogicalBinaryOperator()
		 * @generated
		 */
		EEnum LOGICAL_BINARY_OPERATOR = eINSTANCE.getLogicalBinaryOperator();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.erschema.BinaryOperator <em>Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.erschema.BinaryOperator
		 * @see de.tu_bs.cs.isf.mbse.erschema.impl.ErschemaPackageImpl#getBinaryOperator()
		 * @generated
		 */
		EEnum BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

	}

} //ErschemaPackage
