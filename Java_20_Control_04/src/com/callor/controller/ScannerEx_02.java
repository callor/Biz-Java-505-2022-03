package com.callor.controller;

import java.util.Scanner;

public class ScannerEx_02 {

	public static void main(String[] args) {
		// Scanner 클래스를 사용하여 scan 인스턴스를 생성하고
		Scanner scan = new Scanner(System.in);

		System.out.println("===================");
		System.err.println("나만의 계산기");
		System.out.println("===================");

		System.out.print("정수를 입력후 Enter : ");
		int intNum1 = scan.nextInt();

		System.out.print("정수 한개를 더 입력후 Enter : ");
		int intNum2 = scan.nextInt();

		System.out.print("입력한 두 정수의 합 : ");
		System.out.println(intNum1 + intNum2);
	}

}
