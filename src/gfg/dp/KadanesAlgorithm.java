package gfg.dp;

public class KadanesAlgorithm {

	public static void main(String[] args) {
		int n = 8;
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		
		maxSubArraySum(arr, n);
	}

	private static void maxSubArraySum(int[] arr, int n) {
		int maxEndWith = Integer.MIN_VALUE;
		int minStartWith = 0;
		int index1 = 0;
		int index2 = 0;
		for (int i = 0; i < arr.length; i++) {
			minStartWith += arr[i];
			
			if(minStartWith < arr[i]) {
				minStartWith = arr[i];
				index1 = i;
			}
			
			if(maxEndWith < minStartWith) {
				maxEndWith = minStartWith;
				index2 = i;
			}
		}
		
		System.out.println(maxEndWith);
		System.out.println(index1);
		System.out.println(index2);
	}

}
