package gfg.recursion;

public class PrintNumber {

	public static void main(String[] args) {
		print(2);
	}

	private static void print(int i) {
		if(i==1) {
			System.out.println(i);
			return;
		}
		print(i-1);
		System.out.println(i);
		
	}

}
