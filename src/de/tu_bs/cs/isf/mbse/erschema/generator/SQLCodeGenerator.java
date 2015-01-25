package de.tu_bs.cs.isf.mbse.erschema.generator;

import de.tu_bs.cs.isf.mbse.erschema.Entity;
import de.tu_bs.cs.isf.mbse.erschema.Model;
import de.tu_bs.cs.isf.mbse.erschema.Relation;
import de.tu_bs.cs.isf.mbse.erschema.db.TestDB;

public final class SQLCodeGenerator {

	public static String sql(final Model model) {
		final StringBuilder sqlContent = new StringBuilder();
		final String modelName = model.getName();

		for (final Entity ent : model.getEntities()) {

		}

		for (final Relation ent : model.getRelations()) {

		}		
		
		return TestDB.validate(sqlContent.toString());
	}
}
