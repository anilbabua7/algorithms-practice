package com.anil.exercise;

import java.util.Arrays;

public class MinCoins {
	
	public void minimumCoinsForSum(int[] coins, int sum) {
		int n = coins.length;
		Arrays.sort(coins);
		
		int[] dp = new int[sum+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		for(int i=1 ; i<=sum ; i++) {
			for(int j=0 ; j<n ; j++) {
				if(i<coins[j]) break;
				dp[i] = Math.min(1+dp[i-coins[j]], dp[i]);
			}
		}
		
		System.out.println("Minimum number of coins that make up the given value is : "+dp[sum]);
	}

	public static void main(String[] args) {
		int[] coins = {5,10,25};
		int sum = 30;
		MinCoins coinsSum = new MinCoins();
		coinsSum.minimumCoinsForSum(coins, sum);

	}

}
