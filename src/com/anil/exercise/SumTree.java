package com.anil.exercise;

public class SumTree {
	
	public int convertToSumTree(TreeNode root) {
		if(root == null) return 0;
		
		int oldVal = root.data;
		int left = convertToSumTree(root.left);
		int right = convertToSumTree(root.right);
		root.data = left+right;
		return oldVal+root.data;
		
	}
	
	public void printTree(TreeNode root) {
		if(root == null) return ;
		
		printTree(root.left);
		System.out.print(root.data+"   ");
		printTree(root.right);
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10); 
		   
        /* Constructing tree given in the above figure */
        root.left = new TreeNode(-2); 
        root.right = new TreeNode(6); 
        root.left.left = new TreeNode(8); 
        root.left.right = new TreeNode(-4); 
        root.right.left = new TreeNode(7); 
        root.right.right = new TreeNode(5); 
        
        SumTree tree = new SumTree();
        tree.convertToSumTree(root);
        tree.printTree(root);

	}

}
