package com.callor.app.exec;

import com.callor.app.model.ScoreVO;

public class ObjectEx2 {

	public static void main(String[] args) {
		// ScoreVO 를 5개의 배열 객체로 선언
		ScoreVO[] scVOs = new ScoreVO[5];

		/*
		 * 배열객체를 makeScore() 메서드에 매개변수로 전달
		 *
		 * 매개변수로 scVOs 를 makeScore() 메서드에 전달하고
		 * makeScore() 메서드에서 배열의 요소를 각각 변경(setting)하면
		 * main() 메서드에서 선언된 scVOs 배열의 값들이 변경된다
		 * 이러한 성질을 갖는 변수를 "참조형변수" 라고 한다.
		 *
		 * 참조형변수의 성질을 잘 이용하면 method 가 실행된 후
		 * 결과를 return 하지 않아도 된다.
		 */
		makeScore(scVOs);
		printScore(scVOs);
	} // end main

	private static void makeScore(ScoreVO[] scArray) {
		for(int i = 0 ; i < scArray.length ; i++) {
			scArray[i] = new ScoreVO();
			scArray[i].setStNum(i + 1);
			scArray[i].setIntKor(getScore(50, 51));
			scArray[i].setIntEng(getScore(50, 51));
			scArray[i].setIntMath(getScore(50, 51));
		}
	}

	private static int getScore(int start, int end) {
		int num = (int)(Math.random() * start) + end;
		return num;
	}

	private static void printScore(ScoreVO[] scVOs) {
		System.out.println("=".repeat(50));
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println("-".repeat(50));
		for(ScoreVO scVO : scVOs) {
			System.out.print(scVO.getStNum() + "\t");
			System.out.print(scVO.getIntKor() + "\t");
			System.out.print(scVO.getIntEng() + "\t");
			System.out.print(scVO.getIntMath() + "\n");
		}
		System.out.println("=".repeat(50));
	}

}
