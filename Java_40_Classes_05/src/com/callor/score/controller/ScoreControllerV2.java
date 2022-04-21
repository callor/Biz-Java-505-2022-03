package com.callor.score.controller;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV1;

public class ScoreControllerV2 {
	
	public static void main(String[] args) {
		
		/*
		 * ScoreServiceImplV1 클래스를 사용하여 객체를 생성하고
		 * method를 호출하여 기능을 수행하려고 한다.
		 * 
		 * 보통 다음과 같은 코드로 인스턴스를 생성한다
		 * 		클래스 객체 = new 클래스()
		 * 
		 * 인터페이스를 상속받아서 선언한 클래스일 경우는
		 * 인터페이스로 객체를 선언하고
		 * 실제 사용할 클래스의 생성자를 호출하여 인스턴스를 생성한다
		 * 즉, 다음과 같은 코드를 사용한다
		 * 		인터페이스 객체 = new 클래스Impl()
		 * 
		 */
		// 아래 코드는 ScoreService 인터페이스로 scService 객체를 선언하고
		// ScoreServiceImplV1 클래스의 생성자를 호출하여
		// 인스턴스로 생성하였다
		ScoreService scService = new ScoreServiceImplV1();
		scService.makeScore();
		scService.printScore();
		
		
		
	}

}
