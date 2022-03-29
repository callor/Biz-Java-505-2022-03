package com.callor.var;

public class Var_06 {

	public static void main(String[] args) {
		
		int intNum = (int)Math.random() * 1000;
		int intAge = (int)(Math.random() * 100) + 10;
		
		String strName = "홍길동";
		
		System.out.printf("\t%s 의 나이는 %d 이다 \n",
				strName, intAge);
		
		
	}
	
}
