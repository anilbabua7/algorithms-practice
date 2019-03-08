package com.anil.exercise;

public class TilingProblem {

	public void waysToTile(int n, int m) {
		//Given 1/M size tiles, Find the number of ways to tile n/m area.
		
		if(n<m) {
			System.out.println("1"); // There will always be only one way, If n<m
			return;
		}
		
		if(n == m) {
			System.out.println("2"); // There will always 2 ways, If n == m
			return;
		}
		
		int[] count = new int[n+1];
		for(int i=1 ; i<=n ; i++) {
			if(i<m) {
				count[i] = 1;
			}
			else if(i == m) {
				count[i] = 2;
			}
			else {
				count[i] = count[i-1]+count[i-m];
			}
		}
		
		System.out.println("Ways to tile the floor is : "+count[n]);
	}
	
	public static void main(String[] args) {
		int n = 7;
		int m = 4;
		TilingProblem prob = new TilingProblem();
		prob.waysToTile(n, m);

	}

}
