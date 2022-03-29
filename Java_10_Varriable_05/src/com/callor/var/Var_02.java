package com.callor.var;

public class Var_02 {
	
	public static void main(String[] args) {
		
		double doNum1 = 0;
		double doNum2 = 0;
		
		doNum1 = Math.random() * 1000;
		doNum2 = Math.random() * 1000;
		
		double doSum = doNum1 + doNum2;
		double doDes = doNum1 - doNum2;
		double doMulti = doNum1 * doNum2;
		double doDiv = doNum1 / doNum2;
		
		/*
		 * printf() 를 사용하여 3개 변수에 담긴 데이터를 console 에 출력하기
		 * "%d + %d = %d" form String 을 사용하여 출력할 모양을 지정하고
		 * 각각 %d 위치에 표현할 데이터를 3개 나열했다
		 * 여기에 %d 는 Decimal(10진수)를 표현하는 키 단어이다
		 * 그런데 doNum1, doNum2, doSum 변수는 double type 이다
		 * double type 변수에 담긴 값을 %d 로 표현하려면
		 * 내부에서 데이터 type 문제로 인한 중대한 문제가 발생한다.
		 * %d 는 정수만 표현할수 있는데 실수값을 표현하라고 했기 때문에
		 * 		발생하는 문제이다
		 */
		// System.out.printf("\t%d + %d = %d\n",doNum1, doNum2, doSum);
		
		/*
		 * printf() 를 사용하여 실수 데이터를 Console 에 출력하려면 %f 기호를
		 * 사용하여 표현해야 한다.
		 */
		System.out.printf("\t%f + %f = %f\n",doNum1, doNum2, doSum);
		
		// %.2f : 정수부분은 모두 표현하고 소수점이하 2째자리까지 출력하라
		System.out.printf("\t%.2f + %.2f = %.2f\n",doNum1, doNum2, doSum);
		
		System.out.println("\t=========================");
		System.out.printf("\t%.2f + %.2f = %.2f\n",doNum1, doNum2, doSum);
		System.out.printf("\t%.2f x %.2f = %.2f\n",doNum1, doNum2, doMulti);

		/*
		 * %8.2f : 전체 자릿수를 8개로 하고 소수점이하 2째까지 표현
		 * 만약 데이터가 전체 자릿수 보다 작으면 남은 부분을 공백으로 표현
		 * 숫자를 오른쪽으로 정렬할때 사용하는 방법
		 */
		System.out.println("\t=========================");
		System.out.printf("\t%.2f + %.2f = %8.2f\n",doNum1, doNum2, doSum);
		System.out.printf("\t%.2f x %.2f = %8.2f\n",doNum1, doNum2, doMulti);

		
		
	}

}
