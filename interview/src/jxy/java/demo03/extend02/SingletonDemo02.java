package jxy.java.demo03.extend02;

public class SingletonDemo02 {
	
	private SingletonDemo02(){}

	private static SingletonDemo02 demo;

	public static SingletonDemo02 getInstance() {
		if (demo == null) { // 每次要进行判断代码不优雅
			synchronized (SingletonDemo02.class) {
				if (demo == null) {
					demo = new SingletonDemo02();
				}
			}
		}
		return demo;
	}

}
