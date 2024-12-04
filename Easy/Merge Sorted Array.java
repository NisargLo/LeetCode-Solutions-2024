class Solution {
     public void merge(int[] nums1, int m, int[] nums2, int n) {
          for (int i = nums1.length - n; i < nums1.length; i++) {
               nums1[i] = nums2[i + n - nums1.length];
          }
          Arrays.sort(nums1);
     }
}