package com.anil.exercise;

import java.util.HashMap;
import java.util.Map;

class Pair{
	int first;
	int second;
	
	public Pair(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}
	
}

public class QuadrapleWithGivenSum {
	
	public void duadraple(int[] ar, int sum) {
		int n = ar.length;
		
		Map<Integer, Pair> map = new HashMap<Integer, Pair>();
		
		for(int i=0 ; i<n-1 ; i++) {
			for(int j=i+1 ; j<n ; j++) {
				int pairSum = ar[i]+ar[j];
				map.put(pairSum, new Pair(ar[i], ar[j]));
			}
		}
		
		map.forEach((k,v) -> {
			if(map.containsKey(sum-k)) {
				if(v.first != map.get(sum-k).first && v.first != map.get(sum-k).second && v.second != map.get(sum-k).first && v.second != map.get(sum-k).second) {
					System.out.println(v.first+"  "+v.second+"   "+map.get(sum-k).first+"   "+map.get(sum-k).second);
				}
			}
		});
	}

	public static void main(String[] args) {
		 int ar[] = {10, 20, 30, 40, 1, 2};
		 int sum = 91;
		 QuadrapleWithGivenSum quad = new QuadrapleWithGivenSum();
		 quad.duadraple(ar, sum);

	}

}
