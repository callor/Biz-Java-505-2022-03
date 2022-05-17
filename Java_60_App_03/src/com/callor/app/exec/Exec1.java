package com.callor.app.exec;

/*
 * random() 메서드를 사용하여
 * 1 ~ 100까지 임의 정수를 생성하여 변수에 저장
 * 변수에 저장된 값이 짝수인지 홀수인지 판별하여 console 에 출력
 * 이 과정을 10번 반복
 */
public class Exec1 {

	public static void main(String[] args) {

		for(int i = 0 ; i < 10 ; i++) {
			int num = (int)(Math.random() * 100) + 1;
			if(num % 2 == 0) {
				System.out.println(num + "는 짝수");
			} else {
				System.out.println(num + "는 홀수");
			}
		}

	}

}
