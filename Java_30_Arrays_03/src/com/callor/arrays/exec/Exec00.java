package com.callor.arrays.exec;

public class Exec00 {

	/*
	 * 진입점 메서드
	 * 프로젝트를 Run 했을때 제일먼저 실행되는 메서드
	 * 프로젝트를 Run 했을때 제일먼저 실행되는 위치
	 * 시작점 이라고도 함
	 */
	public static void main(String[] args) {

		/*
		 * 정수형변수 num를 선언하고 clear 하였다
		 * 정수형변수 num를 생성하였다
		 */
		int num = 0;

		/*
		 * 1. 클래스를 사용하여 객체를 선언하고 생성자를 호출하여 초기화하였다
		 * 2. exec00 인스턴스를 생성하였다
		 */
		Exec00 exec00 = new Exec00();
		// void type 의 print method 는 앞에 변수가 올수 없다
		exec00.print();

		// return type 이 정수형인 sum method 는 결과(return 결과)를
		// 변수에 저장할수 있다
		int sum = exec00.sum();


	}

	/*
	 * return type 이 정수형(int) 인 sum method 선언문
	 */
	public int sum() {
		return 0;
	}

	/*
	 * void type 의 print method 선언문
	 */
	public void print() {

	}




}
