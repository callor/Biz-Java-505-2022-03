package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec11 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for(int i = 0 ; i < 100 ; i++) {
			nums.add((int)(Math.random() * 100) + 1);
		}
		for(int num : nums) {
			if(num >= 55) {
				System.out.println(num);
			}
		}
	}

}
