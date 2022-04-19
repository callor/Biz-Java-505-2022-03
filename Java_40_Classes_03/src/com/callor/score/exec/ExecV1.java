package com.callor.score.exec;

import com.callor.score.domain.ScoreVO;
import com.callor.score.utils.Line;

public class ExecV1 {
	
	public static void main(String[] args) {
		
		// ScoreVO 클래스를 사용하여 3개의 객체를 생성
		ScoreVO stNo1 = new ScoreVO();
		ScoreVO stNo2 = new ScoreVO();
		ScoreVO stNo3 = new ScoreVO();
		
		stNo1.stName = "홍길동";
		stNo2.stName = "이몽룡";
		stNo3.stName = "성춘향";
		
		stNo1.intKor = 90;
		stNo2.intKor = 88;
		stNo3.intKor = 100;
		
		// 1번 학생의 이름과 국어점수를 확인하고 싶다
		System.out.println(Line.dLine(50));
		System.out.println("성적처리");
		System.out.println(Line.sLine(50));
		System.out.printf("%s\t%d\n", stNo1.stName, stNo1.intKor);
		System.out.printf("%s\t%d\n", stNo2.stName, stNo2.intKor);
		System.out.printf("%s\t%d\n", stNo3.stName, stNo3.intKor);
		System.out.println(Line.dLine(50));
		
		
	}

}
