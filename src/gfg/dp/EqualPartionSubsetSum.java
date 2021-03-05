package gfg.dp;

import java.util.Arrays;

public class EqualPartionSubsetSum {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5};
		int sum = Arrays.stream(arr).sum();
		if (sum % 2 != 0) {
			System.out.println("Not possible");
		}
		System.out.println(equalPartion(arr, sum/2, arr.length));	
		System.out.println(equalPartion(arr, sum/2));	
	}

	//recursion
	private static boolean equalPartion(int[] arr, int sum, int length) {
		if(length == 0 && sum > 0) {
			return false;
		}
		if(sum == 0)
			return true;
		if(sum < arr[length - 1]) {
			return equalPartion(arr, sum, length-1);
		}
		return equalPartion(arr, sum - arr[length-1], length-1) || equalPartion(arr, sum, length-1);
	}
	
	
	//tabulation
	private static boolean equalPartion(int[] arr, int sum) {
		boolean[][] dp = new boolean[arr.length+1][sum+1];
		for (int i = 0; i < arr.length+1; i++) {
			dp[i][0] = false;
		}
		for (int i = 0; i < sum+1; i++) {
			dp[0][i] = true;
		}
		
		for (int i = 1; i < arr.length+1; i++) {
			for (int j = 1; j < sum+1; j++) {
				if(j < arr[i-1]) {
					dp[i][j] = dp[i-1][j];
				}
				else {
					dp[i][j] = dp[i-1][j] || dp[i][j-1];
				}
			}
		}
		return dp[arr.length][sum];
	}

}
