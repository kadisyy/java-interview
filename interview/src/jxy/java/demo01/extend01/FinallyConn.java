package jxy.java.demo01.extend01;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class FinallyConn {
	
	// 为什么conn一定要在finally关闭
	public void demo01(){
		Date date=new Date();
		Connection conn=null;
		try{
			// 此处已经获取connection对象
			conn = JDBCUtil.getConnection();
			System.out.println("数据库连接对象为:" + conn);
			System.out.println("---已经获取conn将执行CRUD操作---");
		}catch(Exception e){
			throw new RuntimeException(e);
		}finally{
			// 为什么一定要关闭
			try {
				conn.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}

	public static void main(String[] args) {
		FinallyConn tryCatchFinally = new FinallyConn();
		tryCatchFinally.demo01();
	}
}
