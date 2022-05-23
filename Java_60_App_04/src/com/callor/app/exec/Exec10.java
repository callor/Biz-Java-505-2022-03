package com.callor.app.exec;

public class Exec10 {
	
	// 진입점 method
	// 최초로 Run 을 실행하는 클래스에 있는 중요한 method
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		// sum 메서드에게 num1 과 num2 에 담긴 값을 전달
		// 매개변수전달, 파라메터 전달
		sum(num1, num2);
		
		AddressVO vo = new AddressVO();
		AddressService adService = new AddressService();
		// adService 객체의 printVO 메서드에게
		// vo 객체의 주소를 전달
		adService.printVO(vo);
	}
	
	private static int sum(int num1, int num2) {
		return num1 + num2;
	}

}
