package com.callor.score.service;

import com.callor.score.domain.ScoreV2VO;
import com.callor.score.utils.Line;

public class ScoreServiceV2 extends ScoreServiceV1{

	public ScoreServiceV2() {
		this(10);
	}

	public ScoreServiceV2(int length) {
		scores = new ScoreV2VO[length];
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i] = new ScoreV2VO();
		}
	}

	// 학생 이름 리스트를 배열로 받아서 초기화 하기
	public ScoreServiceV2(String[] stNames) {
		int length = stNames.length;
		scores = new ScoreV2VO[length];
		for(int i = 0 ; i < length ; i++) {
			scores[i] = new ScoreV2VO();
			scores[i].setStName( stNames[i] );
		}
	}

	@Override
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
		for (ScoreV2VO score : scores) {
			System.out.printf("%-3s\t",score.getStName() );
			System.out.printf("%4d\t",score.getIntKor() );
			System.out.printf("%4d\t",score.getIntEng() );
			System.out.printf("%4d\t",score.getIntMath() );
			System.out.printf("%6d\t",score.getIntSum() );
			System.out.printf("%4.2f\n",score.getfAvg());

			korTotal += score.getIntKor();
			engTotal += score.getIntEng();
			mathTotal += score.getIntMath();
			sumTotal += score.getIntSum();

			/*
			 * 평균계산 주의
			 */
			avgResult += score.getfAvg();

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
