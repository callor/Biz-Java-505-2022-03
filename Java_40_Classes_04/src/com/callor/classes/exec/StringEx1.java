package com.callor.classes.exec;

public class StringEx1 {

	public static void main(String[] args) {

		String strNation = "대한민국만세";
		System.out.println(strNation);

		String strName = new String("홍길동");
		System.out.println(strName);

		String strNo1 = strNation.substring(3);
		System.out.println(strNo1);
		String strNo2 = strNation.substring(3, 5);
		System.out.println(strNo2);

		for(int i = 0 ; i < strNation.length() ; i++) {
			System.out.println(strNation.substring(i));
		}

		for(int i = 0 ; i < strNation.length() ; i++) {
			System.out.println(strNation.substring(i,i+1));
		}

		System.out.println(strNation);
		for(int i = 0 ; i < strNation.length() ; i++) {
			System.out.print(strNation.substring(i,i+1));
		}
		System.out.println();

		int[] intNum = new int[10];
		for (int element : intNum) {
			System.out.print(element);
		}
		System.out.println();

		String str1 = "0123456789";
		/*
		 * str1.length() 메서드는 문자열의 길이를 계산하는 method 이다
		 * for() 반복문이 문자열의 길이만큼 반복될때
		 * 계속해서 문자열의 길이를 계산하는 코드가 실행된다
		 */
		for(int i = 0 ; i < str1.length() ; i++) {
			System.out.print(str1.substring(i, i+1));
		}
		System.out.println();

		/*
		 * for() 반복문이 실행되기 전에 문자열의 개수를 계산하여
		 * return 하는 length() 메서드를 호출하고
		 * 결과를 변수에 담자
		 * 이제는 문자열의 길이를 계산하는 코드는 한번만 실행되고
		 * 문자열의 길이만큼 for() 반복문을 수행할수 있게 되었다
		 * 상당히 많은 코드 실행이 없어져
		 * 효율적인 코드가 된다
		 */
		int str1Length = str1.length();
		for(int i = 0 ; i < str1Length ; i++) {
			System.out.print(str1.substring(i, i+1));
		}
		System.out.println();






	}

}
