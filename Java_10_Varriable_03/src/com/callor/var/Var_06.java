package com.callor.var;

public class Var_06 {

	public static void main(String[] args) {
		
		int num1 = 0;
		
		/*
		 * 변수++ 또는 ++변수 는
		 * 단독으로 사용될때는 연산결과가 똑같다
		 */
		++num1;
		num1++;
		
		/*
		 * 하지만 다른 명령문 안에서 사용될때는
		 * 성질이 매우 달라서 많이 주의를 해야 한다.
		 * ++변수 : 가장먼저 실행되는 명령이 된다.
		 * 변수++ : 모든 명령이 다 실행되고 다음줄 명령문으로 진행하기 직전에
		 * 		실행된다
		 */
		System.out.println(++num1);
		System.out.println(num1++);
		
		System.out.println("===================");
		num1 = 0;
		num1 = ++num1 * 3;
		System.out.println(num1);
		
		num1 = 0;
		num1 = num1++ * 3; 
		System.out.println(num1);
		
		

	}

}
