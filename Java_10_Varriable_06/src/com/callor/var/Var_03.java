package com.callor.var;

public class Var_03 {
	public static void main(String[] args) {
		
		int intNum1 = (int)(Math.random() * 100) + 1;
		
		// boolean type 의 변수 초기화 할때는 
		// true값을 주로 사용한다
		boolean bEven = true; 
		
		bEven = (intNum1 % 2) == 0;
		
		/*
		 * 비교(조건) 명령문
		 * 		if(boolean) { boolean 이 true 일때 실행  }
		 * 		else { boolean 이 true가 아닐 때 실행  }
		 * boolean 의 값이 true 인가 false 인가 에 따라서
		 * 명령문을 선택적으로 실행할 수 있다
		 */
		if(bEven) {
			System.out.println(intNum1 + " 는 짝수");
		} else {
			System.out.println(intNum1 + " 는 짝수가 아니다");
		}
		
		// 연산식으로 if 명령문 실행
		// 연산 결과가 true 또는 false 인 경우
		if( (intNum1 % 3) == 0 ) {
			System.out.println(intNum1 + " 는 3의 배수");
		} else {
			System.out.println(intNum1 +  " 는 3의 배수가 아니다");
		}
		
		if( (intNum1 % 4) == 0) {
			System.out.println(intNum1 + " 는 4의 배수");
		} else if( (intNum1 % 3) == 0) {
			System.out.println(intNum1 + " 는 4의 배수가 아니다");
			System.out.println("하지만 3의 배수이다");
		} else if( (intNum1 % 2) == 0) {
			System.out.println(intNum1 + " 는 4의 배수 아님");
			System.out.println(" 3의 배수도 아님");
			System.out.println("그런데 2의 배수인 것 같음");
		}
		
		
	}

}
