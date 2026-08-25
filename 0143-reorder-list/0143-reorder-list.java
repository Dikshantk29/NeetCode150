public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // Find the middle
        ListNode mid = findMid(head);

        // Split the list into two halves
        ListNode second = mid.next;
        mid.next = null;

        // Reverse the second half
        ListNode right = reverseLL(second);

        // Merge the two halves alternately
        ListNode left = head;

        while (left != null && right != null) {
            ListNode leftNext = left.next;
            ListNode rightNext = right.next;

            left.next = right;
            right.next = leftNext;

            left = leftNext;
            right = rightNext;
        }
    }

    static ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        // Find the end of the first half
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    static ListNode reverseLL(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}