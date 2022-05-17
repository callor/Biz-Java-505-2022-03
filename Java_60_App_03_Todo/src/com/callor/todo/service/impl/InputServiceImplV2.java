package com.callor.todo.service.impl;

import com.callor.utils.Line;

public class InputServiceImplV2 extends InputServiceImplV1{

	/*
	 * V1 클래스의 생성자를 호출하여 scan 을 초기화 실행
	 */
	public InputServiceImplV2() {
		super();
	}

	@Override
	public String inputContent() {
		System.out.print("할일(QUIT:종료) >> ");
		String content = scan.nextLine();
		return content;
	}

	@Override
	public Integer selectTodo() {
		System.out.println(Line.dLine(50));
		System.out.print("할일선택(QUIT:종료)");
		String selectNum = scan.nextLine();
		Integer intNum = 0;

		if(selectNum.equals("QUIT")) return -1;

		try {
			intNum = Integer.valueOf(selectNum);
		} catch (Exception e) {
			return null;
		}
		return intNum;
	}
}
