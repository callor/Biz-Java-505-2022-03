package com.callor.score.controller;

import com.callor.score.service.impl.ScoreServiceImplV1;

public class ScoreControllerV1 {
	
	public static void main(String[] args) {
		
		ScoreServiceImplV1 scServiceV1 = new ScoreServiceImplV1();
		scServiceV1.makeScore();
		int intSum = scServiceV1.retSum();
		float fAvg = scServiceV1.retAvg();
		scServiceV1.printScore();
		
	}

}
