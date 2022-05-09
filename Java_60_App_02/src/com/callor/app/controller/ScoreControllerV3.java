package com.callor.app.controller;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV3;

public class ScoreControllerV3 {
	
	public static void main(String[] args) {
		ScoreService scService = new ScoreServiceImplV3();
		scService.inputScore();
		scService.saveScore();
	}

}
