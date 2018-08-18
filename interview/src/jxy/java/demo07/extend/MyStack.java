package jxy.java.demo07.extend;

import java.util.Arrays;

// 采用数组自定义栈结构
public class MyStack<T> {

	// 设置栈的初始大小
	private final int DEFAULT_SIZE = 3;
	// 当前栈中的元素
	private int size = 0;
	// 每次需要的扩展大小
	private int capacity = 0;
	// 永远指向能够添加元素的位置,默认是0
	private int index = 0;
	// 声明用来存储数据的容器(数组)
	private Object[] array;
	
	public static void main(String[] args) {
		MyStack<String> stack=new MyStack<String>();
		System.out.println("判断数组是否为空:" + stack.isEmpty());  // true
		// 压栈操作
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println("判断数组的元素数量:" + stack.size);  // 3
		System.out.println("查看栈顶的元素:" + stack.peek());   // C
		System.out.println("判断数组的元素数量:" + stack.size);  // 3
		stack.push("D");  // System.out.println("enlarge..........");
		System.out.println("判断数组的元素数量:" + stack.size);  // 4
		System.out.println("出栈操作:" + stack.pop());    // D
		System.out.println("出栈操作:" + stack.pop());    // C
		System.out.println("出栈操作:" + stack.pop());    // B
		System.out.println("出栈操作:" + stack.pop());    // A
		System.out.println("判断数组是否为空:" + stack.isEmpty());  // true
		stack.clear();
		System.out.println(stack.size + "," + stack.capacity);  // 0 + "," + DEFAULT_SIZE
		
		
		
		
	}

	public MyStack() {
		this.capacity = this.DEFAULT_SIZE;
		this.array = new Object[this.capacity];
	}

	// 在创建栈的时候自定义大小
	public MyStack(int capacity) {
		this.capacity = capacity;
		this.array = new Object[this.capacity];
	}

	// 判断栈是否为空
	public boolean isEmpty() {
		return size == 0;
	}

	// 查看栈顶的元素(元素并不出栈)
	@SuppressWarnings("unchecked")
	public T peek() {
		return (T) this.array[this.index - 1];
	}

	// 出栈(元素会被删除)
	@SuppressWarnings("unchecked")
	public T pop() {
		index--;

		T t = (T) this.array[this.index];
		this.array[index] = null;
		this.size--;
		return t;
	}

	// 压栈操作(如果栈满,则需要扩展栈空间在添加元素)
	public void push(T t) {
		// 首先判断栈是否已满
		if (this.size < this.capacity) {
			this.array[index] = t;
			// 永远指向能够添加元素的位置
			index++;
			this.size++;
		} else {
			// 扩充容量,然后在添加数据
			enlarge();
			push(t);
		}
	}

	// 首先创建一个新数组,然后把原始数据复制到新数组中. 然后在赋回来
	public void enlarge() {
		System.out.println("enlarge..........");
		// 设置扩展的大小
		this.capacity = this.capacity + this.DEFAULT_SIZE;
		Object[] temp = new Object[capacity];
		// 把原始数组的数据赋值给目标数组
		System.arraycopy(this.array, 0, temp, 0, array.length);
		// 把原始数组的数据清空
		Arrays.fill(array, null);
		// 吧新的目标数组,赋值给原始数组
		this.array = temp;
	}

	// 清空数组,让数组回到原始状态
	public void clear() {
		Arrays.fill(array, null);
		this.index = this.size = 0;
		this.capacity = this.DEFAULT_SIZE;
		// 重新创建一个数组对象
		this.array = new Object[this.capacity];
	}

}
