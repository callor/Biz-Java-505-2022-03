package com.callor.app.exec;

public class Exec6 {
	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 100) + 1;
		
		int index = 0;
		for(index = 2; index < num ; index ++) {
			if(num % index == 0) {
				break;
			}
		}
		if(index < num) {
			System.out.println(num + "는 소수가 아님");
		} else {
			System.out.println(num + "는 소수임");
		}
		
		
	}

}
