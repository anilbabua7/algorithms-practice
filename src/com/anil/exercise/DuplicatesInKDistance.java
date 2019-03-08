package com.anil.exercise;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInKDistance {
	
	public void findDuplicates(int[] ar, int k) {
		int n = ar.length;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0 ; i<k ; i++) {
			if(map.containsKey(ar[i])) {
				System.out.println("Duplicate exists at K distance");
				return;
			}
			map.put(ar[i], i);
		}
		
		
		for(int i=k ; i<n ; i++) {
			if(map.containsKey(ar[i]) && (i-k)<map.get(ar[i])) {
				System.out.println("Duplicate exists at K distance");
				return;
			}
			map.put(ar[i], i);
		}
		System.out.println("No duplicate found");
	}

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 1, 2, 3, 4};
		DuplicatesInKDistance kdis = new DuplicatesInKDistance();
		int k = 3;
		kdis.findDuplicates(arr, k);

	}

}
