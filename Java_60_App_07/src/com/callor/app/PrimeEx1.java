package com.callor.app;

/*
 * 정수형 배열 100개를 선언하여 random 수 10 ~ 100까지 를 생성하고
 * 매열에 채워넣고
 * 배열에 담긴 값이 소수인지 판별하여 출력
 */
public class PrimeEx1 {
	
	public static void main(String[] args) {
		
		int[] nums = new int[100];
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = (int)(Math.random() * 91) + 10;
		}
		// 전체 배열 개수만큼 반복
		for(int j = 0 ; j < nums.length ; j++) {
			int index = 0 ;
			// 2 부터 nums[j] 에 담긴 값 -1 까지 반복
			for(index = 2 ; index < nums[j] ; index ++ ) {
				if(nums[j] % index == 0) {
					break;
				}
			} // for(index)
			// break 되었을때 도착부분
			// 여기에서 소수판별을 하여 출력
			if(index < nums[j]) {
				System.out.println(nums[j] + "소수가 아니다");
			} else {
				System.out.println(nums[j] + "는 소수");
			}
		}
	}
	

}
