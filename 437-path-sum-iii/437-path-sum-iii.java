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
    Map<Integer,Integer> preSum = new HashMap<>();
    int pathSum, targetSum;
    int res = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        this.pathSum = 0;
        this.targetSum = targetSum;
        this.preSum.put(0, 1);
        traverse(root);
        return res;
        
    }
    void traverse(TreeNode root){
        if(root == null) return;
        pathSum += root.val;
        res += preSum.getOrDefault(pathSum - targetSum, 0);
        
        preSum.put(pathSum, preSum.getOrDefault(pathSum,0) + 1);
        traverse(root.left);
        traverse(root.right);
        preSum.put(pathSum, preSum.get(pathSum) -1);
        pathSum -= root.val;
    }
}