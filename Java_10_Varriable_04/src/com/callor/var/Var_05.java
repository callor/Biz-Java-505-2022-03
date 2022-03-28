package com.callor.var;

public class Var_05 {
	
	public static void main(String[] args) {
		
		// 기본 실수타입(소수점 이하 13자리)
		double douNum = 30; // 30.0 이 저장된다.
		int intNum = (int)douNum; // 실수형 값을 정수형에 강제로 저장
		
		// 실수타입의 변수가 필요하기는 한데
		// 굳이 소수점 이하 13자리까지의 정밀도가 필요 없을 경우
		float foNum = 30;
		
		// float 형은 double 형보다 정밀도가 낮은 실수형 변수다
		foNum = (float)Math.random();
		System.out.println(foNum);
		
				
		
		
	}

}
