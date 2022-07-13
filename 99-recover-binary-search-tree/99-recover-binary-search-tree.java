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
    TreeNode first = null, second = null;
    TreeNode prev = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        inorderTraverse(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    
    }
    void inorderTraverse(TreeNode root){
        if(root == null){
            return; 
        }
        inorderTraverse(root.left);
        if(root.val < prev.val){
        if(first == null){
            first = prev;
        }
         
            second = root;
        }
       
        prev = root;
        inorderTraverse(root.right);
    }
}