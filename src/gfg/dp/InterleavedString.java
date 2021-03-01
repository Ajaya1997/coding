package gfg.dp;

public class InterleavedString {

	public static void main(String[] args) {
		String a = "XXY", b = "XXZ", c = "XXXXZY";
		
		System.out.println(isInterLeaved(a, b, c));
	}

	// recursion
	private static boolean isInterLeaved(String a, String b, String c, int length, int length2, int length3) {
		
		if(length == 0 && length2 == 0 && length3 == 0)
			return true;
		if(length3 == 0)
			return false;
		
		if(length > 0 && a.charAt(length-1) == c.charAt(length3-1)) {
			return isInterLeaved(a, b, c, length-1, length2, length3-1);
		}
		if(length2 > 0 && b.charAt(length2-1) == c.charAt(length3-1)) {
			return isInterLeaved(a, b, c, length, length2-1, length3-1);
		}
		return isInterLeaved(a, b, c, length, length2, length3-1);
	}
	
	// bottom up
	
	private static boolean isInterLeaved(String a, String b, String c) {
		int m = a.length();
		int n = b.length();
		boolean dp[][] = new boolean[m + 1][n + 1];

		if (m + n != c.length()) {
			return false;
		}

		for (int i = 0; i < m + 1; i++) {
			for (int j = 0; j < n + 1; j++) {

				if (i == 0 && j == 0) {
					dp[i][j] = true;
				}

				else if (i == 0) {
					if (b.charAt(j - 1) == c.charAt(i + j - 1)) {
						dp[i][j] = dp[i][j - 1];
					}
				} else if (j == 0) {
					if (a.charAt(i - 1) == c.charAt(i + j - 1)) {
						dp[i][j] = dp[i - 1][j];
					}
				}
				
				else if(a.charAt(i-1) == c.charAt(i+j-1) && b.charAt(j-1) != c.charAt(i+j-1)) {
					dp[i][j] = dp[i-1][j];
				}
				
				else if(a.charAt(i-1) != c.charAt(i+j-1) && b.charAt(j-1) == c.charAt(i+j-1)) {
					dp[i][j] = dp[i][j-1];
				}
				else if(a.charAt(i-1) == c.charAt(i+j-1) && b.charAt(j-1) == c.charAt(i+j-1)) {
					dp[i][j] = dp[i][j-1] || dp[i-1][j];
				}
			}

		}
		
		return dp[m][n];

	}
	 

}
