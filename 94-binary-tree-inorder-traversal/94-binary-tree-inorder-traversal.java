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
    public List<Integer> res = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        helper(root);
        return res;
        
        
    }
    public void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        res.add(root.val);
        helper(root.right);
    }
}