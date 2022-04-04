package com.callor.controller;
/*
 * num() 를 선언하고
 * 1 ~ 100까지 임의 정수를 2개 생성하여
 * 
 * 두 수를 덧셈하여 return
 */
public class Method_01 {
	
	public static void main(String[] args) {
		// num() 를 호출하여(실행하고) return 된 값을 
		// intResult 에 저장하기
		int intResult = num();
		System.out.println(intResult);
	}
	
	// int num() { } : 어떤 정수값을 return 하겠다
	public static int num() {
		// 임의 정수 2개를 만들고(변수에 저장하고)
		int intNum1 = (int)(Math.random() * 100) + 1;
		int intNum2 = (int)(Math.random() * 100) + 1;
		
		// 두 값을 덧셈하여 return
		return intNum1 + intNum2;
	}

}
