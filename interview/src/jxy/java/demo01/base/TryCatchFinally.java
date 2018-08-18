package jxy.java.demo01.base;


public class TryCatchFinally {
	
	// 测试try catch finally 流程
	public void demo01(){	
		try{
			System.out.println("try.............");
			Integer.parseInt("java");
			return;
		}catch(Exception e){
			System.out.println("catch...........");
			e.printStackTrace();
		}finally{
			System.out.println("finally.........");			
		}
	}
	
	public static void main(String[] args) {
		TryCatchFinally tryCatchFinally = new TryCatchFinally();
		tryCatchFinally.demo01();
	}
}
