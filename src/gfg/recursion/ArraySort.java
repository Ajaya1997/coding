package gfg.recursion;

public class ArraySort {

	public static void main(String[] args) {
		int[] array = { 1, 2, 0, 5 };
		sort(array, array.length);

	}

	private static void sort(int[] array, int length) {

		if (length == 0)
			return;
		if (length == 1) {
			return;
		}
		
		int val = array[length-1];
		sort(array, length-1);
		
		for(int i = 0; i < length-1; i++) {
			if(array[i] > array[i+1]) {
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
			}
		}
		
		for(int num : array) {
			System.out.print(num +" ");
		}
		System.out.println();
	}

}

