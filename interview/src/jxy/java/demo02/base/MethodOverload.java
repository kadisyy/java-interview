package jxy.java.demo02.base;

/*
 * Overload：相同的方法名,不同的参数类型或者参数数量.
 * */
public class MethodOverload {

	private void methodA() {
	}

//	private int methodA() {
//		return 1;
//	}

//	public void methodA() throws Exception {
//	}

	 public void methodA(int a) {
	
	 }

//	public void methodA(int[] a) {
//		System.out.println(a);
//	}
//
	public void methodA(int... a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		MethodOverload load = new MethodOverload();
//		load.methodA(new int[] { 1, 2, 3 });
		load.methodA(1,2,3);
	}
}
