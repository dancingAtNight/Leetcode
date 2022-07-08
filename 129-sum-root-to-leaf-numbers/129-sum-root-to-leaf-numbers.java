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
   StringBuilder path = new StringBuilder();
    int res  = 0;
    public int sumNumbers(TreeNode root) {
       traverse(root);
        return res;
        
    }
    void traverse(TreeNode root){
        if(root == null) return;
        path.append(root.val);
        if(root.left == null && root.right == null) {
            res += Integer.parseInt(path.toString());      
        }
    
    traverse(root.left);
    traverse(root.right);
    path.deleteCharAt(path.length() -1);
}
}