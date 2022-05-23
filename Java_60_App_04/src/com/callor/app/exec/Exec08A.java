package com.callor.app.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Exec08A {

	public static void main(String[] args) throws IOException {
		String fileName = "src/com/callor/app/exec/data.txt";
		InputStream is = new FileInputStream(fileName);;
		Scanner scan = new Scanner(is);;
		while (scan.hasNext()) {
			String line = scan.nextLine();
			System.out.println(line);
		}
		scan.close();
		is.close();
	}

}
