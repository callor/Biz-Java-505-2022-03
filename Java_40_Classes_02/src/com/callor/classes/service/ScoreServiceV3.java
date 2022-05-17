package com.callor.classes.service;

public class ScoreServiceV3 {

	protected String[] students;
	protected int[] intKor;

	public ScoreServiceV3() {
		this(10);
	}
	public ScoreServiceV3(int length) {
		students = new String[length];
		intKor = new int[length];
	}
	public ScoreServiceV3(String[] students) {
		this.students = students;
		this.intKor = new int[this.students.length];
	}



}
