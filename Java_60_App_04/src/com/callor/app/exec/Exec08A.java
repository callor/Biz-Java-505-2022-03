package com.callor.app.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Exec08A {

	public static void main(String[] args) throws IOException {
		String fileName = "src/com/callor/app/exec/data.txt";
		
		// data.txt 파일을 열어서 데이터 가져오기
		InputStream is = new FileInputStream(fileName);;
		
		// 열린 파일 정보를 scanner 와 연결하기
		Scanner scan = new Scanner(is);;
		while (scan.hasNext()) {
			String line = scan.nextLine();
			System.out.println(line);
		}
		scan.close();
		is.close();
	}

}
