package gfg.dp;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
		int n = arr.length; 
        System.out.println("Length of lis is "
                           + lis(arr, n) + "\n"); 
	}

	private static int lis(int[] arr, int n) {
		if(n == 1)
			return 1;
		for (int i = 0; i < arr.length; i++) {
			lis(arr, i);
		}
		return 0;
	}

}
