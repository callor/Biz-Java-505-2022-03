package com.callor.app.service;

/*
 * (view)한정자, 제한자
 * 클래스, method, 변수 등의 첫번째 키워로 사용하는 것들
 * 		public, private, protected, 생략
 * 한정자를 어떤 것을 사용하느냐에 따라 클래스, method, 변수등을
 * 		다른 블럭( {} )에서 사용(view, 호출, 실행, 읽기, 쓰기)할수 있는
 * 		권한이 달라진다
 * 
 * public 은 어디에서나, 누구나 사용할수 있다
 * private 은 같은 블럭( {} ) 에서만 사용할수 있다.
 * 		만약 method 를 private 으로 지정하면 다른곳에서
 * 		인스턴스.method() 와 같은 코드로 사용(호출, 실행) 할 수 없다
 * 생략을 하면 같은 Package 에서는 호출할 수 있다
 * 		Package 가 달라지면 private 과 성질이 같아진다
 */

public class ServiceV2 {
	
	// private 한정자 설정
	private int sum() {
		return 100 + 200;
	}
	
	// 한정자를 생략
	int add() {
		return 200 + 300;
	}

}
