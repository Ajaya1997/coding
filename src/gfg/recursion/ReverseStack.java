package gfg.recursion;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1);
		stack.add(2);
		stack.add(0);
		stack.add(5);
		System.out.println("before reverse :");
		for(int val: stack) {
			System.out.print(val+" ");
		}
		System.out.println();
		reverse(stack, stack.size());

	}

	private static void reverse(Stack<Integer> stack, int size) {
		
		if(size == 0 || size == 1)
			return;
		int temp = stack.pop();
		reverse(stack, size-1);
		insert(stack, size-1, temp);
		
		
		for(int val: stack) {
			System.out.print(val+" ");
		}
		System.out.println();
	}

	private static void insert(Stack<Integer> stack, int size, int temp) {
		if(size == 0) {
			stack.push(temp);
			return;
		}
		int val = stack.pop();
		insert(stack, size-1, temp);
		stack.push(val);
	}

}
