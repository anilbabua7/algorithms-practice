package com.anil.exercise;

//Find ways to get sum X from n-dice that has m-faces.

public class DiceThrow {
	
	public void diceThrow(int m, int n, int X) {
		int[][] dp = new int[n+1][X+1]; // Construct a matrix with number of dice as rows and sum to find as cols
		
		for(int i=1 ; i<=m ; i++) {
			dp[1][i] = 1; // If there is only one dice, There is only 1 way to get the sum less than or equal to face "m"
		}
		
		for(int i=2 ; i<=n ; i++) {
			for(int j=1 ; j<=X ; j++) {
				for(int k=1 ; k<j&&k<=m ; k++) {
					dp[i][j] += dp[i-1][j-k];
				}
				System.out.print(dp[i][j]+"   ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int m = 4;
		int n = 3;
		int X = 5;
		DiceThrow dice = new DiceThrow();
		dice.diceThrow(m, n, X);

	}

}
