package com.anil.exercise;

public class RearrangePosNegNums {
	
	public void rearrange(int[] ar) {
		int n = ar.length;
		
		int i=-1;
		int j=0;
		
		while(j<n) {
			if(ar[j] < 0) {
				i++;
				swap(ar, i, j);
			}
			j++;
		}
		
		int pos = i+1;
		 i=0;
		 
		 while(pos<n && i<n) {
			 swap(ar, i, pos);
			 pos = pos+1;
			 i=i+2;
		 }
		 
		 for(int e : ar) {
			 System.out.print(e+"   ");
		 }
	}
	
	public void swap(int[] ar, int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}

	public static void main(String[] args) {
		int[] ar = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
		RearrangePosNegNums nums = new RearrangePosNegNums();
		nums.rearrange(ar);

	}

}
