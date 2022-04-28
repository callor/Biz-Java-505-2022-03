package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec2A {
	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		for(int i = 0 ; i < 100 ; i++) {
			int num = (int)(Math.random() * 100) + 1;
			nums.add(num);
		}
		
		int index = 0;
		for(int num : nums) {
			if(num >= 55) {
				System.out.printf("\t%3d : %3d\n",index,num);	
			}
			index++;
		}
		
		int size = nums.size();
		for(int i = 0 ; i < size ; i++) {
			if(nums.get(i) >= 55) {
				System.out.printf("\t%3d : %3d\n", i, nums.get(i));
			}
		}
		
	}

}
