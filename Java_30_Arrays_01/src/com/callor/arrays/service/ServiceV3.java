package com.callor.arrays.service;

public class ServiceV3 {

	int[] intKor;
	int[] intEng;
	/*
	 * ServiceV3 클래스의 생성자 method
	 * return type 이 아무것도 없다
	 * method 이름이 클래스 이름과 같다(첫글자 대문자)
	 * 클래스를 선언하면 자동으로 생성되나 코드는 보이지 않는다
	 * (만약 My() 과 같은 코드를 만나면 My 클래스의 생성자 method 라고 부른다)
	 *
	 * 여기에서는 ServiceV3() 생성자 method를 코드로 선언할 것이다 왜~~
	 * 생성자 method 에 intKor 배열을 생성하는 코드를 추가한다
	 *
	 * 생성자 method 는 클래스를 사용하여 인스턴스를 생성할때
	 * 반드시 의무적으로 호출해야 하는 method 이다
	 * 이 method 에 배열을 생성하는 코드를 추가하면
	 * 자동으로 intKor 배열이 사용할 준비가 된다.
	 *
	 * 어떤 클래스를 사용하는데 꼭 필요한 변수가 있다할때
	 * 그 변수의 초기화 생성 clear 필요한 값 저장을 하는 코드를
	 * 생성자에 주로 포함한다
	 *
	 */
	public ServiceV3() {
		intKor = new int[10];
		intEng = new int[10];
		intKor[3] = 100;
	}
	public void viewKor3() {
		System.out.println(intKor[3]);
	}
	public void viewEng3() {
		System.out.println(intEng[3]);
	}

}
