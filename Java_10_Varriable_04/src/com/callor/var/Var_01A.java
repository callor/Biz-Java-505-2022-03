package com.callor.var;

import javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener;

public class Var_01A {

	// main method
	public static void main(String[] args) {

		// 변수를 선언하고 clear(0을 저장, 대입)
		int intNum1 = 0;
		int intNum2 = 0;
		
		// 변수에 값 저장하기
		// 변수에 어떤 값을 저장하면 이미 저장된 값은? : 무조건 사라진다
		intNum1 = 33;
		intNum2 = 55;
		
		// 4칙연산 결과를 저장(보관)하기 위한 변수 선언 clear
		int intSum = 0;
		int intMultipule = 0 ;
		int intMinus = 0;
		int intDivition = 0;
		
		// intNum1, intNum2 변수에 담긴 값을 읽어와서
		// 4칙연산을 수행한 후 각각의 변수에 저장하기
		// 변수에 담긴 값을 읽어서 연산을 수행한 후 다른 변수에 저장하기
		intSum = intNum1 + intNum2;
		intMultipule = intNum1 * intNum2;
		intMinus = intNum1 - intNum2;
		intDivition = intNum1 / intNum2;
		
		// 화면에 form 을 만든 후 출력하기
		System.out.printf("\t%d + %d = %d\n", intNum1, intNum2, intSum);
		System.out.printf("\t%d - %d = %d\n", intNum1, intNum2, intMinus);
		System.out.printf("\t%d x %d = %d\n", intNum1, intNum2, intMultipule);
		System.out.printf("\t%d ÷ %d = %d\n", intNum1, intNum2, intDivition);
		
		
		
		
		

	}

}
