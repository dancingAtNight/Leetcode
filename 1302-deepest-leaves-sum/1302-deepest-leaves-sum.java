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
    public int deepestLeavesSum(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSum = 0;
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode  currNode = queue.poll();
                levelSum += currNode.val;
                if(currNode.left != null) queue.offer(currNode.left);
                if(currNode.right!= null) queue.offer(currNode.right);
            }
            res.add(0,  levelSum);
        }
    
        return res.get(0);
}
}