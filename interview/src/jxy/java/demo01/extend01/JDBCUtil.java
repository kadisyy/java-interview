package jxy.java.demo01.extend01;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * 操作数据库的工具类：与数据库连接之前需要具备:
 *    1: url username password port   jdbc:mysql://127.0.0.1:3306/mysql
 *    2: driver 驱动程序
 * */
public class JDBCUtil {

	private static String getURLString(){
		return "jdbc:mysql://127.0.0.1:3306/mysql";
	}
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static Connection getConnection(){
		try {
			return DriverManager.getConnection(getURLString(), "root", "root");
		} catch (Exception e) {
		   throw new RuntimeException(e);
		}
	}
}
