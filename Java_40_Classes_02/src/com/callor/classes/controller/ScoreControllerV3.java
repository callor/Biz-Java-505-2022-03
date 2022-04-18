package com.callor.classes.controller;

import com.callor.classes.service.ScoreServiceV3;

public class ScoreControllerV3 {
	
	public static void main(String[] args) {
		
		ScoreServiceV3 scServiceV3 = new ScoreServiceV3();
		scServiceV3 = new ScoreServiceV3(20);

		// String[] strNames = new String[5];
		// strNames[0] = "홍길동";
		// strNames[1] = "이몽룡";
		// strNames[2] = "성춘향";
		// strNames[3] = "임꺽정";
		// strNames[4] = "장보고";
		String[] strNames = {"홍길동",
							"이몽룡",
							"성춘향",
							"임꺽정",
							"징보고"};
		
		scServiceV3 = new ScoreServiceV3(strNames);
		
		
		
	}

}
