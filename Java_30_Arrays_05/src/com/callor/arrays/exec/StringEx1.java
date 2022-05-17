package com.callor.arrays.exec;

public class StringEx1 {

	public static void main(String[] args) {

		/*
		 * 문자열형 변수는 숫자형, 불린형 변수와 저장방식이
		 * 다르다
		 * 때문에 문자열형 변수에 저장된 문자열을 EQ(==) 비고를
		 * 하는 것은 매우 위험한 코드가 될수 있다.
		 *
		 * 문자열형 변수는
		 * 절대 EQ(==) 또는 Not EQ( != )를 사용하여
		 * 비교하지 않는다
		 *
		 */
		String strNation = "KOREA";
		System.out.println(strNation == "KOREA");

		String strName = new String("홍길동");
		System.out.println(strName);
		System.out.println(strName == "홍길동");

		System.out.println(strNation.equals("KOREA"));
		System.out.println(strName.equals("홍길동"));

		boolean bYes = strNation.equals("KOREA");
		if(bYes) {
			System.out.println("strNation 변수에는 \"KOREA\" 가 담겨있다");
		}
		bYes = strName.equals("홍길동");


		strNation = "Republic of Korea";
		bYes = strNation.equals("republic of korea");

		// 아래의 코드를 Chaining 을 사용하여
		// 한 문장의 명령문으로 완성하기
		String upString = strNation.toUpperCase();
		bYes = upString.equals("REPUBLIC OF KOREA");

		// method Chaining
		bYes = strNation.toUpperCase().equals("REPUBLIC OF KOREA");
		bYes = strNation.toLowerCase().equals("republic of korea");

		// 대소문자를 무시하고 문자열을 비교하라
		// 단, 띄어쓰기는 무시하지 않는다
		bYes = strNation.equalsIgnoreCase("rePublic OF KOREA");






	}

}
