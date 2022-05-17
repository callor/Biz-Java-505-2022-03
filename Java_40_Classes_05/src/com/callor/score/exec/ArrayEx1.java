package com.callor.score.exec;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] intNums = new int[10];
		for(int i = 0; i < intNums.length ; i++) {
			intNums[i] = (int)(Math.random() * 100) +1;
		}

		for (int intNum : intNums) {
			System.out.printf("%d\t", intNum);
		}
		System.out.println();

		/*
		 * forEach : 확장된 for() 명령, 새로운 for() 명령
		 * 배열의 0 부터 끝까지(전체요소)에 대하여 연속적으로
		 * 연산을 수행하기 위한 simple 한 for() 명령이다
		 *
		 * int num = intNums[0]
		 * int num = intNums[1]
		 * int num = intNums[2]
		 * int num = intNums[3]
		 * int num = intNums[4]
		 * int num = intNums[5]
		 *
		 * 이 코드는 전체 배열에 연산을 하고자 할때
		 * 배열요소에 값을 저장할때는 사용할 수 없다
		 * 배열요소 전체를 개별적으로 읽어서 연산을 수행하고자 할대
		 */
		for(int num : intNums) {
			System.out.printf("%d\t", num);
		}


	}

}
