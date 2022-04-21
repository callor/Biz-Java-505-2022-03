package com.callor.score.controller;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV1;

public class ScoreControllerV2 {
	
	public static void main(String[] args) {
		
		ScoreService scService = new ScoreServiceImplV1();
		scService.makeScore();
		scService.printScore();
		
		
		
	}

}
