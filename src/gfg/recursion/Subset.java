package gfg.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {

	static List<String> result = new ArrayList<>();
	public static void main(String[] args) {
		String s = "aab";
		solve(s, "");
		System.out.println(result);
	}

	private static void solve(String input, String output) {
		if(input.length() == 0) {
			result.add(output);
			return;
		}
		solve(input.substring(1), output);
		solve(input.substring(1), output + input.charAt(0));
		return;
			
	}

}
