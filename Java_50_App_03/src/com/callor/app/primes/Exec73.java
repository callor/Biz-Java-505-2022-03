package com.callor.app.primes;

import java.util.ArrayList;
import java.util.List;

public class Exec73 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for(int i = 0 ; i < 100 ; i++) {
			int num = (int)(Math.random() * 100) + 2;
			nums.add(num);
		}
		int count = 0;

		// Integer num = nums.get(0)
		// Integer num = nums.get(1)
		// Integer num = nums.get(2)
		// Integer num = nums.get(3)
		for(Integer num : nums) {
			int index = 0;
			for(index = 2; index < num ; index++) {
				if(num % index == 0) {
					break;
				}
			}
			if(index >= num) {
				count++;
			}
		}
		System.out.println("소수의 개수 : " + count);
	}

}



