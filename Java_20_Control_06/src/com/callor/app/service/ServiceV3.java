package com.callor.app.service;

/*
 * scoreSum() 에서 계산한 총점과
 * scorePrint() 에서 출력한 과목점수와의 관계는 완전히 문제가 발생했다
 * 두 method 에 선언된 intKor, intEng, intMath 는 이름은 같지만
 * 완전히 다른 변수(저장공간, 값이 다른)이다
 * 
 * 총점을 scorePrint()에서 직접 계산하면 되겠지만
 * scoreSum()을 사용하여 총점을 계산하고 싶다
 * 
 * 이러한 문제를 해결하기 위하여 Go To ServiceV4
 */
public class ServiceV3 {
	
	public int scoreSum() {
		int intKor = (int)(Math.random() * 100) + 1;
		int intEng =  (int)(Math.random() * 100) + 1;
		int intMath =  (int)(Math.random() * 100) + 1;
		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		return intSum;
	}
	
	public void scorePrint() {
		/*
		 * String(문자열) type 의 변수는
		 * 실체는 String 클래스 type 의 인스턴스 이다
		 * String 클래스에는 문자열을 다루는 다양한 method 들이
		 * 이미 준비되어 있다
		 * 다양한 method 를 사용하여 여러가지 기능을 손쉽게
		 * 사용할수 있다.
		 */
		String dLine = "=";
		String sLine = new String("-");
		
		int intKor = (int)(Math.random() * 100) + 1;
		int intEng =  (int)(Math.random() * 100) + 1;
		int intMath =  (int)(Math.random() * 100) + 1;
		
		System.out.println( "======================");
		System.out.println(dLine.repeat(50));
		System.out.println("철수의 성적표");
		System.out.println(sLine.repeat(50));
		System.out.println("국어 : \t" + intKor);
		System.out.println("영어 : \t" + intEng);
		System.out.println("수학 : \t" + intMath);
		System.out.println(sLine.repeat(50));
		
		// 현재 클래스의 총점 계산 method 를 호출하여 총점 받아오기
		int intSum = scoreSum();
		System.out.println("총점 : \t" + intSum);
		System.out.println(dLine.repeat(50));
		
		
		
		
	}

}
