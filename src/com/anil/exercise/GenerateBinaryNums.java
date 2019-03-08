package com.anil.exercise;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNums {
	
	public void generate(int n) {
		Queue<String> q = new LinkedList<String>();
		
		q.add("1");
		int i=0;
		while(i<n) {
			String temp = q.poll();
			System.out.print(temp+"  ");
			q.add(temp+"0");
			q.add(temp+"1");
			i++;
		}
	}

	public static void main(String[] args) {
		int n = 5;
		GenerateBinaryNums nums = new GenerateBinaryNums();
		nums.generate(n);

	}

}
