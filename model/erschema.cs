SYNTAXDEF erm
FOR <http://tu-bs.de/cs/isf/mbse/erschema> <erschema.genmodel>
START Model

OPTIONS {
	reloadGeneratorModel = "true";
	generateCodeFromGeneratorModel = "true";
}

RULES {
	Model   ::= "model" name[] "{" entities* relations* "}";   
	
	Entity ::= "entity" name[] "{" keys+ attributes* compositions* dummyConstraints* "}"; 
 	
	Relation ::= "relation" name[] "{" attributes* roles(roles+) dummyConstraints* "}";	
	
	Composition ::= "composition" name[] "{" attributes(attributes+) "}";
	
	Attribute ::= "val" name[] ":";
	
	KeyValue ::= "key" (composition|attribute);
	
	Role ::= "role" name[] "references" entity "[" lowerBound[] "," upperBound[] "]";
	
	DummyConstraint ::= "constraint" "(" constraint[] ")";
	
}