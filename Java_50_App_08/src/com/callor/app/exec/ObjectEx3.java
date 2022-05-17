package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;

public class ObjectEx3 {

	public static void main(String[] args) {
		List<ScoreVO> scList = new ArrayList<>();
		makeScore(scList, 10);
		printScore(scList);
	}

	private static void makeScore(List<ScoreVO> list, int size) {
		for(int i = 0 ; i < size ; i++) {
			ScoreVO scVO = new ScoreVO();
			scVO.setStNum(i + 1);
			scVO.setIntKor(getScore(50,51));
			scVO.setIntEng(getScore(50,51));
			scVO.setIntMath(getScore(50,51));
			list.add(scVO);
		}
	}

	private static int getScore(int start, int end) {
		return (int)(Math.random() * start) + end;
	}

	private static void printScore(List<ScoreVO> list) {
		int size = list.size();
		System.out.println("=".repeat(50));
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println("-".repeat(50));
		for(int i = 0 ; i < size ;i++) {
			ScoreVO sVO = list.get(i);
			System.out.print(sVO.getStNum() + "\t");
			System.out.print(sVO.getIntKor() + "\t");
			System.out.print(sVO.getIntEng() + "\t");
			System.out.print(sVO.getIntMath() + "\n");
		}
		System.out.println("=".repeat(50));
	}




}
