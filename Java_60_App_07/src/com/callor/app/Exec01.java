package com.callor.app;

import java.util.ArrayList;
import java.util.List;

/*
 * intList 이름으로 Integer 형 리스트를 선언
 * 
 */
public class Exec01 {
	
	public static void main(String[] args) {
		
		// 개수가 하나도 없는 리스트를 만들고
		List<Integer> intList = new ArrayList<>();
		
		// 생성할 list 개수
		int length = 500;
		for(int i = 0 ; i < length ; i++) {
			int num = (int)(Math.random() * 100) +1;
			intList.add(num);
		}
		
		// 배열은 사전에 개수를 정해서 만들고
		// 각 요소에 값을 저장
		int[] nums = new int[100];
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = (int)(Math.random() * 100) +1;
		}
		
		int sum = 0;
		for(int num : intList) {
			sum += num;
		}
		
		// 리스트에 저장된 값 합산하기
		sum = 0;
		int size = intList.size();
		for(int i = 0 ; i < size ; i++) {
			sum += intList.get(i);
		}
		
		// 배열에 저장된  값 합산하기
		sum = 0 ;
		for(int i = 0 ; i < nums.length ; i++) {
			sum += nums[i];
		}
	}
}
