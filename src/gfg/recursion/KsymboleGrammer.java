package gfg.recursion;

public class KsymboleGrammer {

	public static void main(String[] args) {
		int n = 4, k = 2;
		
		int result = solve(n, k);
		System.out.println(result);
	}

	private static int solve(int n, int k) {
		
		if(n==1 && k==1) {
			return 0;
		}
		
		int mid = (int)Math.pow(2, n-1)/2;
		
		if(k > mid) {
			return not(solve(n-1, k-mid));
		}
		else {
			return solve(n-1, k);
		}
		
	}

	private static int not(int solve) {
		if(solve == 0)
			return 1;
		return 0;
	}

}
