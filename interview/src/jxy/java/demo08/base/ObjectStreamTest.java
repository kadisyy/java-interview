package jxy.java.demo08.base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 演示对象输入输出流,理解序列化的概念
 * */
public class ObjectStreamTest {
	
	public static void main(String[] args) throws Exception {
		//ObjectStreamTest.writeObject();
		ObjectStreamTest.readObject();
	}

	public static void readObject() throws Exception {
		ObjectInputStream read=new ObjectInputStream(new FileInputStream("C:/student.o"));
		Student s1=(Student)read.readObject();
		Student s2=(Student)read.readObject();
		System.out.println(s1 + "," + s2);
	}

	public static void writeObject() throws Exception {
		ObjectOutputStream write =new ObjectOutputStream(new FileOutputStream("c:/student.o"));
		write.writeObject(new Student(1, "aa"));
		write.writeObject(new Student(2, "bb"));
		write.close();
	}
}
