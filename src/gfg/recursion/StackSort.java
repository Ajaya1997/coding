package gfg.recursion;

import java.util.Arrays;
import java.util.Collection;
import java.util.Stack;

public class StackSort {

	public static void main(String[] args) {
		int[] array = { 1, 2, 0, 5 };
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1);
		stack.add(2);
		stack.add(0);
		stack.add(5);
		
		sort(stack, stack.size());
	}

	private static void sort(Stack<Integer> stack, int size) {
		if(size == 1)
			return;
		if(size == 0)
			return;
		int temp = stack.pop();
		sort(stack, size-1);
		
		insert(stack, temp);
		
		for (int i = 0; i < stack.size(); i++) {
			System.out.print(stack.get(i) + " ");
		}
		System.out.println();
	}

	private static void insert(Stack<Integer> stack, int temp) {
		
		if(stack.size() == 0 || stack.peek() <= temp) {
			stack.push(temp);
			return;
		}
		int val = stack.pop();
		insert(stack, temp);
		stack.push(val);
	}

}
