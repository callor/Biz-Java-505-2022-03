package com.callor.app;

/*
 * VO List 정렬
 */
public class SortEx2 {

	public static void main(String[] args) {
		ScoreVO[] scList = new ScoreVO[10];
		for (int i = 0; i < scList.length; i++) {
			int iKor = (int) (Math.random() * 50) + 51;
			int iEng = (int) (Math.random() * 50) + 51;
			int iMath = (int) (Math.random() * 50) + 51;
			ScoreVO scVO = new ScoreVO();
			scVO.intKor = iKor;
			scVO.intEng = iEng;
			scVO.intMath = iMath;
			scVO.intSum = iKor + iEng + iMath;
			scList[i] = scVO;
		}
		printScore(scList);
		for (int i = 0; i < scList.length; i++) {
			for (int j = i + 1; j < scList.length; j++) {
				if (scList[i].intSum > scList[j].intSum) {
					ScoreVO sVO = scList[i];
					scList[i] = scList[j];
					scList[j] = sVO;
				}
			}
		}
		System.out.println("=".repeat(100));
		printScore(scList);
	}// end main

	private static void printScore(ScoreVO[] scores) {
		for (int i = 0; i < scores.length; i++) {
			ScoreVO sVO = scores[i];
			System.out.printf("%3d\t", sVO.intKor);
			System.out.printf("%3d\t", sVO.intEng);
			System.out.printf("%3d\t", sVO.intMath);
			System.out.printf("%3d\n", sVO.intSum);
		}
	}

}
