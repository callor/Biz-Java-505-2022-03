package com.callor.var;

public class Var_04 {
	
	public static void main(String[] args) {
		
		int intSum = 0;
		
		/*
		 * 할당명령문(변수에 값을 할당, 저장, 대입하는 명령문)에
		 * 연산식이 따라오면
		 * 1. EQ(=) 의 오른쪽 연산을 항상 먼저 실행한다
		 * 2. 그리고 실행한 결과를 왼쪽의 변수에 저장한다
		 */
		intSum = 55 + 33;
		System.out.println(intSum);
		
		int intNum1 = 77;
		int intNum2 = 99;
		/*
		 * 1. intNum1 변수의 값을 읽어서
		 * 		CPU(ACC)에 가져오기
		 * 2. intNum2 변수의 값을 읽어서
		 * 		CPU에 가져오기
		 * 3. 두 값을 덧셈하여 결과를
		 * 		변수 intSum에 저장하기
		 */
		intSum = intNum1 + intNum2;
		
		System.out.println(intSum);
		
	}

}
