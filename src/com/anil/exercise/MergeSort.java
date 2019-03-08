package com.anil.exercise;

public class MergeSort {

	public void sort(int[] ar, int start, int end) {
		if(start >= end) return;
		
		int mid = (start+end)/2;
		sort(ar, start, mid);
		sort(ar, mid+1, end);
		merge(ar, start, mid, end);
	}
	
	public void merge(int[] ar, int start, int mid, int end) {
		int n1 = mid-start+1;
		int n2 = end-mid;
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for(int i=0 ; i<n1 ; i++) {
			left[i] = ar[start+i];
		}
		
		for(int i=0 ; i<n2 ; i++) {
			right[i] = ar[mid+i+1];
		}
		
		int i=0,j=0;
		int k=start;
		
		while(i<n1 && j<n2) {
			if(left[i] < right[j]) {
				ar[k] = left[i];
				k++;
				i++;
			}
			else {
				ar[k] = right[j];
				j++;
				k++;
			}
		}
		
		while(i<n1) {
			ar[k] = left[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			ar[k] = right[j];
			j++;
			k++;
		}
		
	}
	
	public void printArray(int[] ar) {
		for(int i=0 ; i<ar.length ; i++) {
			System.out.print(ar[i]+"  ");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = { 1, 20, 6, 4, 5 };
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(arr, 0, arr.length-1);
		mergeSort.printArray(arr);
	}

}
