package com.callor.app.exec;

/*
 * 1 ~ 100까지 덧셈
 * 1 + 2 + 3 + 4 + 5 + .... +100
 */
public class Exec2 {

	public static void main(String[] args) {

		int intSum = 0;
		// 1 ~ 100까지의 숫자를 intSum 변수에 누적하기
		intSum += 1;
		intSum += 2;
		intSum += 3;

		// 용돈 누적연산
		// 매일매일 사용한 용돈을
		// 어떤 한 변수에 계속해서 더해나가면
		// 한달후에 변수에 저장된 금액은
		// 한달동안 사용한 용돈의 총 금액이 된다

		int index;
		intSum = 0;
		// index : 0 ~ 99 계속해서 순서대로 변화가 된다
		for(index = 0; index < 100;index++) {
			intSum += ( index + 1 );
		}
		System.out.println("1 ~ 100까지 정수의 덧셈결과 : " + intSum);


	}

}
