package com.callor.score.service;

import com.callor.score.domain.StudentVO;

/*
 * StudentService 가 할일
 * 1. student.txt 파일을 읽어서 학생데이터들 만들기
 * 2. 생성된 학생데이터들을 return 해주기
 * 3. 학번을 argument 로 받아서 해당 학생데이터를 return 해주기
 */
public interface StudentService {
	
	/*
	 * 추상 메서드
	 * 메서드의 접근제한자(public), 메서드의 이름, 
	 * 매개변수, return type 만 정의한 것  
	 * 연산(실행)되는 실제 코드가 없는 method
	 */
	public void loadStudent();
	public StudentVO[] getStudents();
	// stNum 학번을 학생데이터들에서 찾아서(findByNum)
	// 학생 데이터를 return 하기
	public StudentVO findByNum(String stNum);

}
