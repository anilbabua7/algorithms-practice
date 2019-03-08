package com.anil.exercise;

public class MaxSumNo2ElemAdj {
	
	public void maxSum(int[] ar) {
		int n = ar.length;
		
		int incl = 0;
		int excl = 0;
		
		for(int i=0 ; i<n ; i++) {
			int temp = incl;
			incl = excl+ar[i];
			excl = Math.max(excl, temp);
		}
		
		System.out.println("Max sum such that no 2 elements are adjacent : "+Math.max(incl,excl));
	}

	public static void main(String[] args) {
		int arr[] = {1, 20, 3};
		MaxSumNo2ElemAdj elem = new MaxSumNo2ElemAdj();
		elem.maxSum(arr);

	}

}
