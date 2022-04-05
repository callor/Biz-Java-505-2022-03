package com.callor.controller;

public class ControllerV5 {
	
	public static void main(String[] args) {
		
		// if(비교연산식) {  }
		// for( ;; ) {  }
		
		int intNum = 1;
		/*
		 * for() 반복문 코드 내부에 조건연산을 추가하여
		 * 반복 횟수를 제한하기
		 * break : for() 반복문을 중단하는 키워드
		 * 
		 * for( ;??; ) 반복문의 두번째 명령문은 비교문이 들어간다
		 * 이때부터 for() 반복문은 두번째 명령문의 결과가 true 일때만
		 * {} 의 코드를 실행한다.
		 * 
		 */
		for( ; intNum < 10 ; intNum ++) {
			System.out.printf("\t%d x %d = %d\n",3,
					intNum, 3 * intNum);
		} // end for
	}

}
