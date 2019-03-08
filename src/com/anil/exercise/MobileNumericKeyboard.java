package com.anil.exercise;

public class MobileNumericKeyboard {
	
	private char keyboard[][] = {{'1','2','3'}, 
            {'4','5','6'}, 
            {'7','8','9'}, 
            {'*', '0', '#'}};
	
	private int[] x = {0,0,0,1,-1};
	private int[] y = {0,1,-1,0,0};
	
	public int getCountUtil(int n, int r, int c) {
		if(n <= 0) return 0;
		if(n == 1) return 1;
		
		int count = 0;
		for(int i=0 ; i<5 ; i++) {
			int ro = r+x[i];
			int co = c+y[i];
			
			if(ro>=0 && ro<4 && co >=0 && co<3 && keyboard[ro][co] != '*' && keyboard[ro][co] != '#') {
				count += getCountUtil(n-1, ro, co);
			}
		}
		return count;
	}
	
	public void getCount(int n) {
		if(n == 1) {
			System.out.println(10);
			return;
		}
		int count = 0;
		for(int i=0 ; i<4 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				if(keyboard[i][j] != '*' && keyboard[i][j] != '#') {
					count += getCountUtil(n, i, j);
					System.out.println("Count of nums from : "+keyboard[i][j]+"  are : "+count);
				}
			}
		}
		
		System.out.println("Total digits possible are : "+count);
	}

	public static void main(String[] args) {
		int n = 2;
		MobileNumericKeyboard numKeyboard = new MobileNumericKeyboard();
		numKeyboard.getCount(n);

	}

}
