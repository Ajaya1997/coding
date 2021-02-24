package gfg.dp;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int arr[] = {50, 3, 10, 7, 40, 80}; 
		int n = arr.length; 
		int temp = Integer.MIN_VALUE;
        System.out.println("Length of lis is "
                           + lis(arr, n) + "\n"); 
	}

	private static int lis(int[] arr, int n) {
		int output[] = new int[n];
		output[0] = 1;
		
		for (int i = 1; i < arr.length; i++) {
			for(int j = i-1; j >= 0; j--) {
				if(arr[i] > arr[j]) {
					int possibleAns = output[j] + 1;
					if(possibleAns > output[j]) {
						output[j] = possibleAns;
					}
				}
			}
		}
		int best = 0;
		for(int val: output) {
			if(best < val) {
				best = val;
			}
		}
		
		
		return best;
	}

}
