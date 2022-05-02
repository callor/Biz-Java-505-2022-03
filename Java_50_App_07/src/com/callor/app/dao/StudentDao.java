package com.callor.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.callor.app.dbconfig.DBConnection;
import com.callor.app.model.StudentVO;

import oracle.jdbc.driver.json.tree.JsonpPrimitive.JsonpStringNumberImpl;

public class StudentDao {
	
	private final Connection dbConn;
	public StudentDao() {
		dbConn = DBConnection.getDBConnection();
	}
	
	public List<StudentVO> selectAll() throws SQLException {
		
		String sql = " SELECT * FROM tbl_student ";
		PreparedStatement pStr = null;
		
		pStr = dbConn.prepareStatement(sql);
		ResultSet rSet = pStr.executeQuery();
		
		List<StudentVO> stList = new ArrayList<>();
		
		while(rSet.next()) {
			
			/*
			 * private String stNum;
			 * private String stName;
			 * private String stTel;
			 * private String stAddr;
			 * private String stDept;
			 * private int stGrade;
			 */
			// 모든 필드가 매개변수로 제공되는 임의 생성자를 호출하여 vo 만들기
			StudentVO stVO = new StudentVO(
					rSet.getString("st_num"),
					rSet.getString("st_name"),
					rSet.getString("st_tel"),
					rSet.getString("st_addr"),
					rSet.getString("st_dept"),
					rSet.getInt("st_grade")
				);
			
			// 기본생성자를 호출하여 비어있는 vo 를 만들고
			// setter() 메서드를 사용하여 변수에 값 setting 하기
			StudentVO stVO1 = new StudentVO();
			stVO1.setStNum(rSet.getString("st_num"));
			stVO1.setStName(rSet.getString("st_name"));
			stVO1.setStTel(rSet.getString("st_tel"));
			stVO1.setStAddr(rSet.getString("st_addr"));
			stVO1.setStDept(rSet.getString("st_dept"));
			stVO1.setStGrade(rSet.getInt("st_grade"));
			
			StudentVO stVO2 = StudentVO.builder()
								.stNum(rSet.getString("st_num"))
								.stName(rSet.getString("st_name"))
								.stTel(rSet.getString("st_tel"))
								.build();
			
			stList.add(stVO2);
			
		}
		return stList;
		
	}
	

}
