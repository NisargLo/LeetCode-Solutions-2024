import java.util.*;

class Solution {
     public List<Integer> findDuplicates(int[] nums) {
          Set<Integer> uniqueSet = new HashSet<>();
          List<Integer> l = new ArrayList<>();
          boolean is_added;
          for (int n : nums) {
               is_added = uniqueSet.add(n);
               if (!is_added) {
                    l.add(n);
               }
          }
          return l;
     }
}