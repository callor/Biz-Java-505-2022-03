package com.callor.score.exec;

import com.callor.score.domain.ScoreV2VO;

public class ExecV2 {
	
	public static void main(String[] args) {
		ScoreV2VO stNo1 = new ScoreV2VO();
		
		stNo1.setStName("홍길동");
		System.out.println(stNo1.getStName());
		
		ScoreV2VO stNo2 = new ScoreV2VO();
		stNo2.setStName("성춘향");
		System.out.println(stNo2.getStName());
		
		stNo1.setIntKor(90);
		stNo2.setIntKor(100);
		
		stNo1.setIntEng(80);
		stNo2.setIntEng(95);
		
		stNo1.setIntMath(70);
		stNo2.setIntMath(70);
		
		System.out.println(stNo1.toString());
		System.out.println(stNo2.toString());
		
		
		
	}

}
