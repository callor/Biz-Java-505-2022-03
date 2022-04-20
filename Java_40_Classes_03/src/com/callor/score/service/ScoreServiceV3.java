package com.callor.score.service;

import com.callor.score.domain.ScoreV2VO;
import com.callor.score.utils.Line;

public class ScoreServiceV3 extends ScoreServiceV1{
	
	public ScoreServiceV3() {
		this(10);
	}
	
	public ScoreServiceV3(int length) {
		scores = new ScoreV2VO[length];
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i] = new ScoreV2VO();
		}
	}
	
	// 학생 이름 리스트를 배열로 받아서 초기화 하기
	public ScoreServiceV3(String[] stNames) {
		int length = stNames.length;
		scores = new ScoreV2VO[length];
		for(int i = 0 ; i < length ; i++) {
			scores[i] = new ScoreV2VO();
			scores[i].setStName( stNames[i] );
		}
	}
	
	public void printScore() {
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		int sumTotal = 0;
		float avgResult = 0;
		
		System.out.println(Line.dLine(50));
		System.out.println("빛나고교 성적표 v1");
		System.out.println(Line.sLine(50));
		System.out.println("이  름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(50));
		for(int i = 0 ; i < scores.length ; i++) {
			System.out.printf("%-3s\t",scores[i].getStName() );
			System.out.printf("%4d\t",scores[i].getIntKor() );
			System.out.printf("%4d\t",scores[i].getIntEng() );
			System.out.printf("%4d\t",scores[i].getIntMath() );
			System.out.printf("%6d\t",scores[i].getIntSum() );
			System.out.printf("%4.2f\n",scores[i].getfAvg());
			
			korTotal += scores[i].getIntKor();
			engTotal += scores[i].getIntEng();
			mathTotal += scores[i].getIntMath();
			sumTotal += scores[i].getIntSum();

			/*
			 * 평균계산 주의
			 */
			avgResult += scores[i].getfAvg();
			
		}
		System.out.println(Line.sLine(50));
		System.out.printf("%-3s\t","총점");
		System.out.printf("%4d\t",korTotal);
		System.out.printf("%4d\t",engTotal);
		System.out.printf("%4d\t",mathTotal);
		System.out.printf("%6d\t",sumTotal);
		System.out.printf("%4.2f\n",avgResult / scores.length);
		System.out.println(Line.dLine(50));
		
	}
}
