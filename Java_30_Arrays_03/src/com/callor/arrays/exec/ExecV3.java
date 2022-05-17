package com.callor.arrays.exec;

public class ExecV3 {

	public static void main(String[] args) {

		int[] intNum = new int[100];
		for(int i = 0 ; i < intNum.length ; i++) {
			intNum[i] = (int)(Math.random() * 100) +1;
		}

		// 짝수의 개수를 세어서 저장할 변수
		int intEvenCount = 0;
		for (int element : intNum) {
			boolean bEven = (element % 2) == 0;
			if(bEven) {
				intEvenCount++;
			}
		}
		System.out.println("짝수의 개수 : " + intEvenCount);

	}

}
