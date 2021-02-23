package gfg.dp;

import java.util.Arrays;

/*Given a gold mine of n*m dimensions. Each field in this mine contains a positive integer which is the amount of gold in tons. Initially the miner is at first column but can be at any row. He can move only (right->,right up /,right down\) that is from a given cell, the miner can move to the cell diagonally up towards the right or right or diagonally down towards the right. Find out maximum amount of gold he can collect.
 * 
 * Input : mat[][] = {{1, 3, 3},   
                   {2, 1, 4},	 
                  {0, 6, 4}};
	Output : 12 
	{(1,0)->(2,1)->(2,2)}
*/
public class GoldMineProblem {

	public static void main(String[] args) {
		int mat[][] = { { 10, 33, 13, 15 }, { 22, 21, 04, 1 }, { 5, 0, 2, 3 }, { 0, 6, 14, 2 } };

		System.out.println(findMaxGold(mat, mat.length, mat[0].length));
	}
	
	private static int findMaxGold(int[][] gold, int row, int col) {
		
		if(row == 0 || col == 0)
			return 0;
		if(row == 1 && col == 1){
			return gold[row-1][col-1];
		}
		if(row == 1 && col > 1) {
			
		}
		
		
		return 0;
	}
	  
	 

}
