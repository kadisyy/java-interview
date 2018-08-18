package jxy.java.demo04.extend01;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionsDemo {

	// java 中Set的使用(不允许有重复的对象):
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		String a = new String("A");
		String b = new String("B");
		String c = new String("A1");
		hashSet.add(a);
		hashSet.add(b); 
		hashSet.add(c);
		System.out.println(hashSet);
		System.out.println(hashSet.size());
		String cz = hashSet.add(c) ? "此对象不存在" : "已经存在";
		System.out.println("测试是否可以添加对象    " + cz);
		System.out.println(hashSet.isEmpty());
		// 测试其中是否已经包含某个对象
		System.out.println(hashSet.contains("A"));
		Iterator<String> ir = hashSet.iterator();
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}
		// 测试某个对象是否可以删除
		System.out.println(hashSet.remove("a"));
		System.out.println(hashSet.remove("A"));
		// 经过测试,如果你想再次使用ir变量,必须重新更新以下
		ir = hashSet.iterator();
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}
	}
}
