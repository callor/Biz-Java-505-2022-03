package com.callor.score.exec;

import com.callor.score.domain.ScoreV2VO;

public class ExecV4 {
	
	public static void main(String[] args) {
		
		// ScoreV2VO 클래스를 사용하여 100 의 배열객체 선언
		ScoreV2VO[] scores = new ScoreV2VO[100];
		
		// 배열개체 모든 요소를 for() 반복문 내에서
		// 생성자를 호출하여 초기화
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i] = new ScoreV2VO();
		}
		
		
		
		
		
		
		
	}

}
