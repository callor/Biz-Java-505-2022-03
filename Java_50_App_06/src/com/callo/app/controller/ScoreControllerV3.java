package com.callo.app.controller;

import com.callo.app.service.ScoreService;
import com.callo.app.service.impl.ScoreServiceImplV3;

public class ScoreControllerV3 {

	public static void main(String[] args) {

		ScoreService scService = new ScoreServiceImplV3();
		scService.makeScore();
		scService.printScore();

	}

}
