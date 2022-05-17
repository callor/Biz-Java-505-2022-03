package com.callor.app.controller;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV4;

public class ScoreControllerV4 {

	public static void main(String[] args) {
		ScoreService scService = new ScoreServiceImplV4();
		scService.inputScore();
		scService.saveScore();
	}

}
