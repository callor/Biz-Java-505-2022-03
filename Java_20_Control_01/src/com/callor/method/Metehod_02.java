package com.callor.method;

public class Metehod_02 {
	
	
	public static void main(String[] args) {
		/*
		 * 다음 코드가 오류 없이 실행 되도록 코드를 완성하시오
		 */
		int intNum1 = num();
		double douNum1 = doNum();
		douNum1 = 0.0;
		
		long longNum1 = longNum();
		longNum1 = 30;
		longNum1 = 300_000_000_000L;
		float fNum1 = floatNum();
		fNum1 = 0.0f;
		
		boolean bYes = bYes();
		String str = nation();
		
		System.out.println(intNum1);
		System.out.println(douNum1);
		System.out.println(longNum1);
		System.out.println(fNum1);
		System.out.println(bYes);
		System.out.println(str);
		
		
	}

}
