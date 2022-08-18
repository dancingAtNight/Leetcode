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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new LinkedList<>();
        Queue<TreeNode> queue= new LinkedList<>();
        if(root == null) return res;
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            Double sum = 0.0;
            for(int i = 0; i < size; i++){
                TreeNode curr = queue.poll();
                sum += curr.val;
                if(curr.left != null) queue.offer(curr.left);
                if(curr.right != null) queue.offer(curr.right);
                

            }
            res.add(sum / size);

        }
        return res;
        
    }
}