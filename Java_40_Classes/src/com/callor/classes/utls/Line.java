package com.callor.classes.utls;

public class Line extends Object {

	public static String dLine(int length) {
		String dLine = "=";
		return dLine.repeat(length);
	}

	public static String sLine(int length) {
		return "-".repeat(length);
	}



}
