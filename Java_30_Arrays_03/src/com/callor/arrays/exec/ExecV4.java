package com.callor.arrays.exec;

public class ExecV4 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = (int)(Math.random() * 100) + 1;
		}

		// 짝수인 수를 덧셈할 변수를 선언
		int intEvenSum = 0;
		for (int intNum : intNums) {
			boolean bEven = intNum % 2 == 0;
			if(bEven) {
				// intEvenSum = intEvenSum + intNums[i]
				intEvenSum += intNum;
			}
		}
		System.out.println("짝수들의 합 : " + intEvenSum);





	}

}
