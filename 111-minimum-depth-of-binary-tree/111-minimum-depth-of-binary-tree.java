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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int mini = 0;
        while(!queue.isEmpty()){
            mini++;
            int size = queue.size();
            for(int i = 0; i < size; i++){
               
                TreeNode curr = queue.poll();
                if(curr.left == null && curr.right == null) return mini;
                
                if(curr.left!= null) queue.offer(curr.left);
                if(curr.right != null) queue.offer(curr.right);
            
            
            }
        }
        return mini;
        
    }
}