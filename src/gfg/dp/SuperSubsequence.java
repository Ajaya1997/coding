package gfg.dp;

public class SuperSubsequence {

	public static void main(String[] args) {
		String X = "AGGTAB";
        String Y = "GXTXAYB";
 
        System.out.println("Length of the shortest "
                           + "supersequence is "
                           + shortestSuperSequence(X, Y));
	}

	private static int shortestSuperSequence(String x, String y) {
		
		int lcsLength = lcs(x, y, x.length(), y.length());
		System.out.println(lcsLength);
		
		return x.length() + y.length() - lcsLength;
	}

	private static int lcs(String x, String y, int length, int length2) {
		if(length==0 || length2 == 0)
			return 0;
		if(x.charAt(length-1) == y.charAt(length2-1)) {
			return 1 + lcs(x, y, length-1, length2-1);
		}
		else {
			return Math.max(lcs(x, y, length-1, length2), lcs(x, y, length, length2-1));
		}
	}

}
