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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true;
        while(!queue.isEmpty()){
            List<Integer> currLevel = new LinkedList<>();
            int levelSize = queue.size();
            for(int i = 0; i < levelSize; i++){
                TreeNode curr = queue.poll();
                if(leftToRight)
                    currLevel.add(curr.val);
                else
                    currLevel.add(0, curr.val);
                if(curr.left!= null) queue.add(curr.left);
                if(curr.right!= null) queue.add(curr.right);
                
            }
            res.add(currLevel);
            leftToRight = !leftToRight;
        }
        return res;
    }
}