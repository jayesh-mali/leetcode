/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int leftHeight = leftHeight(root.left)+1;
        int rightHeight = rightHeight(root.right)+1;
        if(leftHeight == rightHeight)
            return (int)Math.pow(2, leftHeight)-1;            
        
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
    
    private int leftHeight(TreeNode root){
        if(root == null) return 0;
        return leftHeight(root.left)+1;
    }
    
    private int rightHeight(TreeNode root){
        if(root == null) return 0;
        return rightHeight(root.right)+1;
    }
}

/*
h:1 => atMost: 2^0 => 1
h:2 => atMost: 2^0+2^1 => 3
h:3 => atMost: 2^0+2^1+2^2 => 7 => 2^h-1

        1
    2       3
 4     5  6    7  
 
 
 (2^h-1) - 1
 
         1
    2       3
 4     5  6     




*/