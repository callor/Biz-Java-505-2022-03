package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;

public class ServiceV1 {
	
	// final : 이 변수는 딱 한번만 값을 저장할수 있다
	private final List<Integer> intList;
	
	// final 로 선언된 변수는 반드시 생성자에서 초기화한다.
	public ServiceV1() {
		intList = new ArrayList<>();
	}
	
	public void makeScore() {
		for(int i = 0 ; i < 10 ; i++) {
			Integer rnd = (int)(Math.random() * 100) + 1;
			intList.add(rnd);
		}
		// intList 는 final 로 선언되어 있기 때문에
		// 다시 초기화 할수 없다
		// intList = new ArrayList<>();
	}
	
	public List<Integer> getIntList() {
		return intList;
	}
	
	

}
