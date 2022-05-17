package com.callor.var;

public class Var_03 {
	public static void main(String[] args) {

		int intNum1 = 0;
		int intNum2 = 0;
		int intSum = 0;

		// intNum1 변수는 int type 이기 때문에
		// 2의 32승 -1까지 값만 저장가능
		intNum1 = 999_999_999;

		// int 형 변수는 큰값을 저장할수 없다
		// 만약 큰 정수값을 저장할려고 하면
		// long type 으로 변수를 선언해야 한다
		long longNum1 = 0;
		longNum1 = 999_999_999_999_999_999L;



	}

}
