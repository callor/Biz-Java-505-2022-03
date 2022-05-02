package com.callor.app.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static Connection conn;
	static {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "user2";
		String password = "12341234";
		
		// JDK 1.6 이상에서는 사용하지 않아도 된다.
		// 		JDBC 가 4.0 이 포함되어 있고
		//		JDBC 4.0 이상에서는 사용하지 않아도 된다.
		// String jdbcDriver = "oracle.jdbc.OracleDriver";
		// Class.forName(jdbcDriver);
		
		try {
			conn = DriverManager.getConnection(url,username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // end static

	/*
	 * 프로젝트가 start 될때 conn(DB 연결) 객체가 자동으로 생성되어있고
	 * 필요할때 getDBConnection() method 통해 가져다 사용한다
	 */
	public static Connection getDBConnection() {
		return conn;
	}
}
