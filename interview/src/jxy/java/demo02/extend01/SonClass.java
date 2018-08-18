package jxy.java.demo02.extend01;

import java.sql.SQLException;

/*
 * Java中Override要遵循的规则
 *  1: 参数列表必须与被重写方法的相同
 *  2: 返回类型必须与被重写方法的返回类型相同
 *  3: 重写方法不能比被重写方法限制有更严格的访问级别   
 *  4: 不能重写被标识为final的方法
 *  5: 重写方法不能抛出新的异常或者比被重写方法声明的检查异常更广的检查异常。但是可以抛出更少，更有限或者不抛出异常
 * */
class SuperClass {

	protected void show1() throws SQLException {
	}
}

public class SonClass extends SuperClass {

	@Override
	public void show1() throws SQLException {
		super.show1();
	}

}

class ExceptionDemo {
	// 父类的引用可以指向子类的对象
	private SuperClass superClass = new SonClass();

	public void show1() {
		try {
			superClass.show1();
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}
}
