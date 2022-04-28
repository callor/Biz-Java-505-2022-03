package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec4A {
	
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for(int i = 0 ; i < 100 ; i++) {
			int num = (int)(Math.random()* 100) + 1;
			nums.add(num);
		}
		
		int lastIndex = 0;
		int lastValue = 0;
		int size = nums.size();
		for(int i = 0 ; i < size ; i++) {
			int num = nums.get(i);
			if(num >= 55) {
				lastIndex = i;
				lastValue = num;
			}
		}
		System.out.printf("%3d 번째 %3d",lastIndex, lastValue);
		
		lastIndex = 0;
		for(int i = 0 ; i < size ; i++) {
			int num = nums.get(i);
			if(num >= 55) {
				lastIndex = i;
			}
		}
		System.out.printf("%3d 번째 %3d",lastIndex,nums.get(lastIndex));
		
		// for() index 를  역순으로 진행하기 
		for(int i = size - 1; i > -1 ; i--) {
			if(nums.get(i) >= 55) {
				System.out.printf("%3d 번째 %3d", i, nums.get(i));
				break;
			}
		}
		
	}

}
