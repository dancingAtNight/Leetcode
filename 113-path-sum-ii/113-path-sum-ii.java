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
        List< List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        allPath(root, targetSum, curr, res);
        return res;
        
    }
    private static void allPath(TreeNode root, int target, List<Integer> currPath, List<List<Integer>> allPath){
        if(root == null) return;
        currPath.add(root.val);
        
        if(root.val == target && root.left == null && root.right == null) 
        {allPath.add(new ArrayList<>(currPath));
        }else{
            allPath(root.left, target- root.val, currPath, allPath);
            allPath(root.right, target- root.val, currPath, allPath);
        }
        
        currPath.remove(currPath.size() -1);
       
        
    }
}