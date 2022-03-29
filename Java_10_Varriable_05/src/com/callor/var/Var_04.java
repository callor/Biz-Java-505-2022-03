package com.callor.var;

public class Var_04 {
	
	public static void main(String[] args) {
		
		/*
		 * 문자(영문자, 숫자, 한글 1글자, 특수문자)를 
		 * 저장하는 변수 type
		 * 문자를 작은따옴표( SQ ) 로 묶는다
		 * 키보드로 입력할수 있는 문자 를 저장하는 변수
		 */
		char charA = '가';
		char charB = 'A';
		
		System.out.println(charA);
		System.out.println(charB);
		
		System.out.printf("\t%c\n",charB);
		
		/*
		 * charA, charB 에는 '문자' 가 저장되어 있다
		 * charA : '가', charB : 'A' 가 저장되어 있지만
		 * 실제 저장된 값은 문자의 표현을 10진수로 바꾸어 저장한다
		 * 저장된 10진수는 정수형으로 바꾸어 실제 값을 확인 할수 있다
		 * 
		 * intA = (int)charA : Unicode 형식의 '가' 문자의
		 * 		실제 데이터(코드값)를 정수형 값으로 변환하여 저장
		 * intB = (int)charB : ASCII 형식의 'A' 문자의
		 * 		실제 데이터(코드값)를 정수형 값으로 변환하여 저장
		 */
		int intA = (int)charA;
		int intB = (int)charB;

		// 변수에 저장된 문자와 문자의 코드값(code value) 을 확인 
		System.out.printf("\t%c : %d \n", charA, intA);
		System.out.printf("\t%c : %d \n", charB, intB);
		
		
		
		
	}

}
