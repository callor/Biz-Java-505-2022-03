package com.callor.arrays.service;

public class ServiceV1A {

	/*
	 * private 으로 선언된 makeScore() 는
	 * ServiceV1A 클래스 블럭( {} )에서만 접근(호출) 할수 있다
	 * local method(지역 메소드) 라고 한다
	 */
	private int makeScore() {
		return (int)(Math.random() * 100) +1;
	}

	/*
	 * public 으로 선언된 scoreKorSum() 은 이 프로젝트의 어디에서
	 * 클래스의 인스턴스를 생성하고
	 * 인스턴스를 통하여 접근(호출)할수 있다
	 */
	public int scoreKorSum() {

		/*
		 * V1 에서 Math.random() 를 사용하여 점수를 생성하는 코드를
		 * makeScore() 로 이전하고, 점수 생성이 필요한 경우
		 * makeScore() 를 호출하여 결과를 사용한다
		 */
		int intKor1 = makeScore();
		int intKor2 = makeScore();
		int intKor3 = makeScore();
		int intKor4 = makeScore();
		int intKor5 = makeScore();

		int intSum = intKor1;
		intSum += intKor2;
		intSum += intKor3;
		intSum += intKor4;
		intSum += intKor5;

		return intSum;

	}


}
