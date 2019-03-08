package com.anil.exercise;

public class KnapsackProblem {
	
	public void knapSack(int[] wt, int values[], int W) {
		int n = wt.length;
		int[][] dp = new int[n+1][W+1];
		
		for(int i=0 ; i<=n ; i++) {
			for(int j=0 ; j<=W ; j++) {
				if(i == 0 || j == 0) {
					dp[i][j] = 0;
				}
				else if(wt[i-1] <= j) {
					dp[i][j] = Math.max(values[i-1]+dp[i-1][j-wt[i-1]], dp[i-1][j]);
				}
				else { 
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		System.out.println("Max value of knapsack is : "+dp[n][W]);
	}

	public static void main(String[] args) {
		int val[] = new int[]{60, 100, 120}; 
	    int wt[] = new int[]{10, 20, 30}; 
	    int  W = 50; 
	    KnapsackProblem prob = new KnapsackProblem();
	    prob.knapSack(wt, val, W);
	}

}
