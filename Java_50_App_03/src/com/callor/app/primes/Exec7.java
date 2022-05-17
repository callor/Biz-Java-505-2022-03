package com.callor.app.primes;

public class Exec7 {

	/*
	 * 100의 배열을 만들고
	 * 2 ~ 101 까지 임의 정수를 각 요소에 저장
	 * 각 요소에 저장된 값중에 소수가 몇개인가 찾아서 출력
	 */
	public static void main(String[] args) {
		int[] nums = new int[100];
		for(int i = 0 ; i < nums.length ; i++) {
			int num = (int)(Math.random() * 100) + 2;
			nums[i] = num;
		}

		int count = 0;
		// 배열 전체 요소 개수만큼 반복하기
		for (int num : nums) {

			// 배열의 i 번째 요소에 저장된 수가 소수인가 판별
			int index = 0;
			for(index = 2 ; index < num  ; index++) {
				if(num % index == 0) {
					break;
				}
			}
			// 배열의 i 번째 요소가 소수이면 count 증가
			// if( index >= nums[i] )
			if( !(index < num) ) {
				count ++;
			}
		}
		System.out.println("소수의 개수 : " + count);




	}

}
