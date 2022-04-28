package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec3A {
	
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for(int i = 0 ; i < 100 ; i++) {
			int num = (int)(Math.random()* 100) + 1;
			nums.add(num);
		}
		for(int i = 0 ; i < nums.size();i++) {
			if(nums.get(i) >= 55) {
				System.out.printf("%3d : %3d\n", i, nums.get(i));
				break;
			}
		}
		int index = 0 ;
		for(int num : nums) {
			if(num >=55) {
				System.out.printf("%3d :%3d\n",index,num);
				break;
			}
			index++;
		}
		
		
		
	}
}
