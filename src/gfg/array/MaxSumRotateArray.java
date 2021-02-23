package gfg.array;

/*Find maximum value of Sum( i*arr[i]) with only rotations on given array allowed
 * 	Input: arr[] = {1, 20, 2, 10}
	Output: 72
	We can get 72 by rotating array twice.
	{2, 10, 1, 20}
	20*3 + 1*2 + 10*1 + 2*0 = 72
	
	formula==> r1 = r0 + sum - 4*a[n-1]
	*/
public class MaxSumRotateArray {

	public static void main(String[] args) {
		int arr[] = {1, 20, 2, 10};
		int sum = 0;
		int curr = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			curr += i * arr[i];
		}
		max  = curr;
		for (int i = 1; i < arr.length; i++) {
			curr = sum + curr - arr.length * arr[arr.length - i];
			if(max < curr) {
				max = curr;
			}
		}
		System.out.println(max);
	}

}
