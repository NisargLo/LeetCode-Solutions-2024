class Solution {
     public int minOperations(int[] nums) {
          int res = 0, c = 0;
          for (int i = 0; i < nums.length - 1; i++) {
               if (nums[i] > nums[i + 1] || nums[i] == nums[i + 1]) {
                    c = (nums[i] + 1) - nums[i + 1];
                    nums[i + 1] = nums[i] + 1;
                    res += c;
               }
          }
          return res;
     }
}