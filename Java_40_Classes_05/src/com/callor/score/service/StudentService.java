package com.callor.score.service;

import com.callor.score.domain.StudentVO;

/*
 * StudentService 가 할일
 * 1. student.txt 파일을 읽어서 학생데이터들 만들기
 * 2. 생성된 학생데이터들을 return 해주기
 * 3. 학번을 argument 로 받아서 해당 학생데이터를 return 해주기
 */
public interface StudentService {
	
	public void loadStudent();
	public StudentVO[] getStudents();
	// stNum 학번을 학생데이터들에서 찾아서(findByNum)
	// 학생 데이터를 return 하기
	public StudentVO findByNum(String stNum);
	public StudentVO[] sortByNum();

}
