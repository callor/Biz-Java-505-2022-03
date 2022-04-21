package com.callor.score.controller;

import java.util.Scanner;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.impl.ScoreServiceImplV1;
import com.callor.score.service.impl.StudentServiceImplV1;

public class ScoreControllerV1 {
	
	public static void main(String[] args) {
		
		String stFile = "student.txt";
		int stLength = 50;
		
		StudentServiceImplV1 stService1 
			= new StudentServiceImplV1(stFile, stLength);
		
		stService1.loadStudent();
		StudentVO[] stList = stService1.getStudents();
		StudentVO stNo1 = stService1.findByNum("0001");
		
		ScoreServiceImplV1 scServiceV1 = new ScoreServiceImplV1();
		scServiceV1.makeScore();
		int intSum = scServiceV1.retSum();
		float fAvg = scServiceV1.retAvg();
		scServiceV1.printScore();
		
	}

}
