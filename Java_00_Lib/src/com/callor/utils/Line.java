package com.callor.utils;

public class Line {
	
	public static String dLine = "=".repeat(100);
	public static String sLine = "-".repeat(100);

	public static String dLine(int length) {
		return "=".repeat(length);
	}
	public static String sLine(int length) {
		return "-".repeat(length);
	}
}
