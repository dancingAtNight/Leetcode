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
        return helper(root);
       
    }
    private List<List<Integer>> helper(TreeNode root){
        List<List<Integer>> res = new LinkedList<>();
        
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
        List<Integer> curr = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode currNode = queue.poll();
                curr.add(currNode.val);
                
                if(currNode.left != null) queue.offer(currNode.left);
                if(currNode.right != null) queue.offer(currNode.right);
            
            }
            res.add(0, new ArrayList<>(curr));
            
        
        }
        return res;
    }
}