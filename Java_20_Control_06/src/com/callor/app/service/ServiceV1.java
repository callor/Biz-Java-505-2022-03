package com.callor.app.service;

public class ServiceV1 {
	
	public int scoreSum() {
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		
		intKor = (int)(Math.random() * 100) + 1;
		intEng = (int)(Math.random() * 100) + 1;
		intMath = (int)(Math.random() * 100) + 1;
		
		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		return intSum;
	}

}
