package com.callor.score.exec;

public class VarEx2 {
	
	public static void main(String[] args) {
		
		int num1 = 100;
		/*
		 * int 형 변수에 담긴 데이터를 
		 * Integer 형 변수에 복사
		 * 
		 * int 형 데이터에 box를 씌워서 Integer 형으로
		 * 변환한 후 저장한다
		 * 
		 * boxing
		 * 
		 */
		Integer intNum1 = num1;
		
		/*
		 * Integer 형 변수에 담긴 데이터를
		 * int 형 변수에 복사하기
		 * 
		 * Integer box 에 담긴 데이터를 box 를 풀어해쳐
		 * 내용물만 int 형 변수에 저장
		 * 
		 * unboxing 이라고 한다.
		 */
		num1 = intNum1;
		
		
	}

}
