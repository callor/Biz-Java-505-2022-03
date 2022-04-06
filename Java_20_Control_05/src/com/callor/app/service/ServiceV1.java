package com.callor.app.service;

public class ServiceV1 {
	
	/*
	 * return type 이 int 형인
	 * 동적(일반) method 선언
	 * method 이름으로 봤을때 성적의 합계를 계산하여
	 * 그 "결과를 return" 하는 일을 수행할 것이다
	 */
	public int scoreSum() {
		
		int intKor = 90;
		int intEng = 80;
		int intMath = 70;
		
		int intSum = 0;
		intSum = intKor + intEng + intMath;
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		return intSum;
	}
	
	/*
	 * void type 의 scorePrint() 선언
	 * 이름으로 짐작했을때 성적정보(리스트 등)을 출력하는
	 * 일을 수행할 것으로 보인다
	 * void type 이기 때문에 
	 * 		"호출한 곳에" 어떤 것도 알리지 않는다
	 */
	public void scorePrint() {
		
		int intKor = 90;
		int intEng = 80;
		int intMath = 70;
		
		System.out.println("========================");
		System.out.println("철수의 성적표");
		System.out.println("------------------------");
		System.out.println("국어 : " + intKor);
		System.out.println("영어 : " + intEng);
		System.out.println("수학 : " + intMath);
		System.out.println("------------------------");
		
		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		System.out.println("총점 : " + intSum);
		System.out.println("=========================");
		
		
	}

}
