package com.anil.exercise;

import java.util.ArrayList;
import java.util.List;

public class GrayCodes {

	public void generateGrayCode(int n) {
		
		List<String> total = new ArrayList<>();
		
		total.add(0, "0");
		total.add(1, "1");
		if(n == 1) {
			System.out.println(total);
			return;
		}
		
		for(int i=2 ; i<Math.pow(2, n) ; i=i<<1) {
			for(int j=i-1 ; j>=0 ; j--) {
				total.add(total.get(j));
			}
			
			for(int j=0 ; j<i ; j++) {
				total.set(j, total.get(j)+"0");
			}
			for(int j=i ; j<2*i ; j++) {
				total.set(j, total.get(j)+"1");
			}
		
		}
		
		for(String s : total) {
			System.out.print(s+"  ");
		}
	}
	
	public List<String> reverse(List<String> orig, int n) {
		List<String> rev = new ArrayList<String>();
		n = n-1;
		for(int i=0 ; i<=n ; i++) {
			rev.add(i, orig.get(n-i));
		}
		return rev;
	}
	
	public static void main(String[] args) {
		int n = 3;
		GrayCodes codes = new GrayCodes();
		codes.generateGrayCode(n);

	}

}
