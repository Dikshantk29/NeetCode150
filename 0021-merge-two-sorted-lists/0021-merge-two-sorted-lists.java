
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode left = list1;
        ListNode right = list2;

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (left != null && right != null) {

            if (left.val < right.val) {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            } else {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }

        if (left != null) {
            temp.next = left;
        } else {
            temp.next = right;
        }

        return dummy.next;
    }
}
