package com.callor.todo.service.impl;

public class TodoServiceImplV2 extends TodoServiceImplV1{

	public TodoServiceImplV2() {
		super();
		loadTodoList();
	}
	/*
	 * 저장된 todolist.txt 파일을 읽어서
	 * todoList 에 추가하기 
	 * 
	 * todolist.txt 파일 열기
	 * 한라인씩 읽어서
	 * 컴마(,) 기준으로 split 하고
	 * todoVO 에 담고
	 * todoList 에 추가
	 * 
	 */
	private void loadTodoList() {
		
	}
	
}
