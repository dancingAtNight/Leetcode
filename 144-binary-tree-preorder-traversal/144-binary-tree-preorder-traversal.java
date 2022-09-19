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
    LinkedList<Integer> ans = new LinkedList<>();
    
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return ans;
        helper(root);
        return ans;
   
        
       
       
    }
    private void helper(TreeNode root){
        if(root == null) return;
        ans.add(root.val);
        helper(root.left);
        helper(root.right);

    }
    
    
}