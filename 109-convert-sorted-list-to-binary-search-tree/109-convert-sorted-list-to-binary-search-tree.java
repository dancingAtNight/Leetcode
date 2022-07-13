/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
   
    public TreeNode sortedListToBST(ListNode head) {
        return build(head, null);

    }
    TreeNode build(ListNode left, ListNode right){
        if(left == right) return null;
        ListNode mid = getMid(left,right);
        TreeNode root = new TreeNode(mid.val);
        root.left = build(left, mid);
        root.right = build(mid.next, right);
        return root;
    }

    ListNode getMid(ListNode begin, ListNode end) {
        ListNode slow = begin, fast = begin;
        while (fast != end && fast.next != end) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
