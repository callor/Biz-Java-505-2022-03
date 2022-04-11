package com.callor.arrays;

// Ctrl + o
// import 최적화(필요한 클래스는 import, 필요없는 항목은 제거)
public class ArraysV1 {
	
	// eClipse 에서 한 line 을 삭제할때 Ctrl+d
	public static void main(String[] args) {
		
		// 정수형 배열 intNums 를 선언하고, 공간 10개를 확보하라
		// 정수형 배열 10개짜리 intNums 를 생성하라
		// 정수형 배열 intNums에는 정수를 10개 저장 할 수 있는
		// 		저장 공간이 생성된다.
		// intNums 배열의 10개의 저장소는 0 으로 clear 된 상태로 시작
		int[] intNums = new int[10];
		
		// 배열 각 요소에 값저장하기
		intNums[0] = 10;
		intNums[1] = 20;
		intNums[2] = 30;
		intNums[3] = 40;
		intNums[4] = 50;
		// intNums[5] 부터 intNums[8] 까지는 0으로 clear 된 상태를 유지
		intNums[9] = 100;
		
		// 배열의 각 요소의 저장 값 읽기
		System.out.println(intNums[3]);
		System.out.println(intNums[8]);
		
		int intSum = intNums[1];
		intSum += intNums[2];
		intSum += intNums[9];
		
		System.out.println(intSum);
		
		intNums[8] = intSum;
		intNums[7] = intNums[3] + intNums[2] + intNums[0];
		
		System.out.println(intNums[8]);
		System.out.println(intNums[7]);
		
		// intNums에 저장된 값을 문자열로 바꾸어서 println() 에 전달하고
		// Console 에 출력하라
		System.out.println(intNums.toString());
		
		/*
		 * print() method 는 () 안의 데이터 type 에 따라 
		 * 작동하는 방식이 다르다
		 * 
		 * print(변수) : 변수에 저장된 값을 console 에 출력
		 * print(연산) : 연산을 먼저 수행하고 연산 결과를 console 에 출력
		 * print( method() ) : method() 실행하고 return 된 결과를
		 * 				console 에 출력
		 * 		단, method()가 void type 인 경우는 오류가 난다
		 * 
		 * print( 객체, 인스턴스 ) 
		 * 	: 객체.toString(), 인스턴스.toString() 를 먼저 실행하고
		 * 		return 문자열 결과를 console 에 출력
		 * 
		 * print( 배열 ) : 배열.toString() 을 먼저 실행하고
		 * 		return 된 기억장소 주소를 console 에 출력
 		 * 
		 */
		System.out.println(intNums);
		
	}
}
