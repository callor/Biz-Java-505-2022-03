package com.callor.app.service;

public class ServiceV2 {

	public void guguDan() {
		
		int dan = 3;
		int index = 100;
		
		/*
		 * for(초기화코드 ; 비교코드 ; 변화코드 ) {  }
		 * 
		 * 0. 초기화코드는 for() 명령을 만나면 최초에 한번만 실행
		 * 1. 비교코드를 실행하여 결과가 
		 * 2. true 이면 {}  내부의 코드 실행
		 * 3. {} 코드가 실행 완료되면 변화코드 실행
		 * 
		 * 1 ~ 3 이 계속 반복, 비교코드가 false 가 되는 순간까지
		 * 
		 */
		for( index = 1; index < 10 ; index++) {
			System.out.print("\t");
			System.out.print( dan );
			System.out.print( " x " );
			System.out.print( index );
			System.out.print( " = " );
			System.out.println( dan * index );
		}
	} // end guguDan()
	
	/*
	 *  guguDan(변수선언) 형식으로 method 선언하기
	 *  method 의 괄호안에 선언된 변수를 "argument(아규먼트)" 라고 한다
	 *  argument : 매개변수, parameter(파라메터)
	 *  	호출하는 곳에서 값을 전달하면 전달된 값을 변수에 저장하고
	 *  	코드내에서 변수 값을 사용하여 연산을 수행한다. 
	 *  argument 가 포함된 method를 호출할때는
	 *  	반드시 argument에 합당한 값을 함께 전달해 주어야 한다.
	 *  			(값을 주입해 주어야 한다)
	 *  
	 */
	public void guguDan(int dan) {
		int index = 1;
		for( index = 1; index < 10 ; index++) {
			System.out.print("\t");
			System.out.print( dan );
			System.out.print( " x " );
			System.out.print( index );
			System.out.print( " = " );
			System.out.println( dan * index );
		}
	}
}
