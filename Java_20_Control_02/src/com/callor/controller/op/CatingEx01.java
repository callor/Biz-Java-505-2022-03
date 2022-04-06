package com.callor.controller.op;

public class CatingEx01 {
	
	public static void main(String[] args) {
		
		// java 에서 취급하는 정수
		short shortNum1 = 0 ; // 2의 16승
		int intNum1 = 0; // 2의 32승
		long longNum1 = 0; // 2의 64승
		
		/*
		 * 크기(저장공간) 작은 type 의 변수에
		 * 크기가 큰 type 의 변수 값을 복사 대입하는 경우
		 * 값을 잃을 수 있다.
		 * 하지만 억지로 대입하고자 한다면 
		 * "강제 형 변환(Casting)"을 수행해야 한다
		 * 강제 형 변환을 수행했을 때 예측할 수 없는 결과가 나올수 있고
		 * 그 책임은 순전히 개발자 몫이다
		 */
		shortNum1 = (short)intNum1;
		intNum1 = (int)longNum1;
		
		/*
		 * *** 매우 주의해야 할 코드 ***
		 * 연산식에 복합연산자가 포함될 경우
		 * 변수간에 강제 형 변환이 발생한다
		 * 결과는 예측할 수 없고
		 * 중요한 문제를 야기 할수 있다.
		 * 
		 */
		shortNum1 += intNum1;
		intNum1 += longNum1;
		
		/*
		 * 실수값(double,float)을 정수형 변수에 대입하면
		 * 문법 오류가 발생을 한다.
		 * 이 것은 오차에 대한 안전장치이다
		 * 경우에 따라 소수점 이하 값을 무시하고
		 * 강제로 형 변환을 하여 실수값을 정수형 변수에 대입하기도 한다
		 */
		intNum1 = (int)3.0;
		intNum1 += 3.0;
		
		/*
		 * 복합연산가 포함된 식에서는
		 * 실수값을 정수값에 대입하는데 문법 오류가 나지 않는다
		 * 내부적으로 강제 형변환이 일어나기 때문이다
		 * 값을 예측할 수 없고 논리적인 문제를 일으키지 않으면
		 * "많은 값을 대입"하여 오류를 방지해야 한다.
		 */
		intNum1 = 0;
		intNum1 += 3.123123123;
		System.out.println(intNum1);
		
		
		
	}
	

}
