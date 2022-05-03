package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO2;

public class ObjectEx4 {
	
	public static void main(String[] args) {
		List<ScoreVO2> scList = new ArrayList<>();
		makeScore(scList, 10);
		printScore(scList);
	}
	
	private static void makeScore(List<ScoreVO2> list, int size) {
		for(int i = 0 ; i < size ; i++) {
			/*
			 * Builder 패턴
			 * 생성자와 setter method 를 사용하여 VO 객체의 값을
			 * 세팅하던 패턴을 새로운 방법으로 사용할수 있도록 한 것
			 * Field 생성자와 setter method 사용의 장점만 모았다
			 */
			ScoreVO2 scVO = ScoreVO2.builder()
								.stNum(i + 1)
								.intKor(getScore(50,51))
								.intEng(getScore(50,51))
								.intMath(getScore(50,51))
								.build();
			list.add(scVO);
		}
	}
	private static int getScore(int start, int end) {
		return (int)(Math.random() * start) + end;
	}
	
	private static void printScore(List<ScoreVO2> list) {
		System.out.println("=".repeat(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		for(ScoreVO2 sVO : list) {
			System.out.println(sVO.toString());
		}
		System.out.println("=".repeat(50));
	}

}




