package jxy.java.demo03.extend02;

public class SingletonDemo03 {

	private SingletonDemo03() {
		System.out.println("SingletonDemo03 is create");
	}

	// 静态内部类,用来实现真正单例
	private static class SingletonHolder {
		private static SingletonDemo03 instance = new SingletonDemo03();
	}
	// 通过此方法获取实例
	public static SingletonDemo03 getInstance(){
		return SingletonHolder.instance;
	}
	
	public static void otherMethod(){
		System.out.println("-----调用其他方法并不会产生对象------");
	}
	
	public static void main(String[] args) {
//		SingletonDemo03.otherMethod();
		System.out.println(SingletonDemo03.getInstance());
		System.out.println(SingletonDemo03.getInstance());
	}
}
