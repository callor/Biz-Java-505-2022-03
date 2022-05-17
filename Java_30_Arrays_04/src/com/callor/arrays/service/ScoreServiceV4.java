package com.callor.arrays.service;

import com.callor.arrays.utils.Line;

public class ScoreServiceV4 {

	/*
	 * 인스턴스변수(클래스 영역에 선언된 변수)
	 * 인스턴스변수는 선언문만 있고 초기화 코드는 없다
	 * 인스턴스변수는 클래스의 생성자 메서드에서 변수를 초기화 한다
	 * 인스턴스변수가 배열일 경우
	 * 		정수형매개변수가 있는 생성자를 선언하여
	 * 		생성되는 배열의 개수를 Controller 에서 설정할수 있다
	 *
	 * 이러한 패턴은 Service 클래스의 코드 변경을 최소화 하여
	 * 		잠재적인 문제를 방지 할수 있다.
	 */
	private int[] intKor;
	public ScoreServiceV4() {
		intKor = new int[100];
	}
	public ScoreServiceV4(int length) {
		intKor = new int[length];
	}
	// ScoreServiceV1 에서 복사한 코드
	public void makeScore() {
		for(int i = 0 ; i < intKor.length ; i++) {
			intKor[i] = (int)(Math.random() * 50) + 51;
		}
	}

	// ScoreServiceV2 에서 복사한 코드
	public void printScore() {
		System.out.println( Line.dLine(50) );
		System.out.println("국어 성적 일람표");
		System.out.println( Line.sLine(50) );

		for(int i = 0 ; i < intKor.length ; i++) {

			System.out.printf("%d:%d\t\t",(i+1), intKor[i]);

			if( (i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println( Line.dLine(50) );
	}


}
