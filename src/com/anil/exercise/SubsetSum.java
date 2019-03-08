package com.anil.exercise;

public class SubsetSum {
	
	public void isSumFound(int[] ar) {
		int n = ar.length;
		int sum = 0;
		for(int i=0 ; i<n ; i++) {
			sum += ar[i];
		}
		
		if(sum%2 != 0) return;
		sum = sum/2;
		
		boolean dp[][] = new boolean[n+1][sum+1];
		for(int i=0 ; i<=n ; i++) {
			dp[i][0] = true;
		}
		
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=sum ; j++) {
				if(ar[i-1] <= j) {
					dp[i][j] = dp[i-1][j-ar[i-1]];
				}
				else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		if(dp[n][sum]) {
			System.out.println("Yes, Set can be divided into two");
		}
		else {
			System.out.println("No, Set can not be divided into two");
		}
	}

	public static void main(String[] args) {
		int ar[] = {1, 5, 11, 7};
		SubsetSum subset = new  SubsetSum();
		subset.isSumFound(ar);
				

	}

}
