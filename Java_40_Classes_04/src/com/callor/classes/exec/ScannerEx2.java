package com.callor.classes.exec;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		String fileName = "data.txt";
		InputStream is = ScannerEx2.class.getResourceAsStream(fileName);

		Scanner scan = new Scanner(is);
		while(true) {

			boolean bYes = scan.hasNext();
			if( !bYes) {
				break;
			}
			String strLine = scan.nextLine();
			System.out.println(strLine);
		}
	}

}
