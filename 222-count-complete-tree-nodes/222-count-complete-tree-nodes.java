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
         if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        int count  = 0;
        queue.offer(root);
        while(!queue.isEmpty()){
            count++;
         TreeNode curr = queue.poll();
            if(curr.left != null) queue.offer(curr.left);
            if(curr.right != null) queue.offer(curr.right);
            
        }
        return count;
        
       
        
    }
}