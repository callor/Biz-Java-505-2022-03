package com.callor.arrays;

public class ArraysV5 {
	
	public static void main(String[] args) {
		int[] intScore = new int[100];
		
		for(int i = 0 ; i < intScore.length; i++) {
			intScore[i] = (int)(Math.random() * 100) + 1;
		}
		
		/*
		 * intScore 배열에 담긴 값을 for() 문을 사용하여
		 * 각 요소별로 한줄로 출력 하다가
		 * 5번째 요소를 출력한 후 Enter( new line , println() )를 하라
		 * i(index) 값을 5로 나눈 나머지가 0이 될때 println()을 실행하여
		 * 		new line 을 부여한다
		 * 그런데 i 값은 0부터 시작한다 0 % 5 의 결과는 0이 되어
		 * 		처음 요소를 출력한 후 new line 이 되어 버린다
		 * 그래서 i+1 을 먼저 실행하여 
		 * 		index % 5 의 연산을 1 부터 시작하도록 하여 준다
		 */
		for(int i = 0 ; i < intScore.length ; i++) {
			System.out.print(intScore[i] + ",\t");
			if( (i +1) % 5 == 0) {
				System.out.println();
			}
		}
		
		// for() 반복문 뒤에는 반드시 {} 를 사용하자
		// 명령문 끝에 세미콜론(;) 이 오면 명령문이 끝난다
		for(int i = 0 ; i < 100000; i++);
		System.out.println("대한민국만세");
		
		
	}

}
