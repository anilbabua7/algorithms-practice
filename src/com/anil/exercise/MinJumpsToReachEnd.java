package com.anil.exercise;

import java.util.Arrays;

public class MinJumpsToReachEnd {
	
	public void minJumps(int[] ar) {
		int n = ar.length;
		int[] dp = new int[n+1];
		if(ar[0] == 0) return;
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		for(int i=1 ; i<=n ; i++) {
			for(int j=0 ; j<i ; j++) {
				if(i-j <= ar[j] && dp[j] != Integer.MAX_VALUE) {
					dp[i] = Math.min(dp[i], dp[j]+1);
					break;
				}
			}
		}
		
		System.out.println("Minimum jumps needed to reach end : "+dp[n]);
	}

	public static void main(String[] args) {
		int[] ar = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		MinJumpsToReachEnd jumps = new MinJumpsToReachEnd();
		jumps.minJumps(ar);

	}

}
