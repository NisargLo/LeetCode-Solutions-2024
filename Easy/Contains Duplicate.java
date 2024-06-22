import java.util.*;

class Solution {
     public boolean containsDuplicate(int[] nums) {
          Set<Integer> uniqueSet = new HashSet<>();
          boolean is_added;
          for (int n : nums) {
               is_added = uniqueSet.add(n);
               if (!is_added) {
                    return true;
               }
          }
          return false;
     }
}