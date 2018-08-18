package jxy.java.demo04.base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> arrList = new ArrayList<String>();
		List<String> linList = new LinkedList<String>();
		
		arrList.add("A");
		arrList.add("B");
		arrList.add("C");
		
		linList.add("A");
		linList.add("B");
		linList.add("C");
		System.out.println("------------END-------------");
	}
}
