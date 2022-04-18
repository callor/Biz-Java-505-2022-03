package com.callor.classes.exec;

import java.util.Scanner;

public class String2IntV5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		/*
		 * 반복되는 횟수가 정해지지 않고
		 * 어떤 조건에 따라 무한히 반복되는 코드를 작성할때는
		 * for() 를 사용하지 않고 while() 명령을 사용한다
		 * () 안의 조건이 true 일 동안 {} 의 코드를 무한히 반복한다
		 */
		while (true) {
			System.out.print("정수입력(END:종료) >> ");
			String strNum = scan.nextLine();
			if(strNum.equals("END")) {
				break;
			}
			
			int intNum = 0;
			try {
				intNum = Integer.valueOf(strNum);
				boolean bEven = intNum % 2 == 0;
				if(bEven) {
					System.out.println(intNum + " 는 짝수");	
				}
			} catch (Exception e) {
				System.out.println(
							"입력한 \"" 
							+ strNum 
							+ "\" 는 숫자로 변경불가!!");
			}
		} // end while
		System.out.println("GAME OVER!!!");

	}

}
