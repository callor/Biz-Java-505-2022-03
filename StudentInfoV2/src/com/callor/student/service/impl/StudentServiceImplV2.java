package com.callor.student.service.impl;

import java.io.PrintStream;
import java.util.List;

import com.callor.student.model.StudentVO;
import com.callor.student.utils.Line;

public class StudentServiceImplV2 extends StudentServiceImplV1{

	private final PrintStream ps;
	/*
	 * 매개변수로 stdList 와 fileName 을 주입받아
	 * V1 클래스의 생성자를 통해서 stdList 와 fileName 을 초기화 하자
	 */
	public StudentServiceImplV2(List<StudentVO> stdList, 
					String fileName, PrintStream ps) {
		super(stdList, fileName);
		this.ps = ps;
	}
	
	@Override
	public void printStudent() {
//		 PrintStream ps = System.out;
		printAndFileSaveStudent(ps);
	}
	
	protected void printAndFileSaveStudent(PrintStream ps) {
		
		PrintStream out = ps;
		out.println(Line.dLine(50));
		out.println("학생관리");
		out.println(Line.sLine(50));
		out.println("학번\t이름\t학과\t학년\t전화번호");
		for(StudentVO stVO : stdList) {
			out.printf("%s\t", stVO.getNum());
			out.printf("%s\t", stVO.getName());
			out.printf("%s\t", stVO.getDept());
			out.printf("%s\t", stVO.getGrade());
			out.printf("%s\n", stVO.getTel());
		}
		out.close();
		ps.close();
	}
	
	
	
}
