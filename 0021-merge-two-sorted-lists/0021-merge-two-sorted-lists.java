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
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode left = list1;
        ListNode right = list2;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (left != null && right != null) {

            if (left.val <= right.val) {
                temp.next = left;
                temp = temp.next;
                left = left.next;
            } else {
                temp.next = right;
                temp = temp.next;
                right = right.next;
            }
        }

            temp.next = (left != null) ? left : right;
        
        return dummy.next;

    }
}