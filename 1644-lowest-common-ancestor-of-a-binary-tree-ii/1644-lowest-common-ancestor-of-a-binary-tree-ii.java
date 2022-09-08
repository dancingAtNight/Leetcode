/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode res = lca(root, p, q);
        if(foundp && foundq){
            return res;
        }
        return null;
    }
    boolean foundp = false, foundq = false;
    TreeNode lca(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return null;
        TreeNode left = lca(root.left, p,q);
        TreeNode right = lca(root.right, p,q);
        if(root == p || root == q){
            if(root == p) foundp = true;
            if(root == q) foundq = true;
            return root;
        }
        if(left != null && right != null) {
            return root;
        }
        if(left == null && right == null) {
            return null;
        }
        return left == null? right: left;
    }
}