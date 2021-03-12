package gfg.greedy;

import java.util.Map;
import java.util.TreeMap;

public class RemoveDuplicateLexico {

	public static void main(String[] args) {
		String s = "bcadc";
		Map<Character, Integer> unique = new TreeMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			unique.put(s.charAt(i), i);
		}
		System.out.println(unique);
		System.out.println(remove(s, unique));
	}

	private static String remove(String s, Map<Character, Integer> unique) {
		for(Character c : unique.keySet()) {			
			int index = s.indexOf(c);
			if(unique.values().stream().allMatch(idx -> idx >= index)) {
				System.out.println(c);
				unique.remove(c);
				return c+remove(s, unique);
			}
		}
		return "";
	}
}
