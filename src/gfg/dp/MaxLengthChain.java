package gfg.dp;


class Pair{
	int a;
	int b;
	public Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
public class MaxLengthChain {

	public static void main(String[] args) {
		int n = 2;
		
		Pair p[] = {new Pair(5, 10) , new Pair(1, 11)};
		
		System.out.println(maxLengthPair(p, n));
	}

	private static int maxLengthPair(Pair[] p, int n) {
		int [] output = new int[n];
		output[0] = 1;
		
		for (int i = 1; i < p.length; i++) {
			for (int j = i-1; j >= 0 ; j--) {
				if(p[i].a > p[j].b) {
					int possibleAns = output[j] + 1;
					if(possibleAns > output[i]) {
						output[i] = possibleAns;
					}
				}
			}
		}
		
		int max = output[0];
		for (int temp : output) {
			if(max < temp) {
				max = temp;
			}
		}
		return max;
	}

}
