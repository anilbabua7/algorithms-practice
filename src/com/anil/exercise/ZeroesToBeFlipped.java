package com.anil.exercise;

public class ZeroesToBeFlipped {

	public void flipZeroes(int[] ar, int m) {
		int zeroCount = 0;
		int l = 0, r = 0;
		int maxConsOnes = Integer.MIN_VALUE;

		while (r < ar.length) {
			
			if (zeroCount <= m) {
				if(ar[r] == 0)
					zeroCount++;
				r++;
			} else {
				if (l < r && ar[l] == 0) {
					zeroCount--;
				}
				l++;
			}
			if (zeroCount <= m) {
				maxConsOnes = Math.max(maxConsOnes, r - l);
			}
		}
		System.out.println("Max consecutive ones are : "+maxConsOnes);
	}

	public static void main(String[] args) {
		int ar[] = { 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1 };
		int m = 2;
		ZeroesToBeFlipped zeroes = new ZeroesToBeFlipped();
		zeroes.flipZeroes(ar, m);

	}

}
