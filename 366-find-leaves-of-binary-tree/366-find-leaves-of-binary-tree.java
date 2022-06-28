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
   private List<Pair<Integer, Integer>> pairs;
    private int getHeight(TreeNode root){
    if(root == null) return -1;
    int leftHeight = getHeight(root.left);
    int rightHeight = getHeight(root.right);
        
    int currHeight = Math.max(leftHeight, rightHeight) + 1;
        
    this.pairs.add(new Pair<Integer, Integer> (currHeight,root.val));
        return currHeight;
    
    }
    public List<List<Integer>> findLeaves(TreeNode root){
        this.pairs = new ArrayList<>();
        getHeight(root);
        Collections.sort(this.pairs, Comparator.comparing(p-> p.getKey()));
        int n = this.pairs.size(), height= 0, i= 0;
        List<List<Integer>> solution = new ArrayList<>();
        while(i < n){
            List<Integer> nums = new ArrayList<>();
            while(i < n && this.pairs.get(i).getKey() == height){
                nums.add(this.pairs.get(i).getValue());
                i++;
            }
            solution.add(nums);
            height++;
        }   
        return solution;
}
}