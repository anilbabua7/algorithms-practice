package com.anil.exercise;

public class NoOfWaysToCoverDistance {
	
	public void waysToCoverDist(int n, int[] steps) {
		int[] dp = new int[n+1];
		dp[0] = 1;
		
		for(int i=1 ; i<=n ; i++) {
			for(int j=0 ; j<steps.length ; j++) {
				if(i<steps[j]) break;
				dp[i] += dp[i-steps[j]];
			}
		}
		
		System.out.println("No of ways to cover distance using given steps is : "+dp[n]);
	}

	public static void main(String[] args) {
		int n = 3;
		int[] steps = {1,2,3};
		NoOfWaysToCoverDistance conver = new NoOfWaysToCoverDistance();
		conver.waysToCoverDist(n, steps);

	}

}
