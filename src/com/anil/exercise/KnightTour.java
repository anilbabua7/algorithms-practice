package com.anil.exercise;

import java.util.Arrays;

public class KnightTour {
	
	private int[] x = {2, 1, -1, -2, -2, -1, 1, 2};
	private int[] y = {1, 2, 2, 1, -1, -2, -2, -1}; 
	
	public boolean knightTour(int[][] board, int r, int c, int move) {
		
		if(move == 64) {
			printBoard(board);
			return true;
		}
		
		for(int i=0 ; i<8 ; i++) {
			int ro = r+x[i];
			int co = c+y[i];
			
			if(isValid(ro, co, board)) {
				board[ro][co] = move;
				if(knightTour(board, ro, co, move+1)) return true;
				board[ro][co] = -1;
			}
		}
		return false;
	}
	
	public boolean isValid(int r, int c, int[][] board) {
		return r>=0&&r<8&&c>=0&&c<8&&board[r][c] == -1;
	}
	
	public void printBoard(int[][] board) {
		for(int i=0 ; i<8 ; i++) {
			for(int j=0 ; j<8 ; j++) {
				System.out.print(board[i][j]+"    ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		KnightTour tour = new  KnightTour();
		int[][] board = new int[8][8];
		for(int i=0 ; i<8 ; i++) {
			Arrays.fill(board[i], -1);
		}
		board[0][0] = 0; 
		tour.knightTour(board, 0, 0, 1);
				

	}

}
