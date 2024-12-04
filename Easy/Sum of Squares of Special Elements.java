class Solution {
     public int sumOfSquares(int[] nums) {
          int ans = 0, i;
          int l = nums.length;
          for (i = 0; i < l; i++) {
               if (l % (i + 1) == 0) {
                    ans += Math.pow(nums[i], 2);
               }
          }
          return ans;
     }
}