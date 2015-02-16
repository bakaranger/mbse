package de.tu_bs.cs.isf.mbse.erschema.generator;

import org.eclipse.emf.common.util.EList;

import de.tu_bs.cs.isf.mbse.erschema.ArithmeticOperator;
import de.tu_bs.cs.isf.mbse.erschema.Attribute;
import de.tu_bs.cs.isf.mbse.erschema.Comparative;
import de.tu_bs.cs.isf.mbse.erschema.Composition;
import de.tu_bs.cs.isf.mbse.erschema.Connective;
import de.tu_bs.cs.isf.mbse.erschema.Datatype;
import de.tu_bs.cs.isf.mbse.erschema.DummyConstraint;
import de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint;
import de.tu_bs.cs.isf.mbse.erschema.Entity;
import de.tu_bs.cs.isf.mbse.erschema.KeyValue;
import de.tu_bs.cs.isf.mbse.erschema.Model;
import de.tu_bs.cs.isf.mbse.erschema.Relation;
import de.tu_bs.cs.isf.mbse.erschema.Role;
import de.tu_bs.cs.isf.mbse.erschema.StringOperator;
import de.tu_bs.cs.isf.mbse.erschema.impl.BooleanImpl;
import de.tu_bs.cs.isf.mbse.erschema.impl.DateImpl;
import de.tu_bs.cs.isf.mbse.erschema.impl.DoubleImpl;
import de.tu_bs.cs.isf.mbse.erschema.impl.IntegerImpl;
import de.tu_bs.cs.isf.mbse.erschema.impl.TextImpl;
import de.tu_bs.cs.isf.mbse.erschema.impl.SmallerThanImpl;
import de.tu_bs.cs.isf.mbse.erschema.impl.SmallerImpl;
import de.tu_bs.cs.isf.mbse.erschema.impl.IsNotImpl;
import de.tu_bs.cs.isf.mbse.erschema.impl.EqualsImpl;
import de.tu_bs.cs.isf.mbse.erschema.impl.GreaterImpl;
import de.tu_bs.cs.isf.mbse.erschema.impl.GreaterThanImpl;

public final class SQLCodeGenerator {

	public static String sql(final Model model) {
		final StringBuilder sqlContent = new StringBuilder();
		if (!sqlGoodString(model.getName()))
			System.err.println("Bad String - model.getName():"
					+ model.getName());
		final String modelName = model.getName();

		sqlContent.append("CREATE SCHEMA `" + modelName + "`;\n\n");

		for (final Entity ent : model.getEntities()) {
			sqlContent.append(sqlEntity(ent)).append(";\n\n");
		}

		for (final Relation rel : model.getRelations()) {
			sqlContent.append(sqlRelation(rel)).append(";\n\n");
		}
		return sqlContent.toString();
	}

	private static String sqlRelation(final Relation rel) {
		final StringBuilder sql = new StringBuilder();
		if (!sqlGoodString(rel.getName()))
			System.err.println("Bad String - rel.getName():" + rel.getName());
		sql.append("CREATE TABLE `").append(rel.getName()).append("`(\n");
		for (final Attribute attr : rel.getAttributes()) {
			sql.append(sqlAttribute(attr));
		}
		for (final Role role : rel.getRoles()) {
			sql.append(sqlRole(role));
		}
		for (final DummyConstraint constraint : rel.getDummyConstraints()) {
			sql.append(sqlCheckConstraint(constraint));
		}
		for (final SimpleConstraint simple : rel.getConstraints()) {
			sql.append(sqlCheckConstraint(simple));
		}
		sql.delete(sql.length() - 2, sql.length() - 1);
		sql.append(")");
		return sql.toString();
	}

	private static String sqlRole(final Role role) {
		final StringBuilder sql = new StringBuilder();
		if (!sqlGoodString(role.getEntity().getKeys().get(0).getAttribute().getName()))
			System.err.println("Bad String - role.getEntity().getKeys().get(0).getAttribute().getName():" + role.getEntity().getKeys().get(0).getAttribute().getName());
		final String keyStr = role.getEntity().getKeys().get(0).getAttribute().getName();
		if (!sqlGoodString(role.getName()))
			System.err.println("Bad String - role.getName():" + role.getName());
		sql.append("\tFOREIGN KEY (`").append(role.getName())
				.append("`) REFERENCES ").append("`" + role.getName())
				.append("`(`").append(keyStr).append("`)\n\t\t")
				.append("ON DELETE CASCADE \n\t\t")
				.append("ON UPDATE CASCADE,\n");

		return sql.toString();
	}

