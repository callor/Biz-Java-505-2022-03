package com.callor.classes.exec;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerEx1 {
	
	public static void main(String[] args) {
		String fileName = "data.txt";
		InputStream is = ScannerEx1.class.getResourceAsStream(fileName);
	
		Scanner scan = new Scanner(is);
		String strLine = scan.nextLine();
		
		System.out.println(strLine);
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		
	
	}

}
