package jxy.java.demo03.base;

import java.io.File;
import java.io.FilenameFilter;


/*
 * 匿名内部类
 * */
public class InnerClassDemo03 {

	public static void main(String[] args) {
		String[] names = new File("C:/test").list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
//				System.out.println("dir:" + dir);
//				System.out.println("name:" + name);
				return name.endsWith(".jar");
			}
		});
		for(String temp:names){
			System.out.println(temp);
		}
	}
}

