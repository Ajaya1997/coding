package gfg.dp;

public class MinJumpReachEnd {

	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		
		int jump = minJump(arr);
		
		System.out.println(jump);
		
	}

	private static int minJump(int[] arr) {
		int position = 0;
		int count = 0;
		int destination = 0;
		for (int i = 0; i < arr.length; i++) {
			destination = Math.max(destination, arr[i] + i);
			
			if(position == i && position != arr.length-1) {
				position = destination;
				count++;
			}
		}
		return count;
	}

}
