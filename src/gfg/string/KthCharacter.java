package gfg.string;

public class KthCharacter {

	public static void main(String[] args) {
		String s = "ab4c12ed3";
		int k = 21;
		String decript = "";
		for(int i = 0; i < s.length(); ) {
			String temp = "";
			while(s.length() > i && Character.isAlphabetic(s.charAt(i))) {
				temp += s.charAt(i);
				i++;
			}
			String numString = "";
			while(s.length() > i && Character.isDigit(s.charAt(i))) {
				numString += s.charAt(i);
				i++;
			}
			int n = Integer.parseInt(numString);
			while (n > 0) {
				n--;
				decript += temp;
			}
		}
		System.out.println(decript + " "+decript.charAt(k-1));
	}

}
