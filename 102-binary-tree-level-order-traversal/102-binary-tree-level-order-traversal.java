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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
       Queue<TreeNode> stack= new LinkedList<>();
        if(root == null) return res;
        stack.add(root);
        while(!stack.isEmpty()){
            int size = stack.size();
            List<Integer> list = new LinkedList<>();
            for(int i = 0; i < size; i++){
                TreeNode curr = stack.poll();
                list.add(curr.val);
                if(curr.left != null) stack.add(curr.left);
                if(curr.right != null) stack.add(curr.right);
                    
            }
            res.add(list);
        }
        return res;
        
    }
}