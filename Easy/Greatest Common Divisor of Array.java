class Solution {
     public int findGCD(int[] nums) {
          int s = nums[0], gcd = 0;
          int l = nums[0];
          for (int i : nums) {
               s = Math.min(i, s);
               l = Math.max(i, l);
          }
          for (int i = 1; i <= s; i++) {
               if (s % i == 0 && l % i == 0) {
                    gcd = i;
               }
          }
          return gcd;
     }
}