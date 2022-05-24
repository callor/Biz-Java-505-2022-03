package com.callor.student.exec;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import com.callor.student.utils.Line;

public class PrintStreamEx1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintStream ps = System.out;
		ps.println("우리나라만세");
		ps.println("대한민국만세");
		
		PrintStream ps1 = new PrintStream("data.txt");
		ps1.println("우리나라만세");
		ps1.println("대한민국만세");
		
		ps.println(Line.dLine(50));
		ps.println("7단 구구단");
		ps.println(Line.dLine(50));
		for(int i = 2; i < 10 ; i ++) {
			ps.printf("%d x %d = %d\n",7,i,7 * i);
		}
		ps.println(Line.dLine(50));

		ps1.println(Line.dLine(50));
		ps1.println("7단 구구단");
		ps1.println(Line.dLine(50));
		for(int i = 2; i < 10 ; i ++) {
			ps1.printf("%d x %d = %d\n",7,i,7 * i);
		}
		ps1.close();
		ps1.println(Line.dLine(50));

		
		
		
	}
	
}
