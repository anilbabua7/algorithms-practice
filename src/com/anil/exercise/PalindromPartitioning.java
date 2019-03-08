package com.anil.exercise;

public class PalindromPartitioning {
	
	public void partition(String str) {
		int n = str.length();
		boolean[][] p = new boolean[n][n];
		int[][] c = new int[n][n];
		
		for(int i=0 ; i<n ; i++) {
			p[i][i] = true;
			c[i][i] = 0;
		}
		
		for(int L=2 ; L<=n ; L++) {
			for(int i=0 ; i<n-L+1 ; i++) {
				int j = i+L-1;
				
				if(L == 2) {
					p[i][j] = str.charAt(i) == str.charAt(j);
				}
				else {
					if(str.charAt(i) == str.charAt(j) && p[i+1][j-1]) {
						p[i][j] = true;
					}
				}
				
				if(p[i][j]) {
					c[i][j] = 0;
				}
				else {
					c[i][j] = Integer.MAX_VALUE;
					for(int k=i ; k<j ; k++) {
						c[i][j] = Math.min(c[i][j], c[i][k]+c[k+1][j]+1);
					}
				}
			}
		}
		
		System.out.println("Minimum partitions required to make the string palindroms : "+c[0][n-1]);
	}

	public static void main(String[] args) {
		 String str = "ababbbabbababa"; 
		 PalindromPartitioning palindrom = new PalindromPartitioning();
		 palindrom.partition(str);

	}

}
