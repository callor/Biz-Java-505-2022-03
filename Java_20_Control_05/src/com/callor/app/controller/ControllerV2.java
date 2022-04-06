package com.callor.app.controller;

import com.callor.app.service.ServiceV2;

/*
 * ServiceV2 클래스에 guguDan() 를 선언하고
 * guguDan() 는 3단 구구단을 출력한다.
 * ControllerV2 에서는 guguDan() 호출하여
 * 구구단을 보여준다
 */
public class ControllerV2 {
	
	public static void main(String[] args) {
		
		ServiceV2 serviceV2 = new ServiceV2();
		serviceV2.guguDan();
		System.out.println("=======================");
		serviceV2.guguDan(8);
		
		
	}

}
