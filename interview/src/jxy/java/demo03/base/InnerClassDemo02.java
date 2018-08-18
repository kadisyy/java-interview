package jxy.java.demo03.base;

/*
 * 静态内部类
 * */
class OutClass02 {

	private static int num = 3;
	
	// 内部类如果有static方法,则本身必须声明为static方式
	static class Inner {
		
		int num=4;
		
		void show() {
			System.out.println("show() num:" + num);
		}
		
		static void show2() {
			System.out.println("show2() num:" + OutClass02.num);
		}
	}
}

public class InnerClassDemo02 {

	public static void main(String[] args) {
		// 内部类是static的创建方式
		OutClass02.Inner inner=new OutClass02.Inner();
		inner.show();
		// 内部类与function都是static的情况
		OutClass02.Inner.show2();
	}
}

