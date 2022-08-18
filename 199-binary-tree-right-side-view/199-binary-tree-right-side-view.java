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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return res;
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int size =queue.size();
           TreeNode last = queue.peek();
            for(int i = 0; i < size; i++){
                TreeNode curr = queue.poll();
                if(curr.right!= null) queue.offer(curr.right);
                if(curr.left!= null ) queue.offer(curr.left);
                

            }
            res.add(last.val);
            
            
        }
        return res;
        
    }
}