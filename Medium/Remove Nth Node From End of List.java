class Solution {
     public ListNode removeNthFromEnd(ListNode head, int n) {
          int l = 0;
          ListNode current = head;
          ListNode prev = null;
          while (current != null) {
               current = current.next;
               l++;
          }
          int i = 0;
          current = head;
          while (i < l - n) {
               prev = current;
               current = current.next;
               i++;
          }
          if (prev == null) {
               head = head.next;
          } else {
               prev.next = current.next;
          }
          return head;
     }
}