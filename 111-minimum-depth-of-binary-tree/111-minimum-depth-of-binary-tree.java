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
    public int minDepth(TreeNode root) {
      
if(root == null) return 0;
if(root.left == null && root.right == null) return 1;

int miniDepth = 0;
Queue<TreeNode> queue = new LinkedList<>();
queue.offer(root);
while(!queue.isEmpty()){
miniDepth++;
int size = queue.size();
for(int i = 0; i < size; i++){
TreeNode currNode = queue.poll();
if(currNode.left == null && currNode.right == null) return miniDepth;
if(currNode.left != null) queue.offer(currNode.left);
if(currNode.right != null) queue.offer(currNode.right);


}
}

return miniDepth;

}


        
    }
