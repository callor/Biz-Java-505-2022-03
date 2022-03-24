package com.callor.var;

public class Var_02 {
	public static void main(String[] args) { // main() 시작
		
		int intNum1 = 0; // 변수의 선언과 clear
		/*
		 * main() {} 블럭에서 선언된 intNum1 변수는
		 * main() {} 블럭이 끝나는 시점에 모두 소멸된다
		 */
		int intNum2 = 0;
		
		intNum1 = 55; // 변수에 값을 할당, 대입, 저장하기
		/*
		 * 이 명령문이 실행되는 순간
		 * 이전에 변수에 어떤 일이 있던지 상관 없이 모든 값이 clear 되고
		 * intNum1 변수에는 55 만 담겨 있게 된다.
		 */
		
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
		
		/*
		 * 블럭( {} ) 내에서 선언하고 값이 할당된 변수가 있을때
		 * 변수에서 값을 읽어서 연산을 수행하는데
		 * 어떠한 연산을 수행하든 읽기를 수행하는 변수의 값은
		 * 절대 변함이 없다
		 * 
		 * 다만, 어딘선가 변수에 또다른 값을 할당하면
		 * 변수 값이 변하게 된다.
		 */
		int intNum3 = 1000;
		System.out.println(intNum3);
		System.out.println(intNum3);
		System.out.println(intNum3);
		System.out.println(intNum3);
		System.out.println(intNum3);
		System.out.println(intNum3);
		
	} // main() 이 끝나는 곳
	/**
	 * main() {} 블럭의 밖에서는
	 * 명령문을 사용할수 없다.
	 * 또한 intNum3 변수도 사용(읽기 저장) 할수 없다
	 */
	// System.out.println(intNum3); 사용불가한 코드
	
} // class Var_02 가 끝나는 곳
