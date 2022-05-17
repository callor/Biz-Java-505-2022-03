package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.BookVO;

public class eXEC04 {

	public static void main(String[] args) {

		List<BookVO> bookList= new ArrayList<>();

		// 1개의 bookVO 를 만들고
		BookVO bookVO = new BookVO();
		for(int i = 0 ; i < 10; i++) {
			String title = ((int)(Math.random() * 1000) + 100) + "";
			bookVO.setTitle(title);
			// 같은 bookVO 를 list 에 10 번 추가하기
			// 모든 list 의 주소가 동일한 상태
			// 가장 마지막에 저장한 값으로 모두 통일되버림
			bookList.add(bookVO);
		}
		for(BookVO vo : bookList) {
			System.out.println(vo.toString());
		}

		bookList = new ArrayList<>();
		for(int i = 0 ; i < 10; i++) {
			// bookVO1 을 10 번 다시 생성하면서
			// title 에 Setting 하고
			// List 에 추가
			BookVO bookVO1 = new BookVO();
			String title = ((int)(Math.random() * 1000) + 100) + "";
			bookVO1.setTitle(title);
			bookList.add(bookVO1);
		}
		for(BookVO vo : bookList) {
			System.out.println(vo.toString());
		}








	}

}
