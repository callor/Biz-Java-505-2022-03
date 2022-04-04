package com.callor.service;

public class ServiceV1 {
	/*
	 * add() 는 static 으로 선언되었다
	 * add() 는 코드가 run 되는 순간 add() 를
	 * 사용가능한 상태가 된다.
	 * static method 는 클래스.method() 와 같이 호출(실행) 한다
	 */
	public static int add() {
		int intNum1 = (int)(Math.random() * 100) + 1;
		int intNum2 = (int)(Math.random() * 100) + 1;
		return intNum1 + intNum2;
	}
	public static int multi() {
		int intNum1 = (int)(Math.random() * 100) + 1;
		int intNum2 = (int)(Math.random() * 100) + 1;
		return intNum1 * intNum2;
	}
	
	

}