	private static String sqlEntity(final Entity ent) {
		final StringBuilder sql = new StringBuilder();
		if (!sqlGoodString(ent.getName()))
			System.err.println("Bad String - ent.getName():" + ent.getName());
		sql.append("CREATE TABLE `").append(ent.getName()).append("` (\n");

		for (final Attribute attr : ent.getAttributes()) {
			sql.append(sqlAttribute(attr));
		}
		for (final Composition comp : ent.getCompositions()) {
			sql.append(sqlComposition(comp));
		}
		for (final KeyValue key : ent.getKeys()) {
			sql.append(sqlKeyValue(key));
		}
		for (final DummyConstraint constraint : ent.getDummyConstraints()) {
			sql.append(sqlCheckConstraint(constraint));
		}
		for (final SimpleConstraint simple : ent.getConstraints()) {
			sql.append(sqlCheckConstraint(simple));
		}
		sql.delete(sql.length() - 2, sql.length() - 1);
		sql.append(")");
		return sql.toString();
	}

	private static String sqlCheckConstraint(final DummyConstraint constraint) {
		if (!sqlGoodString(constraint.getConstraint()))
			System.err.println("Bad String - constraint.getConstraint():" + constraint.getConstraint());
		return "\tCHECK (" + constraint.getConstraint() + "),\n";
	}
	
	private static String sqlCheckConstraint(final SimpleConstraint constraint) {
		final StringBuilder sql = new StringBuilder();
		
		EList<ArithmeticOperator> 			ari = constraint.getArithmeticop();
		EList<Attribute> 					att = constraint.getAttributes();
		//Class<? extends SimpleConstraint> 	cla = constraint.getClass();
		EList<Comparative> 					com = constraint.getCompare();
		EList<Connective> 					con = constraint.getConnect();
		//EList<Entity> 						ent = constraint.getEntity();
		EList<Double> 						num = constraint.getNumValue();
		EList<StringOperator> 				sop = constraint.getStringop();
		EList<String> 						sva = constraint.getStringValue();
		// 3.0 <= 4.0
		// NumValue Comparative NumValue
		// NumValue[0] = 3.0 (links)
		// NumValue[1] = 4.0 (rechts)
		
		// CONSTRAINT [name] CHECK (x <= y)
		
		for(int i = 0; i < ari.size(); i++){
			System.out.println("# ArithOp: "+ari.get(i));
		}
		for(int i = 0; i < att.size(); i++){
			System.out.println("# Att: "+att.get(i));
		}
		//System.out.println("# Class: "+cla);
		for(int i = 0; i < com.size(); i++){
			System.out.println("# Comp: "+com.get(i));
		}
		for(int i = 0; i < con.size(); i++){
			System.out.println("# Conn: "+con.get(i));
		}
		//for(int i = 0; i < ent.size(); i++){
		//	System.out.println("# Enti: "+ent.get(i));
		//}
		for(int i = 0; i < num.size(); i++){
			System.out.println("# NumV: "+num.get(i));
		}
		for(int i = 0; i < sop.size(); i++){
			System.out.println("# StrOp: "+sop.get(i));
		}
		for(int i = 0; i < sva.size(); i++){
			System.out.println("# StrV: "+sva.get(i));
		}
		System.out.println("\n");
		
		String left, right;
		left = "[LEFT]";
		right = "[RIGHT]";
		
		if(num.size() == 2){
			left = num.get(0).toString();
			right = num.get(1).toString();
		} else if(att.size() == 2){
			left = att.get(0).getName().toString();
			right = att.get(1).getName().toString();
		} else if(sva.size() == 2){
			left = sva.get(0);
			right = sva.get(1);
		}
		for(int i=0; i < com.size(); i++){
			switch(sqlComparative(com.get(i))){
			case "<=":sql.append("\tCONSTRAINT name"+com.get(i).toString().substring(com.get(i).toString().indexOf("@")+1,com.get(i).toString().indexOf("@")+9)+" CHECK ("+left+" <= "+right+"),\n");
				break;
			case "<":sql.append("\tCONSTRAINT name"+com.get(i).toString().substring(com.get(i).toString().indexOf("@")+1,com.get(i).toString().indexOf("@")+9)+" CHECK ("+left+" < "+right+"),\n");
				break;
			case "is not":sql.append("\tCONSTRAINT name"+com.get(i).toString().substring(com.get(i).toString().indexOf("@")+1,com.get(i).toString().indexOf("@")+9)+" CHECK ("+left+" is not "+right+"),\n");
				break;
			case "==":sql.append("\tCONSTRAINT name"+com.get(i).toString().substring(com.get(i).toString().indexOf("@")+1,com.get(i).toString().indexOf("@")+9)+" CHECK ("+left+" == "+right+"),\n");
				break;
			case ">":sql.append("\tCONSTRAINT name"+com.get(i).toString().substring(com.get(i).toString().indexOf("@")+1,com.get(i).toString().indexOf("@")+9)+" CHECK ("+left+" > "+right+"),\n");
				break;
			case ">=":sql.append("\tCONSTRAINT name"+com.get(i).toString().substring(com.get(i).toString().indexOf("@")+1,com.get(i).toString().indexOf("@")+9)+" CHECK ("+left+" >= "+right+"),\n");
				break;
			}
		}
		
		return sql.toString();
	}

