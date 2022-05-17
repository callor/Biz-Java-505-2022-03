package com.callor.app.service;

import java.util.List;

public class ServiceV2 {

	private final List<Integer> intList;
//	private final ArrayList<Integer> intList;

	// intList 를 직접 초기화 하지 않고
	// ServiceV2 를 사용하는 곳에서 주입하기
	public ServiceV2(List<Integer> intList) {
		this.intList = intList;
	}

	/*
	 * length 변수를 매개변수 받아서
	 * length 개수만큼의 random 수를 저장한
	 * intList 를 return
	 */
	public List<Integer> getScore(int length) {
		for(int i = 0 ; i < length ; i++) {
			int rnd = (int)(Math.random() * 100) + 1;
			intList.add(rnd);
		}
		return intList;
	}


}
