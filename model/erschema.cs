@SuppressWarnings
SYNTAXDEF erm
FOR <http://tu-bs.de/cs/isf/mbse/erschema> <erschema.genmodel>
START Model

OPTIONS {
	reloadGeneratorModel = "true";
	generateCodeFromGeneratorModel = "true";
	overrideBuilder = "false";
	usePredefinedTokens = "false";
	
}

TOKENS {
	DEFINE COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE BOUNDS $ ( '´' '*' '´' | ('´' '0'..'9' '´')+ )$; 
    DEFINE INTEGER_LITERAL $('1'..'9')('0'..'9')|'0'$;
    DEFINE REAL_LITERAL $ (('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ (('e'|'E') ('+'|'-')? ('0'..'9')*)?$;
    
    DEFINE WHITESPACE $(' '|'\t'|'\f')$;
    DEFINE LINEBREAKS $('\r\n'|'\r'|'\n')$;
    DEFINE TEXT $('A'..'Z'|'a'..'z'|'0'..'9'|'_'|'-')+$;
    DEFINE STRING $ ('"' ('A'..'Z'|'a'..'z'|'0'..'9'|'_'|'-'|'.'|' '| '<'|'>'|'='|'!'|'*')+ '"')$;
    DEFINE ATTRIBUT $('A'..'Z'|'a'..'z'|'0'..'9'|'_'|'-')+ '.' ('A'..'Z'|'a'..'z'|'0'..'9'|'_'|'-')+$;
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
		
	"and"COLOR #308080;
	"or" COLOR #308080;
	"not"COLOR #308080;
	"<=" COLOR #308080;
	"<"	 COLOR #308080;
	"is not" COLOR #308080;
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
 
	Model  ::= "model" #1 name[] "{" entities+ relations* "}"!0;   
	//@Foldable
	Entity ::= "entity"#1 name[] !1"{"!1 keys+ attributes* compositions* dummyConstraints* constraints*"}"!0; 
	
	//@Foldable
	Relation ::= "relation"#1 name[] !0"{" !1 attributes* roles(roles+) dummyConstraints* constraints*"}"!0;	
	Composition ::= "composition"#1name[] "{"attributes(attributes+)"}"!0;
	Attribute ::= "val"#1name[] ":" type!0;
	
	KeyValue::="key"#1(composition|attribute);
	Role ::= "role"#1name[] "references" entity[] ("[" lowerBound[BOUNDS] "," upperBound[BOUNDS] "]")? !0;

	DummyConstraint  ::= "check" "(" constraint[STRING] ")";
	
	SimpleConstraint ::= "constraint" "(" (((attributes[ATTRIBUT] | numValue[REAL_LITERAL] | StringValue[STRING]) (arithmeticop* | (connect : And , Or)* | (stringop : Concat , Length)*) compare (attributes[ATTRIBUT] | numValue[REAL_LITERAL] | StringValue[STRING]) (arithmeticop* | (connect : And , Or)* | (stringop : Concat , Length)*)) | stringop : Like | connect : UnaryNot )")";
	
	// Datentypen	
	Text 	::= "text";
	String 	::= "string";
	Boolean ::= "bool";
	Integer ::= "int";
	Double 	::= "double";	
	Date 	::= "date";
	
	// Operatoren	
	SmallerThan ::= "<=";	
	Smaller ::= "<"; 
	IsNot ::= "is not";
	Equals ::= "==";
	Greater ::= ">";
	GreaterThan ::= ">=";
		
	And ::= "and" attribute[ATTRIBUT];
	Or  ::= "or" attribute[ATTRIBUT];
	
	UnaryNot ::= "not" attribute[ATTRIBUT];
	
	Add ::= "+" (attribute[ATTRIBUT]|value[REAL_LITERAL]);
	Sub ::= "-" (attribute[ATTRIBUT]|value[REAL_LITERAL]);
	Modulo ::= "%" (attribute[ATTRIBUT]|value[REAL_LITERAL]);
	Div ::= "/" (attribute[ATTRIBUT]|value[REAL_LITERAL]);
	Mul ::= "*" (attribute[ATTRIBUT]|value[REAL_LITERAL]);
	
	Concat ::= "con" (attribute[ATTRIBUT]|value[]);
	Like ::= attribute[ATTRIBUT] "like" value[STRING];
	Length ::= ".length()";
	
	Literal ::= attribute[ATTRIBUT];		
}