package com.anil.exercise;

public class LongestPalindromicSequence {
	
	public void longestPalindrom(String str) {
		int n = str.length();
		StringBuilder reverse = new StringBuilder(str).reverse();
		
		int[][] dp = new int[n+1][n+1];
		
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=n ; j++) {
				if(str.charAt(i-1) == reverse.charAt(j-1)) {
					dp[i][j] = Math.max(dp[i-1][j-1]+1, dp[i-1][j]);
				}
				else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		System.out.println("Longest palindromic sequence length is : "+dp[n][n]);
	}

	public static void main(String[] args) {
		String str = "GEEKSFORGEEKS";
		LongestPalindromicSequence seq = new LongestPalindromicSequence();
		seq.longestPalindrom(str);

	}

}
