package com.callor.var;

public class Var_03 {
	
	public static void main(String[] args) {
		
		int result = add();
		System.out.println(result);
		
	}
	
	/*
	 * add() 를 선언하기
	 * add() 는 num1, num2, intSum 변수를 각각 선언하고
	 * num1, num2 에 각각 99와 3을 저장하고
	 * num1, num2 에 저장된 값을 읽어서 덧셈을 실행하여
	 * intSum에 저장하고
	 * intSum 에 저장된 값을 읽어서 return 하라
	 */
	public static int add() {
		int num1 = 99;
		int num2 = 3;
		int intSum = num1 + num2;
		// intSum 변수에 저장된 값을 return 하라
		// intSum 변수를 return 하라는 것이 아~~니~~다
		return intSum;
	}

}
