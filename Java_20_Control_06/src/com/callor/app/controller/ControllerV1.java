package com.callor.app.controller;

import com.callor.app.service.ServiceV1;

public class ControllerV1 {
	
	public static void main(String[] args) {
		
		// ServiceV1 클래스는 선언만 한 상태
		// (아무런 코드가 아직 준비되지 않은상태)
		// 이지만 ServiceV1 클래스를 사용하여 serviceV1 인스턴스를
		// 생성할 수 있다.
		ServiceV1 serviceV1 = new ServiceV1();
		System.out.println(serviceV1);
		
		ServiceV1 serviceV11 = new ServiceV1();
		System.out.println(serviceV11);
		
		int intResult = serviceV1.scoreSum();
		System.out.println(intResult);
		
	}

}
