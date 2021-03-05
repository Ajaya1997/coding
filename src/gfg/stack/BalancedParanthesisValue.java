package gfg.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

/*(A) = 2*A
 * A,B->()// denote
 * AB = A + B
 * A = 1*/
public class BalancedParanthesisValue {

	public static int[] vector = new int[20];
	
	public static void main(String[] args) {
		String s = "(()(()))"; // output- 6
		
		Stack<Integer> stack = new Stack<>();
		int[] a = new int[s.length()];
		Arrays.fill(a, 0);
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ')') {
				int t = stack.pop();
				vector[t] = i;
			}
			else
				stack.push(i);
		}
		
		int result = go(0, s.length()-1);
		System.out.println(result);
	}

	private static int go(int low, int hi) {
		
		if (low + 1 == hi) {
			return 1;
		}
		int mid = vector[low];
		if(mid == hi) {
			return 2 * go(low+1, hi-1);
		}
		return go(low, mid) + go(mid+1, hi);
		
	}

}
