package com.anil.exercise;

public class DiameterOfTree {
	
	public int height(TreeNode root) {
		if(root == null) return 0;
		int left = 1+height(root.left);
		int right = 1+height(root.right);
		return Math.max(left, right);
	}
	
	public int diameter(TreeNode root) {
		if(root == null) return 0;
		int left = height(root.left);
		int right = height(root.right);
		
		return Math.max(left+right+1, Math.max(diameter(root.left),diameter(root.right)));
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1); 
        root.left = new TreeNode(2); 
        root.right = new TreeNode(3); 
        root.left.left = new TreeNode(4); 
        root.left.right = new TreeNode(5); 
        
        DiameterOfTree tree = new DiameterOfTree();
        int ans = tree.diameter(root);
        System.out.println("Diameter of given tree is : "+ans);

	}

}
