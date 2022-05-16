package com.callor.app.exec;

public class Exec02 {
	
	public static void main(String[] args) {
		
		int[] nums = new int[10];
		
		// 배열에 값을 채워 넣는 부분
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = (int)(Math.random()* 100) + 1;
		}
		
		// 연산하는 부분
		int count = 0; // 개수세기
		int sum = 0; // 합계
		for(int num : nums) {
			if(num % 2 == 0) {
				count++;
				sum += num;
			}
		}
		System.out.printf("짝수의 개수는 %d 이고 합계는 %d",count,sum);
	}

}
