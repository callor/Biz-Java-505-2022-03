package com.callo.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callo.app.model.ScoreVO;
import com.callo.app.service.ScoreService;
import com.callo.app.utils.Line;

public class ScoreServiceimplV2 implements ScoreService{
	
	// protected 는 상속해주기 위해 설계된 클래스에서
	// 상속받은 클래스와 변수를 공유하기 위한 방법
	// 기본속성은 private 과 같다
	protected int stCount;
	protected final List<ScoreVO> scList;
	
	protected final int lineLength = 50;
	protected final String[] subs ;
	
	public ScoreServiceimplV2() {
		scList = new ArrayList<>();
		stCount = 20;
		subs = new String[]{"학번","국어","영어","수학","총점","평균"};
	}
	
	private int getScore() {
		int score = (int)(Math.random() * 50) + 51;
		return score;
	}

	@Override
	public void makeScore() {
		for(int i = 0 ; i < stCount ; i++) {
			ScoreVO scVO = new ScoreVO();
			scVO.setIntStNum(i + 1);
			scVO.setIntKor(getScore());
			scVO.setIntMath(getScore());
			scVO.setIntEng(getScore());
			scList.add(scVO);		
		}
	}

	@Override
	public void printScore() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("한국고교 성적일람표");
		System.out.println(Line.sLine(lineLength));
		for(String sub : subs) {
			System.out.print(sub + "\t");
		}
		System.out.println();
		System.out.println(Line.sLine(lineLength));
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		int sumTotal = 0;
		for(ScoreVO scVO : scList) {
			System.out.printf("%5d\t",scVO.getIntStNum());
			System.out.printf("%5d\t",scVO.getIntKor());
			System.out.printf("%5d\t",scVO.getIntEng());
			System.out.printf("%5d\t",scVO.getIntMath());
			System.out.printf("%5d\t",scVO.getIntSum());
			System.out.printf("%5.2f\n",scVO.getfAvg());
			korTotal += scVO.getIntKor();
			engTotal += scVO.getIntEng();
			mathTotal += scVO.getIntMath();
			sumTotal += scVO.getIntSum();
		}
		System.out.printf("%5d\t", korTotal);
		System.out.printf("%5d\t", engTotal);
		System.out.printf("%5d\t", mathTotal);
		System.out.printf("%5d\t", sumTotal);
	}

}
