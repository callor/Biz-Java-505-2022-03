package com.callor.var;

public class Var_05 {

	public static void main(String[] args) {
		
		/*
		 * String type 또는 문자열형 변수 선언
		 * = "" : 선언된 문자열형 변수를 clear
		 * 		(숫자형에서 0을 대입한것과 유사)
		 */
		String strNation = "";
		
		// = null : 선언된 문자열형 변수를 clear
		String strName = null;
		
		/*
		 * 1. strNation 이라는 변수를 만들고 값을 비워놓는다
		 * 2. (내부적으로 정해진) 어떤 곳에 대한민국 문자열을
		 * 	기억장치 1개당 한글자씩 나눠서 저장한다
		 * 3. 문자 '대'가 저장된 기억장치의 주소를 
		 * 4. strNation 변수에 저장해 둔다
		 */
		strNation = "대한민국";
		strName = "홍길동";
		
		/*
		 * 1. strNation 변수에 저장된 값을 읽는다
		 * 2. 이 값은 그냥 데이터가 아니고 다른 기억장소의
		 * 	주소라는 표식이 있다
		 * 3. 기억장소에 저장된 주소를 기준으로
		 * 4. 실제 문자열 "대한민국"이 저장된 곳을 찾는다
		 * 5. 그 위치를 println()에게 알려준다
		 */
		System.out.println(strNation);
		
		/*
		 * strNation 문자열형 변수에 저장된 값을 읽어오고
		 * 여기에 " 우리나라" 라는 문자열을 추가하여
		 * strNation 을 다시 만들어라
		 */
		strNation += " 우리나라";
		System.out.println(strNation);
		
		// 문자열은 %s 를 사용하여 printf() 로 출력한다
		System.out.printf("%s\n",strNation);
		
		
		
	}
	
}
