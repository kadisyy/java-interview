package jxy.java.demo03.base;

/*
 * 内部类分为四种情况:
 *   1:成员内部类
 *   2:静态内部类
 *   3:匿名内部类
 *   4:局部内部类
 * */
class OutClass {

	private int num = 3;

	class Inner {

		int num = 4;

		 void show() {
			int num = 5;
			System.out.println("num:" + num); // num:5
			System.out.println("num:" + this.num); // num:4
			// 内部类直接访问外部类中成员
			System.out.println("num:" + OutClass.this.num);// num:3
		}
	}
}

public class InnerClassDemo01 {

	public static void main(String[] args) {
		// 创建和使用内部类的语法, 如果inner的 private则不能在外部访问
		OutClass.Inner inner = new OutClass().new Inner();
		inner.show();
	}
}