	private static String sqlComposition(final Composition comp) {
		final StringBuilder sql = new StringBuilder();

		for (final Attribute attr : comp.getAttributes()) {
			sql.append(sqlAttribute(attr));
		}
		return sql.toString();
	}

	private static String sqlAttribute(final Attribute attr) {
		if (!sqlGoodString(attr.getName()))
			System.err.println("Bad String - attr.getName():" + attr.getName());
		return "\t`" + attr.getName() + "` " + sqlType(attr.getType()) + ",\n";
	}

	private static String sqlKeyAttribute(final Attribute key) {
		final String keyStr = sqlAttribute(key);
		return keyStr.substring(0, keyStr.length() - 2)
				+ " NOT NULL PRIMARY KEY,\n";
	}

	private static String sqlKeyComposition(final Composition comp) {
		final StringBuilder sql = new StringBuilder();

		for (final Attribute attr : comp.getAttributes()) {
			sql.append(sqlKeyAttribute(attr)).append("\n");
		}
		return sql.toString();
	}

	private static String sqlKeyValue(final KeyValue key) {
		final Composition comp = key.getComposition();
		final Attribute attr = key.getAttribute();
		if (attr != null) {
			return sqlKeyAttribute(attr);
		}
		if (comp != null) {
			return sqlKeyComposition(comp);
		}
		return "";
	}

	private static String sqlType(final Datatype dt) {
		String type = "VARCHAR(255)";
		if (dt instanceof IntegerImpl) {
			type = "INT";
		} else if (dt instanceof DoubleImpl) {
			type = "DOUBLE";
		} else if (dt instanceof BooleanImpl) {
			type = "BOOLEAN";
		} else if (dt instanceof DateImpl) {
			type = "DATE";
		} else if (dt instanceof TextImpl) {
			type = "CLOB";
		}
		return type;
	}
	
	private static String sqlComparative(final Comparative comp){
		String type = "";
		if (comp instanceof SmallerThanImpl) {
			type = "<=";
		}else if (comp instanceof SmallerImpl) {
			type = "<";
		}else if (comp instanceof IsNotImpl) {
			type = "is not";
		}else if (comp instanceof EqualsImpl) {
			type = "==";
		}else if (comp instanceof GreaterImpl) {
			type = ">";
		}else if (comp instanceof GreaterThanImpl) {
			type = ">=";
		}
		return type;
	}
	
	private static boolean sqlGoodString(final String s) {
		if (s.contains("`"))
			return false;
		return true;
	}
}