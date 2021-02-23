package gfg.dp;

public class FriendPair {

	static int dp[] = new int[100];
	public static void main(String[] args) {
		int n = 4; 
        System.out.println(countFriendsPairings(n)); 
	}

	private static int countFriendsPairings(int n) {
		if(n == 1)
			return 1;
		if(n == 2)
			return 2;
		
		if(dp[n] !=0)
			return dp[n];
		
		else {
			return dp[n] = countFriendsPairings(n-1) + (n-1) * countFriendsPairings(n - 2);
		}
		
	}

}
