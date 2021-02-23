package gfg.recursion;

import java.util.Stack;

public class RemoveMidElementStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1);
		stack.add(2);
		stack.add(0);
		stack.add(5);
		
		deleteMid(stack, stack.size(), stack.size()/2);
	}

	private static void deleteMid(Stack<Integer> stack, int size, int i) {

		if(size-1 == i-1) {
			stack.pop();
			return;
		}
		int val = stack.pop();
		deleteMid(stack, size-1, i);
		stack.push(val);
		
		for(int val1: stack) {
			System.out.print(val1+" ");
		}
		System.out.println();
	}

}
