package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec11 {
	// 1 ~ 100까지 임의의 정수 100개를 생성하여
	// list 에 추가하고
	// list 에 추가된 정수들의 합을 구하기
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		for(int i = 0 ; i < 100 ; i ++) {
			int num =  (int)(Math.random() * 100) + 1;
			intList.add(num);
		}
		int sum = 0 ;
		for(int num : intList) {
			sum += num;
		}
		System.out.println(sum);
	}

}
