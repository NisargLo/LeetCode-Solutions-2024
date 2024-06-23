class Solution {
     public void moveZeroes(int[] nums) {
          int notzero = 0;
          for (int i = 0; i < nums.length; i++) {
               if (nums[i] != 0) {
                    nums[notzero++] = nums[i];
               }
          }
          for (int i = notzero; i < nums.length; i++) {
               nums[i] = 0;
          }
     }
}