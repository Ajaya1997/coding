package gfg.array;

/*Find the Rotation Count in Rotated Sorted array
 * Input : arr[] = {15, 18, 2, 3, 6, 12}
	Output: 2
	Explanation : Initial array must be {2, 3,6, 12, 15, 18}. 
	We get the given array after 
	rotating the initial array twice.*/
public class RotationCount {

	public static void main(String[] args) {
		int arr[] = {15, 18, 2, 3, 6, 12};
		
		//finding pivot element
		int start = 0;
		int end = arr.length-1;
		int mid = (end + start)/2;
		int pivot = -1;
		while(start < end) {
			if(arr[mid] > arr[mid+1]) {
				pivot = mid;
				break;
			}
			else if(arr[mid] < arr[mid - 1]) {
				pivot = mid - 1;
				break;
			}
			else if(arr[0] > arr[mid]) {
				end = mid - 1; 
			}
			else {
				start = mid + 1;
			}
			mid = (end + start)/2;
		}
		System.out.println(pivot + 1);
	}

}
