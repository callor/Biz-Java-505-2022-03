package com.callor.classes.exec;

public class StringEx2 {

	public static void main(String[] args) {

		String strText = "홍길동,90,80,77";
		String[] names = {"홍길동","이몽룡","성춘향"};

		String[] items = strText.split(",");
		for (String item : items) {
			System.out.println(item);
		}

	}

}
