package com.callor.var;

public class Var_06 {

	public static void main(String[] args) {

		int intNum1 = 0;
		int intNum2 = 0;

		/*
		 * 변수 이름을 명명할때는 이름만으로 의미르 파악할 수있도록 한다.
		 */
		int intSum = 0; // 합
		int intDeffrence = 0; // 차(뺄셈한 값)
		int intProduct = 0; // 곱(곱셈한 값)
		int intDivide = 0; // 나눗셈
		int intMod = 0; // 나머지

		intNum1 = 89;
		intNum2 = 3;
		intSum = intNum1 + intNum2;
		intDeffrence = intNum1 - intNum2;
		intProduct = intNum1 * intNum2;
		intDivide = intNum1 / intNum2;


		/*
		 * 나머지 연산(Modular Arithmetic)
		 * 산술에서 두 정수의 나눗셈 이후, 온전한 정수 몫으로 표현할 수 없이 남은 양을 가리킨다.
		 */
		intMod = intNum1 % intNum2;


		System.out.println("덧셈 : " + intSum);
		System.out.println("뻴셈 : " + intDeffrence);
		System.out.println("곱셈 : " + intProduct);
		System.out.println("나눗셈 : " + intDivide);
		System.out.println("나머지 : " + intMod);


		/*
		 * 선언된 변수를 사용할때 알파벳 한글자, 대소문자만 달라도 오류가 나타난다
		 * 오류가 나타나는 것은 java 문법이 그만큼 엄격함을 나타낸다
		 * 엄격한 문법 규칙은 개발자에게 처음에서는 어려움을 줄수 있으나
		 * 오히려 더 많은 오류를 방지하는 효과를 발휘한다.
		 */
		// System.out.println(intDefference);
		System.out.println(intDeffrence);


	}
}
