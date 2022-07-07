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
    public int maxDia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        traverse(root);
        return maxDia;
        
    }
    private void traverse(TreeNode root){
        if(root == null) return;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        int maxCurr = left + right;
        maxDia = Math.max(maxCurr, maxDia);
        traverse(root.left);
        traverse(root.right);
        
        
    }
    private int maxDepth(TreeNode root){
        if(root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}