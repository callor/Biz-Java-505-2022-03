package com.callor.app.exec;

import com.callor.utils.Line;

public class Exec07 {

	public static void main(String[] args) {

		int num = 7;
		System.out.println(Line.dLine(30));
		System.out.printf("%d 단 구구단\n",num);
		System.out.println(Line.sLine(30));
		for(int i = 2 ; i < 10; i++) {
			int result = num * i;
			System.out.printf("%d x %d = %d\n",num,i, result);
		}
		System.out.println(Line.dLine(30));


	}

}
