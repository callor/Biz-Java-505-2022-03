package com.callor.var;

public class Var_02 {
	public static void main(String[] args) {
		int intNum1 = 0;
		int intNum2 = 0;
		
		intNum1 = 55;
		intNum2 = 33;
		
		// 이 명령문을 만나면
		// 1. intNum1 에 저장된 값을 읽어온다
		System.out.println("55 + 33 = " + intNum1 + intNum2);
		// 2. intNum1 에 담긴 숫자형 데이터를 
		//		문자열형 데이터로 바꿔버린다
		// 3. intNum2 에 저장된 값을 읽어온다
		System.out.println("55 + 33 = " + "55" + intNum2);
		
		// 4. intNum2 에 담긴 숫자형 데이터를
		//		문자열형 데이터르 바꿔버린다
		System.out.println("55 + 33 = " + "55" + "33");
		
		intNum1 = 77;
		intNum2 = 99;
		
		System.out.println("55 + 33 = " + (intNum1 + intNum2));
		System.out.println("55 x 33 = " + (intNum1 * intNum2));
		System.out.println("55 - 33 = " + (intNum1 - intNum2));
		System.out.println("55 / 33 = " + (intNum1 / intNum2));
		
	}
}
