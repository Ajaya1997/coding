package gfg.dp;

public class SubsetSum {

	public static void main(String[] args) {
		int set[] = {3, 34, 4, 12, 5, 2};
		int sum = 1;
		
		System.out.println(isSubsetSumPossible(set, sum, set.length));
		System.out.println(isSubsetSumPossible(set, sum));

	}

	private static boolean isSubsetSumPossible(int[] set, int sum, int length) {
		boolean dp[] = new boolean[length+1];
		if(sum == 0)
			return true;
		if(length == 0 && sum > 0)
			return false;
		
		if(set[length-1] > sum)
			return dp[length] = isSubsetSumPossible(set, sum, length-1);
		
		return isSubsetSumPossible(set, sum - set[length-1], length-1) || isSubsetSumPossible(set, sum, length-1);
		
	}
	
	//top-down
	private static boolean isSubsetSumPossible(int[] set, int sum) {
		boolean dp[][] = new boolean[set.length+1][sum+1];
		 
		for (int i = 0; i < sum + 1; i++)
	            dp[0][i] = true;
	        for (int i = 1; i < set.length+1; i++)
	            dp[i][0] = false;
		
		for (int i = 1; i < set.length+1; i++) {
			for (int j = 1; j < sum+1; j++) {
				if(set[i-1] > j) {
					dp[i][j] = dp[i-1][j];
				}
				else {
					dp[i][j] = dp[i-1][j-set[i-1]] || dp[i-1][j];
				}
			}
		}
		
		return dp[set.length][sum];
	}

}
