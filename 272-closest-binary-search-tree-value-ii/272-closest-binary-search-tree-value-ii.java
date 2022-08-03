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
    public void inorder(TreeNode root, List<Integer> list, Queue<Integer> heap, int k){
        if(root == null) return;
        inorder(root.left, list, heap, k);
        heap.add(root.val);
        if(heap.size() > k){
            heap.poll();
        }
      inorder(root.right, list, heap, k);
}

    public List<Integer> closestKValues(TreeNode root, double target, int k) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> heap = new PriorityQueue<>((a, b) -> Math.abs(a - target) > Math.abs(b-target) ? -1: 1);
        inorder(root, list, heap, k);
        
        return new ArrayList<>(heap);
        
    }
}