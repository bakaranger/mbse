package de.tu_bs.cs.isf.mbse.erschema_branch.generator;

import java.util.Arrays;
import java.util.List;

public final class Utils {

	public static String normalizeWhitespace(final String str) {
		return str.replaceAll("\\s", " ");		
	}
	
	public static List<String> tokens(final String str) {
		return Arrays.asList(str.split(" "));		
	}
}
