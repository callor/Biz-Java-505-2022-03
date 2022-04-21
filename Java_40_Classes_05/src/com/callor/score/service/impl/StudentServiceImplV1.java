package com.callor.score.service.impl;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1 implements StudentService {

	private StudentVO[] stVO;
	private String stFile;
	
	public StudentServiceImplV1() {
		// TODO Auto-generated constructor stub
	}
	public StudentServiceImplV1(String stFile, int length) {
		this.stFile = stFile;
		this.stVO = new StudentVO[length];
		for(int i = 0 ; i < this.stVO.length ; i++) {
			this.stVO[i] = new StudentVO();
		}
	}
	
	
	@Override
	public void loadStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public StudentVO[] getStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentVO findByNum(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}

}
