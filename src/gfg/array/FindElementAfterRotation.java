package gfg.array;

/*	Input : arr[] : {1, 2, 3, 4, 5}
	ranges[] = { {0, 2}, {0, 3} }
	index : 1
	Output : 3
	Explanation : After first given rotation {0, 2}
	        arr[] = {3, 1, 2, 4, 5}
	      After second rotation {0, 3} 
	        arr[] = {4, 3, 1, 2, 5}
	After all rotations we have element 3 at given
	index 1. */
public class FindElementAfterRotation {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int ranges[][] = { {0, 2}, {0, 3} };
		int index = 1;
		for (int i = 0; i < ranges.length; i++) {
			int start = ranges[i][0];
			int end = ranges[i][1];
			while(start < end) {
				
				int temp = arr[start];
				arr[start] = arr[end];
				start++;
				arr[start] = temp;
				start++;
			}
		}
		System.out.println(arr[index]);
	}

}
