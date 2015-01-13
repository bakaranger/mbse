SYNTAXDEF erm
FOR <http://tu-bs.de/cs/isf/mbse/erschema> <erschema.genmodel>
START Model

OPTIONS {
	reloadGeneratorModel = "true";
	generateCodeFromGeneratorModel = "true";
	overrideBuilder = "false";
	additionalDependencies = "org.emftext.runtime.owltext";
}

TOKENS {
	DEFINE COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE BOUNDS $ ( '#' | ('0'..'9')+ )$; 
   // DEFINE INTEGER_LITERAL $('0'..'9')+$;
}

TOKENSTYLES {
	"COMMENT" COLOR #00bb00, ITALIC ; 
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
	"String" COLOR #7779bb;
	"text" COLOR #7779bb;
	"boolean" COLOR #7779bb;
	"date" COLOR #7779bb;
		
	"and" COLOR #308080;
	"or" COLOR #308080;
	"!"  COLOR #308080;
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
	Model   ::= "model"#1 name['"', '"'] !1"{"!1 entities* relations* "}"!0;   
	Entity ::= "entity"#1 name['"', '"'] !1"{"!1 keys+ attributes* compositions* dummyConstraints* constraints*"}"!0; 
	Relation ::= "relation"#1 name[] !0"{" !1 attributes* roles(roles+) dummyConstraints* "}"!0;	
	Composition ::= "composition"#1name[] "{"attributes(attributes+)"}"!0;
	Attribute ::= "val"#1name[] ":" type!0;
	KeyValue::="key"#1(composition|attribute)|(attribute|composition);
	Role ::= "role"#1name[] "references" entity[] "[" lowerBound[BOUNDS] "," upperBound[BOUNDS] "]"!0;

	DummyConstraint  ::= "constraint" "(" constraint[] ")";
	SimpleConstraint ::= "check" "("  compare*  ")";
	
	// Datentypen	
	Text 	::= "text";
	String 	::= "String";
	Boolean ::= "boolean";
	Integer ::= "int";
	Double 	::= "double";	
	Date 	::= "date";
	
	// Operatoren
	SmallerThan ::= "<=";	
	Smaller ::= "<";
	IsNot ::= "!=";
	Equals ::= "==";
	Greater ::= ">";
	GreaterThan ::= ">=";
	And ::= "and";
	Or  ::= "or";
	Add ::= "+";
	Sub ::= "-";
	Modulo ::= "%";
	Div ::= "/";
	Mul ::= "*";
	UnaryNot ::="!";
}