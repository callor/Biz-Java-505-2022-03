package com.callor.app.controller;

import com.callor.app.service.ServiceV4;

public class ControllerV4 {
	
	public static void main(String[] args) {
		int[] scoreList = new int[10];
		ServiceV4 sV4 = new ServiceV4(scoreList);
		sV4.makeScore();
		for(int score : scoreList) {
			System.out.printf("%d, ",score);
		}
	}
}
