package gfg.array;


/*problem:
 * sorted rotate array
	Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
	key = 3
	Output : Found at index 8
	time complex : O(log(n))
	*/
public class SearchRotateArray {

	public static void main(String[] args) {
		int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		int key = 3;
		int index = search(arr, key, arr.length);
		System.out.println("key index : "+ index);
	}

	private static int search(int[] arr, int key, int length) {
		int pivot = findPivot(arr, 0, length-1);
		System.out.println("Pivot index : "+pivot);
		int index;
		if(pivot == -1) {
			index = binarySearch(arr, 0, length-1, key);
		}
		else if(arr[pivot] == key) {
			index = pivot;
		}
		else if(arr[0] > key) {
			index = binarySearch(arr, pivot+1, length-1, key);
		}
		else {
			index = binarySearch(arr, 0, pivot, key);
		}
		return index;
	}

	private static int binarySearch(int[] arr, int low, int high, int key) {
		int mid = (low + high) / 2;
		int index = -1;
		while (low <= high) {
			if (arr[mid] > key) {
				high = mid - 1;
			} else if (arr[mid] == key) {
				index = mid;
				break;
			} else {
				low = mid + 1;
			}
			mid = (low + high)/2;
		}
		return index;
	}

	private static int findPivot(int[] arr, int start, int end) {
		if(start > end)
			return -1;
		if(start == end)
			return start;
		int mid = (start + end)/2;
		if(arr[mid] > arr[mid+1]) {
			return mid;
		}
		if(arr[mid] < arr[mid-1]) {
			return mid-1;
		}
		if(arr[start] >= arr[mid]) {
			return findPivot(arr, start, mid-1);
		}
		return findPivot(arr, mid+1, end);
	}

}
