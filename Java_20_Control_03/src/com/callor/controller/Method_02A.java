package com.callor.controller;

public class Method_02A {
	public static void main(String[] args) {
		// 여기에서 코드 들여쓰기
		int intSum = add();
		int intMuti = multi();
		System.out.println(intSum + intMuti);
		return;
	} // end main
	
	public static int add() {
		// 여기에서 코드 들여쓰기
		int intNum1 = (int)(Math.random() * 100) +1;
		int intNum2 = (int)(Math.random() * 100) +1;
		return intNum1 + intNum2;
	}

	public static int multi() {
		int intNum1 = (int)(Math.random() * 100) +1;
		int intNum2 = (int)(Math.random() * 100) +1;
		return intNum1 * intNum2;
	}

}
