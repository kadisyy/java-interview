package jxy.java.demo09.extend;

class MyThead extends Thread {

	@Override
	public void run() {
		System.out.println("当前线程的名称为:" + Thread.currentThread().getName());
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("运行main方法的线程名称为:" + Thread.currentThread().getName() );
		MyThead my1=new MyThead();
		MyThead my2=new MyThead();
//		my1.run();
//		my2.run();
		// 线程已经就绪完毕,随时可以执行,但是是否被cpu选中还需要看线程的队列
		my1.start();
		my2.start();
	}
}
