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
    public List<Integer> preorderTraversal(TreeNode root) {
    
        List<Integer> res = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) return res;
        stack.add(root);
      while(!stack.empty()){
          TreeNode curr = stack.pop();
          res.add(curr.val);
          
          if(curr.right != null) stack.push(curr.right);
          if(curr.left != null) stack.push(curr.left);
      }
         return res;
        }
       
        
    }
