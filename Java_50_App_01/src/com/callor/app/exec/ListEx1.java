package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
	
	public static void main(String[] args) {
		
		/*
		 * List(ArrayList)
		 * java 에서 배열을 대신하여 사용되는 자료형
		 * 여러가지 자료형 중에서 가장 많이 사용하는 구조
		 * List : interface
		 * ArrayList : 구현클래스
		 */
		List<Integer> intList = new ArrayList<>();
		
		// 구현클래스만으로 객체를 선언하고 생성하는 코드를
		// 사용할수는 있지만, interface 가 있는 경우는
		// interface를 사용하여 객체를 선언하는 것이 좋다
		ArrayList<String> strList = new ArrayList<>();
		
		// List 형의 자료는 저장(추가)할 데이터의 type을 
		// Generic(제네릭) 으로 설정한다
		// Generic 으로 설정할수 있는 type 은
		// 반드시 class type 이어야 한다.
		// primitive type 은 Generic 으로 설정할수 없다
		List<Float> floatList = new ArrayList<>();
		
		
		
	}

}
