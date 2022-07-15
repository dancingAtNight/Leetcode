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
    int count = 0;
    public int countUnivalSubtrees(TreeNode root) {
        if(root == null) return 0;
        helper(root);
        return count;
    }
    private int helper(TreeNode root){
        int left = root.left == null? root.val: helper(root.left);
        int right = root.right == null? root.val: helper(root.right);
        
        if(left == -1001 || right == -1001){
            return -1001;
        }
        if(left == right && root.val == left){
            count++;
            return root.val;
        }
        return -1001;
    }
}