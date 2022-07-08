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
     PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {return b - a;});
    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return queue.poll();
    
    }
    private void helper(TreeNode root, int k){
        if(root == null) return ;
        queue.offer(root.val);
        if(queue.size() > k){
        queue.poll();
        }
        
        helper(root.left, k);
        helper(root.right, k);
    }
}