package gfg.dp;

public class LcsWithThree {

	static int[][][] dp = new int[100][100][100];
	public static void main(String[] args) {
		String str1 = "geeks";
		String str2 = "geeksfor";
		String str3 = "geeksforgeeks";
		
		System.out.println(lcs(str1, str2, str3, str1.length(), str2.length(), str3.length()));
	}

	private static int lcs(String str1, String str2, String str3, int length1, int length2, int length3) {
		if(length1==0 || length2==0 || length3==0)
			return 0;
		if(dp[length1][length2][length3]!=0) {
			return dp[length1][length2][length3];
		}
		if(str1.charAt(length1-1) == str2.charAt(length2-1) && str2.charAt(length2-1) == str3.charAt(length3-1)) {
			return dp[length1][length2][length3] = 1+ lcs(str1, str2, str3, length1-1, length2-1, length3-1);
		}
		else {
			return dp[length1][length2][length3] = Math.max(lcs(str1, str2, str3, length1-1, length2, length3), 
					Math.max(lcs(str1, str2, str3, length1, length2-1, length3), lcs(str1, str2, str3, length1, length2, length3-1)));
		}
		
	}

}
