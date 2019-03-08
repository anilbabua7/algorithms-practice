package com.anil.exercise;

import java.util.HashMap;
import java.util.Map;



public class FourElements {
	
	public void findFourElements(int[] ar) {
		int n = ar.length;
		Map<Integer, Pair> map = new HashMap<>();
		
		for(int i=0 ; i<n-1 ; i++) {
			for(int j=i+1 ; j<n ; j++) {
				int sum = ar[i]+ar[j];
				if(map.containsKey(sum)) {
					System.out.println("Pairs found such that a+b = c+d : "+ar[i]+" : "+ar[j]+" : "+map.get(sum).first+" : "+map.get(sum).second);
					return;
				}
				else {
					map.put(sum, new Pair(ar[i], ar[j]));
				}
			}
		}
	}

	public static void main(String[] args) {
		FourElements elements = new FourElements();
		int[] ar = {3, 4, 7, 1, 2, 9, 8};
		elements.findFourElements(ar);
	}

}
