class Solution {
     public int averageValue(int[] nums) {
          int i, j, c = 1;
          int s;
          for (i = 0; i < nums.length; i++) {
               if (nums[i] % 6 == 0) {
                    s = nums[i];
                    for (j = i + 1; j < nums.length; j++) {
                         if (nums[j] % 6 == 0) {
                              s = s + nums[j];
                              c++;
                         }
                    }
                    return s / c;
               }
          }
          return 0;
     }
}