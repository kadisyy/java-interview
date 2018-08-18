package jxy.java.demo03.extend01;

/*
 * 列举局部内部类的使用场景
 * */
public class InnerUserTest02 {

	public Object demo01() {

		final int num = 1;
		// 局部内部类中要使用外面的局部变量,则变量必须采用final关键字
		class Inner1 implements Interface01 {

			@Override
			public int method() {
				return num + 1;
			}

		}
		return new Inner1();
	}

	public int demo02() {

		final int num = 1;

		class Inner1 implements Interface02 {

			@Override
			public int method() {
				return num * 1;
			}

		}
		int result = new Inner1().method();
		return result;
	}

	public static void main(String[] args) {
		InnerUserTest02 test = new InnerUserTest02();
		System.out.println(test.demo01());
		System.out.println(test.demo02());
	}

}
