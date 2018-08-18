package jxy.java.demo07.base;

import java.util.Enumeration;
import java.util.Stack;

public class StackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Stack<Object> stack = new Stack<Object>(); // 创建堆栈对象

		stack.push(new Integer(1)); // 向栈中压入
		
		stack.push("2"); // 向 栈中 压入

		stack.push(new Double(3.00)); // 向 栈中 压入
		
		printStack(stack); // 显示栈中的所有元素

		System.out.println("3.00 的位置" + stack.search(3.00));

		System.out.println("元素" + stack.pop() + "出栈");
		printStack(stack); // 显示栈中的所有元素
		System.out.println("元素" + stack.pop() + "出栈");
		printStack(stack); // 显示栈中的所有元素
		System.out.println("元素" + stack.pop() + "出栈");
		printStack(stack); // 显示栈中的所有元素

	}

	private static void printStack(Stack<Object> stack) {
		if (stack.empty())
			System.out.println("堆栈是空的，没有元素");
		else {
			System.out.print("堆栈中的元素：");
			Enumeration<Object> items = stack.elements(); // 得到 stack 中的枚举对象
			while (items.hasMoreElements())
				// 显示枚举（stack ） 中的所有元素
				System.out.print(items.nextElement() + " ");
		}
		System.out.println(); // 换行
	}
}
