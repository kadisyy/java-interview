package jxy.java.demo01.extend01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TryServlet")
public class TrySer extends HttpServlet {

	private FinallyConn finallyConn=new FinallyConn();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 测试数据库conn.close()方法带来影响
		finallyConn.demo01();
	}
	
}
