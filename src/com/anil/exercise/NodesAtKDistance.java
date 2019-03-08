package com.anil.exercise;

public class NodesAtKDistance {
	
	public void printKdistNodesDown(TreeNode root, int k) {
		if(root == null || k<0) return;
		
		if(k == 0) {
			System.out.print(root.data+"  " );
			return;
		}
		
		printKdistNodesDown(root.left, k-1);
		printKdistNodesDown(root.right, k-1);
	}
	
	public int printNodesAtKdistance(TreeNode root, TreeNode target, int k) {
		if(root == null) return -1;
		if(root.data == target.data) {
			return 0;
		}
		
		int dl = printNodesAtKdistance(root.left, target, k);
		if(dl != -1) {
			if(dl+1 == k) {
				System.out.print(root.data+"  ");
			}
			else {
				printKdistNodesDown(root.right, k-dl-2);
			}
			return 1+dl;
		}
		
		int dr = printNodesAtKdistance(root.right, target, k);
		if(dr != -1) {
			if(dr+1 == k) {
				System.out.print(root.data+"  ");
			}
			else {
				printKdistNodesDown(root.left, k-dr-2);
			}
			return 1+dr;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(20); 
		   
        /* Let us construct the tree shown in above diagram */
        root.left = new TreeNode(8); 
        root.right = new TreeNode(22); 
        root.left.left = new TreeNode(4); 
        root.left.right = new TreeNode(12); 
        root.left.right.left = new TreeNode(10); 
        root.left.right.right = new TreeNode(14); 
        TreeNode target = root.left.right; 
        
        NodesAtKDistance tree = new NodesAtKDistance();
        tree.printNodesAtKdistance(root, target, 2); 

	}

}
