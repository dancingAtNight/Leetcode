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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return res;
        queue.offer(root);
        
        
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new LinkedList<>();
            for(int i = 0; i < size; i++){
                TreeNode curr = queue.poll();
                list.add(curr.val);
                if(curr.left != null) queue.offer(curr.left);
                if(curr.right != null) queue.offer(curr.right);
                
            }
            res.add(0, new LinkedList<>(list) );
            
        }
        return res;
        
        
    }
}