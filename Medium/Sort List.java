import java.util.*;

class Solution {
     public ListNode sortList(ListNode head) {
          if (head == null || head.next == null) {
               return head;
          }

          List<ListNode> nodes = new ArrayList<>();
          ListNode current = head;

          while (current != null) {
               nodes.add(current);
               current = current.next;
          }

          Collections.sort(nodes, new Comparator<ListNode>() {
               @Override
               public int compare(ListNode o1, ListNode o2) {
                    return Integer.compare(o1.val, o2.val);
               }
          });

          ListNode sortedHead = nodes.get(0);
          current = sortedHead;

          for (int i = 1; i < nodes.size(); i++) {
               current.next = nodes.get(i);
               current = current.next;
          }
          current.next = null;
          return sortedHead;
     }
}
