import java.util.*;

class Solution {
     public int findDuplicate(int[] nums) {
          Set<Integer> uniqueSet = new HashSet<>();
          for (int num : nums) {
               if (!uniqueSet.add(num)) {
                    return num;
               }
          }
          return 0;
     }
}