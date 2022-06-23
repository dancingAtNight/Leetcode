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
    public int maxLevelSum(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int maxLevel= 0;
        int level = 0;
        int maxSum = Integer.MIN_VALUE;
        while(!queue.isEmpty()){
            level++;
            int size = queue.size();
            int sum = 0;
            for(int i = 0; i < size; i++){
                TreeNode currNode = queue.poll();
                sum += currNode.val;
                if(currNode.left != null) queue.offer(currNode.left);
                if(currNode.right != null) queue.offer(currNode.right);
                
            }
            if(sum > maxSum){
                maxSum = sum;
                maxLevel = level;
                
            }
        }
            return maxLevel;

        
        }
        
    
}