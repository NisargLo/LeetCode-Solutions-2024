class Solution {
     public int maxProductDifference(int[] nums) {
          int small1 = Integer.MAX_VALUE, small2 = Integer.MAX_VALUE, big1 = Integer.MIN_VALUE,
                    big2 = Integer.MIN_VALUE;
          int index_of_small = 0, index_of_big = 0, i;
          int l = nums.length;
          for (i = 0; i < l; i++) {
               if (nums[i] < small1) {
                    small1 = nums[i];
                    index_of_small = i;
               }
          }
          for (i = 0; i < l; i++) {
               if (nums[i] < small2 && i != index_of_small) {
                    small2 = nums[i];
               }
          }
          for (i = 0; i < l; i++) {
               if (nums[i] > big1) {
                    big1 = nums[i];
                    index_of_big = i;
               }
          }
          for (i = 0; i < l; i++) {
               if (nums[i] > big2 && i != index_of_big) {
                    big2 = nums[i];
               }
          }
          return (big1 * big2) - (small1 * small2);
     }
}