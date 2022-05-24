package com.callor.student.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.model.StudentVO;
import com.callor.student.service.StudentService;
import com.callor.student.utils.Line;

public class StudentServiceImplV1 implements StudentService {

	private final String fileName;
	private final List<StudentVO> stdList;
	
	public StudentServiceImplV1(String fileName) {
		this.fileName = fileName;
		stdList = new ArrayList<>();
		loadStudent();
	}
	
	private void loadStudent() {
		InputStream is = null;
		Scanner fileScan = null;
		
		try {
			is = new FileInputStream(fileName);
			fileScan = new Scanner(is);
			while(fileScan.hasNext()) {
				String line = fileScan.nextLine();
				String[] sts = line.split(":");
				
				StudentVO stVO = StudentVO.builder()
									.num(sts[0])
									.name(sts[1])
									.dept(sts[2])
									.grade(Integer.valueOf(sts[3]))
									.tel(sts[3])
									.build();
				stdList.add(stVO);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	@Override
	public void inputStudent() {
		// 학생정보 입력받기
		
	}

	@Override
	public void printStudent() {
		System.out.println(Line.dLine(50));
		System.out.println("학생정보");
		System.out.println(Line.sLine(50));
		System.out.println("학번\t이름\t학과\t학년\t전화번호");
		System.out.println(Line.sLine(50));
		for(StudentVO stVO : stdList) {
			System.out.print(stVO.getNum() + "\t");
			System.out.print(stVO.getName() + "\t");
			System.out.print(stVO.getDept() + "\t");
			System.out.print(stVO.getGrade() + "\t");
			System.out.println(stVO.getTel());
		}
		System.out.println(Line.dLine(50));
	}
	
	private void saveStudent() {
		FileWriter file = null;
		PrintWriter out = null;
		
		try {
			file = new FileWriter(fileName);
			out = new PrintWriter(file);
			for(StudentVO stVO : stdList) {
				out.print(stVO.getNum() + ":");
				out.print(stVO.getName() + ":");
				out.print(stVO.getDept() + ":");
				out.print(stVO.getGrade() + ":");
				out.println(stVO.getTel());
			}
			out.flush();
			out.close();
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

}
