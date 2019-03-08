package com.anil.exercise;

public class PermutationsOfGivenString {
	
	public void permute(char[] str, int pos) {
		if(pos == str.length) {
			System.out.println(str);
			return;
		}
		
		for(int i=pos ; i<str.length ; i++) {
			swap(str, i, pos);
			permute(str, pos+1);
			swap(str, i, pos);
		}
	}
	
	public void swap(char[] str, int i, int j) {
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;
	}

	public static void main(String[] args) {
		char[] str = {'A', 'B', 'C'};
		PermutationsOfGivenString strPermute = new PermutationsOfGivenString();
		strPermute.permute(str, 0);

	}

}
