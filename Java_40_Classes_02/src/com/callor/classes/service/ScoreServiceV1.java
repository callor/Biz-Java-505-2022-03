package com.callor.classes.service;

import java.util.Scanner;

import com.callor.classes.utils.Line;

public class ScoreServiceV1 {
	
	protected String[] student;
	protected int[] intKor;
	protected Scanner scan;
	protected int lineLength;
	
	public ScoreServiceV1() {
		this(10);
	}
	
	public ScoreServiceV1(int length) {
		student = new String[length];
		intKor = new int[length];
		scan = new Scanner(System.in);
		lineLength = 50;
	}
	
	public int input() {
		
		System.out.println(Line.dLine(lineLength));
		System.out.println("대한 고교 성적처리 V2");
		System.out.println(Line.sLine(lineLength));
		int index = 0;
		while(index < student.length) {
			System.out.print("이름(END:중단) >> ");
			String strName = scan.nextLine();
			if(strName.equals("END")) {
				break;
			}
			System.out.print("점수(정수로, END:중단 >>");
			String strKor = scan.nextLine();
			if(strKor.equals("END")) {
				break;
			}
			int intScore = 0;
			try {
				// exception 이 발생할수 있는 코드
				intScore = Integer.valueOf(strKor);
				student[index] = strName;
				intKor[index] = intScore;
				index++;
			} catch (Exception e) {
				System.out.println("입력한 값 \"" 
						+ strKor + "\"는 정수로 변경 불가~~");
				System.out.println("점수는 정수로만 입력하세요");
			}
		}

		/*
		 * 입력을 배열의 개수만큼 모두 마치고 정상 종료하면 0 을 return
		 * 입력 도중 END 를 입력하여 중단하였으면 -1 을 return
		 */
		if( index < student.length) { // 도중에 END 를 입력함
			 return -1;
		} else { // 모두 입력 끝
			return 0;
		}
	}
	
	

}
