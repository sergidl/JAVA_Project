package com.institutmvm.controller.utils;

public class Values {
	
	/** 
	 * Determina si el valor es un float
	 * 
	 * @param str
	 * @return boolean
	 */
	public static boolean isFloat(String str) {
		try {
			Float.parseFloat(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	
	/** 
	 * Determina si el valor es un int
	 * 
	 * @param str
	 * @return boolean
	 */
	public static boolean isInt(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	
	/** 
	 * Determina si el valor es un el tipus del parametre
	 * @param a
	 * @return String
	 */
	public static String getType(Object a) {
		String type = a.getClass().getSimpleName();

		
		switch (type) {
			case "Cartilaginos":
				return "cartilaginos";
			case "Alga":
				return "alga";
			case "Molusc":
				return "molusc";
			case "Ocell":
				return "ocell";
			default:
				throw new IllegalArgumentException("Invalid type: " + type);
		}

	}
}
