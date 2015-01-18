SYNTAXDEF erm
FOR <http://tu-bs.de/cs/isf/mbse/erschema> <erschema.genmodel>
START Model

OPTIONS {
	reloadGeneratorModel = "true";
	generateCodeFromGeneratorModel = "true";
	overrideBuilder = "false";
}

TOKENS {
	DEFINE COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE BOUNDS $ ( '#' | ('0'..'9')+ )$; 
   // DEFINE INTEGER_LITERAL $('0'..'9')+$;
}

TOKENSTYLES {
	"COMMENT" COLOR #00bb00, ITALIC; 
	"BOUNDS" COLOR #FF8c00;
	
	"model"	COLOR #200080, BOLD;
	"key" COLOR #CD3333, BOLD;
	"val" COLOR #336666, BOLD;
	
	"entity" COLOR #200080, BOLD;
	"relation" COLOR #200060, BOLD;
	
	"constraint" COLOR #6679aa, BOLD;
	"check" COLOR #6679aa, BOLD;
	"composition" COLOR #0000DD, ITALIC;
	
	"role" COLOR #009ACD;
	"references" COLOR #009ACD;

	"int" COLOR #7779bb;
	"double" COLOR #7779bb;
	"string" COLOR #7779bb;
	"text" COLOR #7779bb;
	"bool" COLOR #7779bb;
	"date" COLOR #7779bb;
		
	"and" COLOR #308080;
	"or" COLOR #308080;
	"not"  COLOR #308080;
	"<=" COLOR #308080;
	"<"	 COLOR #308080;
	"!=" COLOR #308080;
	"==" COLOR #308080;
	">"  COLOR #308080;
	">=" COLOR #308080;
	"+"  COLOR #308080;
	"-"  COLOR #308080;
	"%"  COLOR #308080;
	"/"  COLOR #308080;
	"*"  COLOR #308080;
}


RULES {

	Model   ::= "model"; 
	// #1 //erschema/Model/name[] !1"{"!1 //erschema/Model/entities* //erschema/Model/relations* "}"!0;   
	//@Foldable
	//erschema/Entity ::= "entity"#1 //erschema/Element/name[] !1"{"!1 //erschema/Entity/keys+ //erschema/Entity/attributes* //erschema/Entity/compositions* //erschema/Entity/dummyConstraints* //erschema/Entity/constraints*"}"!0; 
	
	//@Foldable
	//erschema/Relation ::= "relation"#1 //erschema/Element/name[] !0"{" !1 //erschema/Relation/attributes* //erschema/Relation/roles(//erschema/Relation/roles+) //erschema/Relation/dummyConstraints* "}"!0;	
	//erschema/Composition ::= "composition"#1//erschema/Element/name[] "{"//erschema/Composition/attributes(//erschema/Composition/attributes+)"}"!0;
	//erschema/Attribute ::= "val"#1//erschema/Element/name[] ":" //erschema/Attribute/type!0;
	
	//erschema/KeyValue::="key"#1(//erschema/KeyValue/composition|//erschema/KeyValue/attribute)|(//erschema/KeyValue/attribute|//erschema/KeyValue/composition);
	//erschema/Role ::= "role"#1//erschema/Element/name[] "references" //erschema/Role/entity[] "[" //erschema/Role/lowerBound[] "," //erschema/Role/upperBound[] "]"!0;

	//erschema/DummyConstraint  ::= "constraint" "(" //erschema/DummyConstraint/constraint[] ")";
	
	//erschema/SimpleConstraint ::= "check" "(" //erschema/SimpleConstraint/entity[]"."//erschema/SimpleConstraint/attributes[] (//erschema/SimpleConstraint/entity[]"."//erschema/SimpleConstraint/attributes[])*  //erschema/SimpleConstraint/compare+ (//erschema/SimpleConstraint/entity[]"."//erschema/SimpleConstraint/attributes[])+ ")";
	
	// Datentypen	
	//erschema/Text 	::= "text";
	//erschema/String 	::= "string";
	//erschema/Boolean ::= "bool";
	//erschema/Integer ::= "int";
	//erschema/Double 	::= "double";	
	//erschema/Date 	::= "date";
	
	// Operatoren	
	//erschema/SmallerThan ::= "<=";	
	
	//erschema/Smaller ::= "<";
	
	//erschema/IsNot ::= "!=";
	
	//erschema/Equals ::= "==";
	
	//erschema/Greater ::= ">";
	
	//erschema/GreaterThan ::= ">=";
	
	//erschema/And ::= "and";
	
	//erschema/Or  ::= "or";
	
	//erschema/UnaryNot ::="not";
	
	//erschema/Add ::= "+";
	
	//erschema/Sub ::= "-";
	
	//erschema/Modulo ::= "%";
	
	//erschema/Div ::= "/";
	
	//erschema/Mul ::= "*";	
}