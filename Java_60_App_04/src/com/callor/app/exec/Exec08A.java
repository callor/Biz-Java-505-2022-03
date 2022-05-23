package com.callor.app.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Exec08A {

	public static void main(String[] args) {
		String fileName = "src/com/callor/app/exec/data.txt";

		// file 과 관련한 클래스는
		// 객체 선언문과 생성(초기화)를 분리한다
		// try-catch 선언때문에
		InputStream is = null;
		Scanner scan = null;

		try {
			is = new FileInputStream(fileName);
			scan = new Scanner(is);
			while(scan.hasNext()) {
				String line = scan.nextLine();
				System.out.println(line);
			}
			scan.close();
			is.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
