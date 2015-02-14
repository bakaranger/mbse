package de.tu_bs.cs.isf.mbse.erschema.generator;

import de.tu_bs.cs.isf.mbse.erschema.Attribute;
import de.tu_bs.cs.isf.mbse.erschema.Composition;
import de.tu_bs.cs.isf.mbse.erschema.Datatype;
import de.tu_bs.cs.isf.mbse.erschema.DummyConstraint;
import de.tu_bs.cs.isf.mbse.erschema.Entity;
import de.tu_bs.cs.isf.mbse.erschema.KeyValue;
import de.tu_bs.cs.isf.mbse.erschema.Model;
import de.tu_bs.cs.isf.mbse.erschema.Relation;
import de.tu_bs.cs.isf.mbse.erschema.Role;
import de.tu_bs.cs.isf.mbse.erschema.impl.BooleanImpl;
import de.tu_bs.cs.isf.mbse.erschema.impl.DateImpl;
import de.tu_bs.cs.isf.mbse.erschema.impl.DoubleImpl;
import de.tu_bs.cs.isf.mbse.erschema.impl.IntegerImpl;
import de.tu_bs.cs.isf.mbse.erschema.impl.TextImpl;

public final class SQLCodeGenerator {

	public static String sql(final Model model)  {
		final StringBuilder sqlContent = new StringBuilder();
		final String modelName = model.getName();

		sqlContent.append("CREATE SCHEMA " + modelName + ";\n\n");

		for (final Entity ent : model.getEntities()) {
			sqlContent.append(sqlEntity(ent)).append(";\n\n");
		}

		for (final Relation rel : model.getRelations()) {
			sqlContent.append(sqlRelation(rel)).append(";\n\n");
		}

		String sql = sqlContent.toString();
		
		return sqlContent.toString();
	}

	private static String sqlRelation(final Relation rel) {
		final StringBuilder sql = new StringBuilder();

		sql.append("CREATE TABLE ").append(rel.getName()).append("(\n");

		for (final Attribute attr : rel.getAttributes()) {
			sql.append(sqlAttribute(attr));
		}
		for (final Role role : rel.getRoles()) {
			sql.append(sqlRole(role));
		}
		for (final DummyConstraint constraint : rel.getDummyConstraints()) {
			sql.append(sqlCheckConstraint(constraint));
		}
		sql.delete(sql.length() - 2, sql.length() - 1);
		sql.append(")");
		return sql.toString();
	}

	private static String sqlRole(final Role role) {
		final StringBuilder sql = new StringBuilder();

		final String keyStr = role.getEntity().getKeys().get(0).getAttribute()
				.getName();

		sql.append("\tFOREIGN KEY (").append(role.getName())
				.append(") REFERENCES ").append(role.getName()).append("(")
				.append(keyStr).append(")\n\t\t")
				.append("ON DELETE CASCADE \n\t\t")
				.append("ON UPDATE CASCADE,\n");

		return sql.toString();
	}

	private static String sqlEntity(final Entity ent) {
		final StringBuilder sql = new StringBuilder();

		sql.append("CREATE TABLE ").append(ent.getName()).append(" (\n");

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
		sql.delete(sql.length() - 2, sql.length() - 1);
		sql.append(")");
		return sql.toString();
	}

	private static String sqlCheckConstraint(final DummyConstraint constraint) {
		return "\tCHECK (" + constraint.getConstraint() + "),\n";
	}

	private static String sqlComposition(final Composition comp) {
		final StringBuilder sql = new StringBuilder();

		for (final Attribute attr : comp.getAttributes()) {
			sql.append(sqlAttribute(attr));
		}
		return sql.toString();
	}

	private static String sqlAttribute(final Attribute attr) {
		return "\t" + attr.getName() + " " + sqlType(attr.getType()) + ",\n";
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
}
