package com.callor.arrays.controller;

import com.callor.arrays.service.ScoreServiceV4;

public class ScoreControllerV4 {
	
	public static void main(String[] args) {
		ScoreServiceV4 scServiceV4 = new ScoreServiceV4(150);
		scServiceV4.makeScore();
		scServiceV4.printScore();
		
	}

}
