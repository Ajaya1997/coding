package gfg.dp;

import java.util.Arrays;

public class CuttingRoad {
	static int[][] dp = new int[1000][1000];
	public static void main(String[] args) {
		int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20}; 
        int size = arr.length; 
        int road = size;
        //Arrays.fill(dp, -1);
        int length[] = new int[size]; 
        for (int i = 0; i < size; i++) { 
            length[i] = i + 1; 
        } 
        System.out.println("Maximum Obtainable Value is "+ 
                            cutRod(arr, size, length, road));
	}

	private static int cutRod(int[] arr, int size, int[] length, int road) {
		if (size <= 0 || road <= 0) {
			return 0;
		}
		if(dp[size][road] != 0) {
			return dp[size][road];
		}
		if(road < length[size - 1]) {
			return dp[size][road] = cutRod(arr, size-1, length, road);
		}
		else {
			return dp[size][road] = Math.max(arr[size-1] + cutRod(arr, size, length, road - length[size-1]), 
					cutRod(arr, size - 1, length, road));
		}
		
	}

}
