package com.anil.exercise;

public class BooleanMatrix {
	
	public void matrix(int[][] ar) {
		
		boolean first_row = false;
		boolean first_col = false;
		
		for(int i=0 ; i<ar.length ; i++) {
			for(int j=0 ; j<ar[0].length ; j++) {
				if(i == 0 && ar[i][j] == 1) {
					first_row = true;
				}
				
				if(j == 0 && ar[i][j] == 1) {
					first_col = true;
				}
				
				if(ar[i][j] == 1) {
					ar[0][j] = 1;
					ar[i][0] = 1;
				}
			}
		}
		
		for(int i=1 ; i<ar.length ; i++) {
			for(int j=1 ; j<ar[0].length ; j++) {
				if(ar[0][j] == 1 || ar[i][0] == 1) {
					ar[i][j] = 1;
				}
			}
		}
		
		if(first_row) {
			for(int i=0 ; i<ar[0].length ; i++) {
				ar[0][i] = 1;
			}
		}
		
		if(first_col) {
			for(int i=0 ; i<ar.length ; i++) {
				ar[i][0] = 1;
			}
		}
		
		
		for(int i=0 ; i<ar.length ; i++) {
			for(int j=0 ; j<ar[0].length ; j++) {
				System.out.print(ar[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		int mat[][] = {{1, 0, 0, 1}, 
                {0, 0, 1, 0}, 
                {0, 0, 0, 0}}; 
		BooleanMatrix boolMat = new BooleanMatrix();
		boolMat.matrix(mat);

	}

}
