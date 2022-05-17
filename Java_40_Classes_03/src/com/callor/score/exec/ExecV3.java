package com.callor.score.exec;

import com.callor.score.domain.ScoreV2VO;

public class ExecV3 {

	public static void main(String[] args) {

		// vo 클래스를 사용하여 배열 선언하기
		ScoreV2VO[] scores = new ScoreV2VO[10];

		// 배열로 선언된 객체는 아직 사용할 준비가 덜 되었다
		// 각 요소들을 반드시 생성자로 초기화 시켜 주어야 한다.
		scores[0] = new ScoreV2VO();
		scores[1] = new ScoreV2VO();
		scores[2] = new ScoreV2VO();
		scores[3] = new ScoreV2VO();

		scores[0].setStName("홍길동");
		scores[1].setStName("이몽룡");
		scores[2].setStName("장영자");
		scores[3].setStName("성춘향");



	}

}
