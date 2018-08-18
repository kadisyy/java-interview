package jxy.java.demo03.extend02;
// 单例饿汉模式: 调用其它方法时,对象也会被创建
public class SingletonDemo01 {

	private static SingletonDemo01 demo;

	private SingletonDemo01() {
	}

	static {
		System.out.println("----static---");
		demo = new SingletonDemo01();
	}

	public static SingletonDemo01 getInstance() {
		return demo;
	}
	
	public static void otherMethod(){
		System.out.println("--------otherMethod---------");
	}
	
	public static void main(String[] args) {
		SingletonDemo01.otherMethod();
	}

}
