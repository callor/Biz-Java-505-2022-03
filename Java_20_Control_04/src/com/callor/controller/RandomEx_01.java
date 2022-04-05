package com.callor.controller;

import java.util.Random;

public class RandomEx_01 {
	
	public static void main(String[] args) {
		
		int intRnd1 = (int)(Math.random() * 100) + 1;
		
		Random rnd = new Random();
		
		int intRnd2 = rnd.nextInt(100);
		System.out.println(intRnd2);
		
		long longRnd = rnd.nextLong();
		double douRnd = rnd.nextDouble();
		System.out.println(douRnd);
		
		boolean bYes = rnd.nextBoolean();
		if(bYes) {
			System.out.println("True 값 만듦");
		} else {
			System.out.println("False 값 만듦");
		}
		
		
		
		
		
	}

}
