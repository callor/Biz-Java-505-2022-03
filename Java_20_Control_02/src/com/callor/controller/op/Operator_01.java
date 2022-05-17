package com.callor.controller.op;

public class Operator_01 {

	public static void main(String[] args) {

		/*
		 * 명령문(statement)
		 * java 코드에서 명령문은 반드시 끝에 세미콜론(;)이 온다
		 * 명령문의 시작은 key word와 변수만 올수 있다
		 * key word 로 시작하는 명령문은 어떤 기능을 수행하는 경우이고
		 * 변수로 시작하는 경우는 연산자가 따라온다
		 * 변수의 바로 다음에 오는 연산자
		 * 		대입연산자(=), 단항연산자(++,--),
		 * 		복합연산자( +=, *=, -= /= %=),
		 * 		삼항연산자 둥이 있다
		 */
		int intNum1 = 10;
		int intNum2 = 0;

		// 대입연산자 : 리터럴 100을 변수 intNum2에 대입하라
		intNum2 = 100;

		System.out.println(intNum1);
		System.out.println(intNum2);

		// 단항연산자 : 혼자 스스로 1을 증가시키고 그 결과를 intNum2에 저장하라
		intNum2++; // intNum2 를 1 증가시켜라
		System.out.println(intNum2);

		// 대입연산자
		intNum2 = ++intNum1; // intNum1 을 1증가키고 결과를 intNum2에 저장
		System.out.println(intNum2);

		// 대입연산자
		intNum1 = intNum1 + 10; // intNum1 의 값을 10 증가시켜라
		intNum2 = intNum1; // intNum1 에 저장된 값을 intNum2에 복사하라
		System.out.println(intNum2);

		// 복합연산자(+=, *=. -+. /=)
		// 먼저 앞의 변수이름이 설정된 기억장치에서 값을 읽어 온후
		// 연산(여기서는 +10)을 실행하고
		// 결과를 맨앞의 변수에 저장하라
		intNum1 += 10; // intNum1 의 값을 10 증가시켜라
		intNum2 = intNum1;
		System.out.println(intNum2);

		/*
		 * 대입연산자가 변수 다음에 올 경우
		 * 1. 무조건 오른쪽을 먼자 바라본다
		 * 가. (intNum1 = intNum1 + 10) 을 먼저 바라본다
		 * 나. intNum1 다음에 또 대입연산자가 온다
		 * 다. 다시 오른쪽을 바라본다
		 * 라. intNum1 + 10 연산을 수행한다.
		 *
		 * 2. 라의 결과를 intNum1 에 대입(저장) 한다.
		 * 3. intNum1 에 저장된 값을 읽어서 intNum2에 저장한다
		 */
		intNum2 = intNum1 = intNum1 + 10;
		System.out.println(intNum2);

		// 대입연산식(intNum1 = intNum2 + 10) 이
		// 다른 명령문 내에 포함되는 경우
		// 대입연산식을 따로 떼어서 바라보자
		// 1. intNum2 + 10 을 연산하고
		// 2. 결과를 intNum1 에 대입(저장)한다.
		// 3. intNum1 저장된 값을 console 에 출력하고
		// 4. intNum1 의 값은 그대로 유지한다.
		// 5. 이후의 코드에서 intNum1 값을 사용할 수 있다
		System.out.println(intNum1 = intNum2 + 10);

		System.out.println(intNum1 = intNum2 += 30);


	}

	public static int num() {
		return 0;
	}
}
