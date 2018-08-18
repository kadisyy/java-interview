package jxy.java.demo10.extend;

class Demo {

	@Override
	protected void finalize() throws Throwable {
		// 此方法被调用说明,调用当前方法的对象会被回收
		System.out.println("finalizer方法被调用,调用当前方法的线程为:"
				+ Thread.currentThread().getName());
	}

}

public class GCDemo {

	public static void main(String[] args) {
		Demo demo=new Demo();
		// 没有变量引用,则说明该对象是垃圾,默认情况垃圾回收器不会立即回收,这取决于内存是否充足
		new Demo();
		// 可以手动调用垃圾回收器线程,回收垃圾对象
		System.gc();
		throw new RuntimeException();
	}
}
