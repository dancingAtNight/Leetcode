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
    public int closestValue(TreeNode root, double target) {
        List<Integer> curr = new ArrayList<>();
        helper(root, curr);
        int tar = 0;
     
        
        double diff = Double.MAX_VALUE;
        
        for(int i = 0; i < curr.size(); i++){
            if(Math.abs(target - (double)curr.get(i)) < diff){
                diff = Math.abs(target -(double) curr.get(i));
                 tar = curr.get(i);
            }
            
        }
        return tar;     
        
    }
    private void helper(TreeNode root, List<Integer> list){
        if(root == null) return;
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    
       }
}