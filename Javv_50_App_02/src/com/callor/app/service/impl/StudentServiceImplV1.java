package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.domain.StudentVO;
import com.callor.app.service.StudentService;

public class StudentServiceImplV1 implements StudentService {

	private final List<StudentVO> stList;
	private final String stFileName;
	public StudentServiceImplV1() {
		List<StudentVO> sts = new ArrayList<>();
		this.stList = sts;
		this.stFileName = "";
	}
	
	public StudentServiceImplV1(List<StudentVO> stList, String stFileName) {
		this.stList = stList;
		this.stFileName = stFileName;
	}
	
	@Override
	public void loadStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<StudentVO> getStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentVO findByStNum(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentVO> findByStName(String stName) {
		// TODO Auto-generated method stub
		return null;
	}

}
