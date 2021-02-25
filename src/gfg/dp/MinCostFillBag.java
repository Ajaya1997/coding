package gfg.dp;

public class MinCostFillBag {

	public static void main(String[] args) {
		int cost[] = {20, 10, 4, 50, 100};
		int w = 5;
		
		System.out.println(minCostToFill(cost, w, cost.length));
	}

	private static int minCostToFill(int[] cost, int w, int length) {
		int min_cost[][] = new int[length+1][w+1];
		for (int i = 0; i <= w; i++)
            min_cost[0][i] = Integer.MAX_VALUE;
		 for (int i = 1; i <= length; i++)
	            min_cost[i][0] = 0;
		 
		 for (int i = 1; i <= length; i++)
			{
				for (int j = 1; j <= w; j++) {
					
					if(i > j) {
						min_cost[i][j] = min_cost[i-1][j];
					}
					
					else {
						min_cost[i][j] = Math.min(min_cost[i-1][j], min_cost[i][j - i] + cost[i-1]);
					}
				}
			}
		return (min_cost[length][w] == Integer.MAX_VALUE)? -1: 
            min_cost[length][w];
	}

}
