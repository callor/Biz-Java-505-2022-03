package com.callor.app.exec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exec09 {
	
	public static void main(String[] args) {
		String fileName = "src/com/callor/app/exec/data.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				System.out.println(reader);
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
