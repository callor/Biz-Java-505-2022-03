package com.callor.arrays.controller;

import com.callor.arrays.service.StudentServiceV1;

public class StudentController {
	
	public static void main(String[] args) {
		
		// 기본생성자를 호출하여 인스턴스 생성
		StudentServiceV1 stService10 = new StudentServiceV1();
		
		// 임의생성자를 호출하여 인스턴스 생성
		StudentServiceV1 stService = new StudentServiceV1(5);
		
		stService.inputStudent();
		// stService.printStudent();
		
				
		
	}

}
