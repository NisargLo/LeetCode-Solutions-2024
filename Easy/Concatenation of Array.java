class Solution {
     public int[] getConcatenation(int[] nums) {
          /*
               Simple :-

               int l = nums.length;
               int[] res = new int[l * 2];
               for (int i = 0; i < l; i++) {
                    res[i] = nums[i];
               }
               for (int i = 0; i < l; i++) {
                    res[i + l] = nums[i];
               }
               return res;
          */


          // Quick :-

          int l = nums.length;
          int[] res = new int[l*2];
          System.arraycopy(nums,0,res,0,l);
          System.arraycopy(nums,0,res,l,l);
          return res;
     }
}