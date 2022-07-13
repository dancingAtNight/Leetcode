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
     public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    // 将闭区间 [left, right] 中的元素转化成 BST，返回根节点
    TreeNode build(int[] nums, int left, int right) {
        if (left > right) {
            // 区间为空
            return null;
        }
        // 构造根节点
        // BST 节点左小右大，中间的元素就是根节点
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        // 递归构建左子树
        root.left = build(nums, left, mid - 1);
        // 递归构造右子树
        root.right = build(nums, mid + 1, right);

        return root;
    }
}