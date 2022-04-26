package com.callor.app.controller;

import java.util.Scanner;

public class StudentControllerV1 {
	private final Scanner scan;
	private final MenuController menu;
	public StudentControllerV1() {
		scan = new Scanner(System.in);
		menu = new MenuController();
	}
	
	public Integer selectMenu() {
		while(true) {
			menu.viewStMenu();
			String strKey = scan.nextLine();
			if(strKey.equals("QUIT")) {
				return -1;
			}
			Integer intKey = 0;
			try {
				intKey = Integer.valueOf(strKey);
			} catch (Exception e) {
				System.out.println("업무를 다시 선택하세요");
				continue;
			}
			if(intKey == 1) {
				System.out.println("성적 로딩...");
			} else if (intKey == 2) {
				System.out.println("전체 성적표 출력");
			} else if(intKey == 3) {
				System.out.println("학번 검색하기");
			} else if(intKey == 4) {
				System.out.println("이름 검색하기");
			} else {
				System.out.println("1 ~ 4 중에서 선택하세요");
			}
		}
	}

}
