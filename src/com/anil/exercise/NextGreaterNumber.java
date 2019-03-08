package com.anil.exercise;

import java.util.Arrays;
import java.util.Collections;

public class NextGreaterNumber {
	
	public void nextNum(StringBuilder num) {
		int n = num.length();
		int i=n-1 ;
		
		for( ; i>0 ; i--) {
			if(num.charAt(i) < num.charAt(i-1)) continue;
			else break;
		}
		
		i=i-1;
		if(i<0) {
			System.out.println("No next great number is possible");
			return;
		}
		
		int minDigit = findMinDigit(num, i+1);
		char temp = num.charAt(minDigit);
		num.setCharAt(minDigit, num.charAt(i));
		num.setCharAt(i, temp);
		char[] str = num.toString().toCharArray();
		Arrays.sort(str, i+1,str.length);
		System.out.println(str);
		
	}
	
	public int findMinDigit(StringBuilder num, int i) {
		int minDig = i;
		while(i<num.length()) {
			if(num.charAt(i) < num.charAt(minDig)) {
				minDig = i;
			}
			i++;
		}
		return minDig;
	}

	public static void main(String[] args) {
		StringBuilder num = new StringBuilder("534976");
		NextGreaterNumber great = new NextGreaterNumber();
		great.nextNum(num);

	}

}
