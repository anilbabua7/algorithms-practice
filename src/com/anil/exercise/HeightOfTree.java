package com.anil.exercise;

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data) {
		this.data = data;
	}
}

public class HeightOfTree {
	
	public int height(TreeNode root) {
		if(root == null) return 0;
		
		int left = 1+height(root.left);
		int right = 1+height(root.right);
		
		return Math.max(left, right);
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		HeightOfTree tree = new HeightOfTree();
		int height = tree.height(root);
		System.out.println("Height of the given tree is : "+height);
	}

}
