package com.callor.service;

public class ServiceV2 {
	
	/*
	 * add() 는 dynamic method 이다
	 * 이 method 는 클래스.method() 처럼 직접 호출 할 수 없다
	 */
	public int add() {
		return 30 + 40;
	}
	public int multi() {
		return 30 * 40;
	}

}
