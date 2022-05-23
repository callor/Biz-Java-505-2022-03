package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.exec.AddressVO;

public class ServiceV1 {

	// VO 클래스를 제외한 대부분의 클래스는
	// 필요에 따라 상속을 해줄 가능성이 많다
	// 변수들은 protected 로 선언하는 것이 좋다
	protected int num1;
	protected String name;
	protected Integer num2;

	// 객체나 배열을 private 또는 protected 로 선언할 경우
	// final 키워드를 부착하고
	// 반드시 생성자에서 초기화하는 코드를 사용한다
	protected final List<AddressVO> addList;
	protected final AddressVO[] addArray;
	public ServiceV1() {
		addList = new ArrayList<>();
		addArray = new AddressVO[10];
	}
	
	// 매개변수의 타입, 개수가 다르면 같은 이름의 method를 
	// 중복하여 선언할 수 있다
	public void print(int num) {}
	public void print(String str) {}
	public void print(int num1, int num2) {}
	public void print(AddressVO vo) {}
	public void print(AddressVO[] vo) {}
	public void print(List<AddressVO> vos) {}
	
}
