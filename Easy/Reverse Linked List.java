class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode nextNode;
        ListNode current = head;
        while (current != null) {
            nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        return previous;
    }
}