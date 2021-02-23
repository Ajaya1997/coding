package gfg.dp;

public class CoinChange {

	public static void main(String[] args) {
		int arr[] =  {1,2,3}; 
        int m = arr.length; 
        System.out.println(count(arr, m, 4));
        System.out.println(count(arr, 4));
	}

	private static int count(int[] arr, int m, int n) {
		if (m == 0)
			return 0;
		
		if (n == 0)
			return 1;
		
		if(n < arr[m-1]) {
			return count(arr, m-1, n);
		}
		 return count(arr, m, n - arr[m-1]) + count(arr, m-1, n);
	}
//top-down
	private static int count(int[] arr, int sum) {
		int dp[][] = new int[arr.length+1][sum+1];
		
		for(int i = 0; i <sum+1; i++)
			dp[0][i] = 0;
		for(int i = 0; i <arr.length+1; i++)
			dp[i][0] = 1;
		
		for (int i = 1; i < arr.length+1; i++) {
			for (int j = 1; j < sum+1; j++) {
				if(arr[i-1] > j) {
					dp[i][j] = dp[i-1][j];
				}
				else {
					dp[i][j] = dp[i][j-arr[i-1]] + dp[i-1][j];
				}
			}
		}
		return dp[arr.length][sum];
	}
}
