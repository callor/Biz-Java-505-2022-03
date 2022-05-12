package com.callor.todo.controller;

import java.util.List;

import com.callor.todo.model.TodoVO;
import com.callor.todo.service.TodoService;
import com.callor.todo.service.impl.TodoServiceImplV2;

public class TodoControllerV2 {
	
	public static void main(String[] args) {
		TodoService toService = new TodoServiceImplV2();
		List<TodoVO> todoList = toService.todoSelectAll();
		for(TodoVO vo : todoList) {
			System.out.println(vo.toString());
		}
	}

}
