package com.callor.app.service;

import java.util.List;

public class ServiceV3 {
	
	private final List<Integer> intList;
	public ServiceV3(List<Integer> intList) {
		this.intList = intList;
	}
	
	public void makeScore(int length) {
		for(int i = 0 ; i < length ; i++) {
			int rnd = (int)(Math.random() * 100) + 1;
			this.intList.add(rnd);
		}
	}

}
