package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.BookVO;

public class Exec03 {

	public static void main(String[] args) {
		List<BookVO> bookList = new ArrayList<>();

		for(int i = 0 ; i <  10 ; i++) {

			BookVO bookVO = new BookVO();
			bookVO.setTitle("Do IT");
			bookVO.setComp("이지즈");
			bookList.add(bookVO);

		}
	}

}



