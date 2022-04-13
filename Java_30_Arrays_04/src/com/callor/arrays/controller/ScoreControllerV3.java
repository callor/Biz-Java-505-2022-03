package com.callor.arrays.controller;

import com.callor.arrays.service.ScoreServiceV3;

public class ScoreControllerV3 {
	
	public static void main(String[] args) {
		ScoreServiceV3 scServiceV3 = new ScoreServiceV3();
		scServiceV3.printNo1Score();
		
		/*
		 * ScoreServiceV3 에 선언된 intKor 배열은
		 * private 접근 제한자가 설정 되어 있기 때문에
		 * 인스턴스를 통하여 배열에 접근 할수 없다
		 */
		// scServiceV3.intKor[1] = 100;
		scServiceV3.printNo1Score();
		
	}

}
