package gfg.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Test {

	public static void main(String[] args) throws IOException {
		String str = "Hellow \b \nworld!!!\b\b\b.";
		while (str.contains("\b"))
			str = str.replaceAll("^\b+|[^\b]\b", "#");
		System.out.println(str);
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.substring(i, i+1).equals("#")) {
				temp = temp.substring(0, temp.length() - 1);
			}
			else {
				temp += str.substring(i, i+1);
			}
		}
		System.out.println(temp);
	}

}
