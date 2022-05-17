package com.callor.arrays.service;

public class ScoreServiceV3 {

	/*
	 * 클래스 영역에 선언된 배열(변수) = 인스턴스 배열(변수)
	 * 변수를 클래스 영역에 선언할때는 특별한 경우가 아니면
	 * private 접근 제한자를 설정한다.
	 *
	 * 정보의 은닉 :
	 * 클래스 영역에 선언된 변수에 private 을 설정하므로써
	 * 변수는 외부의 접근을 차단한다
	 *
	 */
	private int[] intKor;

	public ScoreServiceV3() {
		intKor = new int[100];
	}

	public void printNo1Score() {
		System.out.println("1번 학생 점수 : " + intKor[1]);
	}

}
