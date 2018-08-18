package jxy.java.demo06.base;

public class StringDemo {

	public void demo01() {
		StringBuffer bf = new StringBuffer("AAA");
		bf.append("BBB");
		String s = bf.toString();
		System.out.println(s);
	}

	// new对象, 与字符串直接赋值的区别
	public void demo02() {
		String s1 = new String("AAA");
		String s2 = new String("AAA");
		// 比较地址
		System.out.println(s1 == s2);
		// 比较对象的值
		System.out.println(s1.equals(s2));
		System.out.println();
		// 不用new的字符串 会存储到常量池中
		String s3 = "AAA";
		String s4 = "AAA";
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

	}

	// 测试StringBuffer与Stirng的不同
	public void demo03() {
		String s5 = "AAA";
		String s6 = s5;
		s6 = s6 + "BBB";
		// 字符串是不可变的,每次的修改本质上都是创建了一个副本
		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));
		System.out.println();
		// 如果遇到字符串的频繁相加如何处理,StringBuffer来处理
		StringBuffer s7 = new StringBuffer("AAA");
		StringBuffer s8 = s7;
		s8.append("BBB");
		System.out.println(s7 == s8);
		System.out.println(s7.equals(s8));
	}

	public static void main(String[] args) {
		StringDemo demo = new StringDemo();
		demo.demo03();
	}
}
