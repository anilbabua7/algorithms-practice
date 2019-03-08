package com.anil.exercise;

public class AllPossibleWordsFromPhone {
	
	String[] keypad = {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
	
	public void printAllWords(int[] nums, int pos, char[] res) {
		if(pos == nums.length) {
			System.out.print(res);
			System.out.print("   ");
			return;
		}
		
		for(int i=0 ; i<keypad[nums[pos]].length() ; i++) {
			res[pos] = keypad[nums[pos]].charAt(i);
			printAllWords(nums, pos+1, res);
		}
	}

	public static void main(String[] args) {
		int[] nums = {2,3,4};
		char[] res = new char[nums.length];
		AllPossibleWordsFromPhone words = new AllPossibleWordsFromPhone();
		words.printAllWords(nums, 0, res);

	}

}
