package jxy.java.demo08.base;

import java.io.Serializable;

// 内存--->硬盘  就是转化为二进制的过程 (序列化过程)
public class Student implements Serializable{

	private static final long serialVersionUID = 3326694874182755921L;

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + "]";
	}

	private int id;
	private String age;

	public Student(int id, String age) {
		super();
		this.id = id;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
