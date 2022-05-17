package com.callor.var;

public class Var_01 {

	public static void main(String[] args) {

		// 1 ~ 1000 까지 범위중 임의 수 1개를 생성하여 intNum1 저장
		int intNum1 = (int)(Math.random() * 1000) + 1;
		int intNum2 = (int)(Math.random() * 1000) + 1;

		System.out.printf("\tintNum1 : %d\n",intNum1);
		System.out.printf("\tintNum2 : %d\n",intNum2);

		System.out.println("\t num1 > num2 "
						+ ( intNum1 > intNum2));
		System.out.println("\t num1 < num2 "
						+ ( intNum1 < intNum2));
		System.out.println("\t num1 == num2 "
						+ ( intNum1 == intNum2));
		/*
		 * 두개의 비교대상(intNum1, intNum2)에 담긴 값이
		 * 정확히 일치하지 않으면 true,
		 * 두개의 비교대상이 같이 않냐? 라고 묻는다
		 */
		System.out.println("\t num1 <> num2 "
						+ ( intNum1 != intNum2));

		/*
		 * Literal(리터럴) : 값을 명확히 확인할 수 있는 값
		 * 일반적인 숫자값 "문자열"
		 * Java 에서 리터럴과 리터럴을 비교연산 하는 것은
		 * 거의 의미가 없다
		 * 때문에 eclipse 에서 오류 또는 경고를 보여준다
		 */
		System.out.println(30 == 30);
		System.out.println(30 > 30);



	}

}
