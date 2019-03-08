package com.anil.exercise;

public class NthMagicNumber {
	
	public void magicNumber(int n) {
		int count = 1;
		int magicNum = 0;
		while(n != 0) {
			if((n&1) != 0) {
				magicNum += Math.pow(5, count);
			}
			count++;
			n = n>>1;
		}
		System.out.println("Nth magic number is : "+magicNum);
	}

	public static void main(String[] args) {
		int n = 5;
		NthMagicNumber num = new NthMagicNumber();
		num.magicNumber(n);

	}

}
