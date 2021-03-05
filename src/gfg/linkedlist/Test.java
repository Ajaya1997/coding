package gfg.linkedlist;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		String s = "wdkwskdnskd";
		Map<Character, Integer> frequencyCount = new HashMap<>();
		
		for(int i=0; i< s.length(); i++) {
			if(frequencyCount.containsKey(s.charAt(i))) {
				frequencyCount.put(s.charAt(i), frequencyCount.get(s.charAt(i))+1);
			}
			else {
				frequencyCount.put(s.charAt(i), 1);
			}
		}
		for(Entry<Character, Integer> ch : frequencyCount.entrySet()) {
			System.out.println(ch.getKey() +"->" +ch.getValue());
		}
		
	}

}
