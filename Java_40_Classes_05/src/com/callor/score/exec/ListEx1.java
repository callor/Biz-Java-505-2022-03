package com.callor.score.exec;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx1 {

	public static void main(String[] args) {

		List<Integer> nums1 = new ArrayList<>();
		List<Float> nums2 = new LinkedList<>();

		nums1.add(10);
		nums1.add(20);
		nums1.add(30);

		int num0 = nums1.get(0);
		System.out.println(num0);

		System.out.println(nums1.get(1));
		System.out.println(nums1.get(2));

		// 현재 3개의 데이터만 추가되어 있기 때문에
		// index 3번 요소의 값은 get() 할수 없다
		// System.out.println(nums1.get(3));

		for (Integer element : nums1) {
			System.out.println(element);
		}

		// 위 코드에서 nums1.size() 는 nums1 의 요소 개수만큼
		// 반복하여 호출 실행된다.
		// 이는 비 효율적인 코드가 될 것이다
		// size 값을 for() 명령 이전에 변수에 담아두고 시작하자
		int nums1Len = nums1.size();
		for(int i = 0 ; i < nums1Len ; i++) {
			Integer num = nums1.get(i);
			System.out.println(num);
		}

		for(Integer num : nums1) {
			System.out.println(num);
		}



	}

}
