package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;

public class ObjectEx1 {
	
	public static void main(String[] args) {
		
		// 한사람의 성적을 저장할 VO 객체 생성
		ScoreVO scVO = new ScoreVO();
		scVO.setStNum(1);
		scVO.setIntKor(90);
		scVO.setIntEng(80);
		scVO.setIntMath(85);

		ScoreVO scVO2 = new ScoreVO();
		scVO2.setStNum(1);
		scVO2.setIntKor(90);
		scVO2.setIntEng(80);
		scVO2.setIntMath(85);

		
		// 5명 학생의 성적을 저장할 VO 배열 선언
		ScoreVO[] scVOs = new ScoreVO[5];
		
		// scVOs 배열의 0번 요소를 객체로 생성하기(초기화하기)
		scVOs[0] = new ScoreVO();
		scVOs[0].setStNum(2);
		scVOs[0].setIntKor(88);
		scVOs[0].setIntEng(89);
		scVOs[0].setIntMath(78);

		scVOs[1] = new ScoreVO();
		scVOs[1].setStNum(3);
		scVOs[1].setIntKor(77);
		scVOs[1].setIntEng(88);
		scVOs[1].setIntMath(99);

		scVOs[2] = new ScoreVO();
		scVOs[2].setStNum(3);
		scVOs[2].setIntKor(77);
		scVOs[2].setIntEng(88);
		scVOs[2].setIntMath(99);
		
		// 다수의 학생 성적을 저장할 ScoreVO list 를 생성
		List<ScoreVO> scList = new ArrayList<>();
		ScoreVO sVO1 = new ScoreVO();
		sVO1.setStNum(4);
		sVO1.setIntKor(99);
		sVO1.setIntEng(88);
		sVO1.setIntMath(77);
		scList.add(sVO1);
		
		sVO1 = new ScoreVO();
		sVO1.setStNum(5);
		sVO1.setIntKor(77);
		sVO1.setIntEng(66);
		sVO1.setIntMath(76);
		scList.add(sVO1);
		
	}

}
