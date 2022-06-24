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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(root, targetSum, curr, res);
        return res;
    }
    private static void helper(TreeNode root, int sum, List<Integer> currPath, List<List<Integer>> allPath){
        
        if(root == null) return;
        currPath.add(root.val);
        if(root.val == sum && root.left == null&& root.right == null){
            allPath.add(new ArrayList<>(currPath));
        }else{
            helper(root.left, sum - root.val, currPath, allPath);
            helper(root.right, sum - root.val, currPath, allPath);
        }
        
        currPath.remove(currPath.size() -1);
    }
}