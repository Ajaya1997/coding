package gfg.array;

public class LeftRotation {

	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 7, 9};
		int round = 14;
		
		round = round % arr.length;
		rotate(arr, 0, round-1);
		rotate(arr, round, arr.length-1);
		rotate(arr, 0, arr.length-1);
		for(int num : arr) {
			System.out.print(num + " ");
		}

	}

	private static void rotate(int[] arr, int i, int length) {
		while(i < length) {
			int temp = arr[i];
			arr[i] = arr[length];
			arr[length] = temp;
			i++;
			length--;
		}	
	}

}
