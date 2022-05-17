package com.callor.todo.controller;

import java.util.List;

import com.callor.todo.model.TodoVO;
import com.callor.todo.service.TodoService;
import com.callor.todo.service.impl.TodoServiceImplV1;

public class TodoController {

	public static void main(String[] args) {

		TodoService tService = new TodoServiceImplV1();
		tService.todoInsert("오늘은 행복한 화요일");
		List<TodoVO> todoList = tService.todoSelectAll();
		for(TodoVO tVO : todoList) {
			System.out.println(tVO.toString());
		}
	}
}
