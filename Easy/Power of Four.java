class Solution {
     public boolean isPowerOfFour(int n) {
          byte i;
          if (n <= 0) {
               return false;
          }
          for (i = 0; Math.pow(4, i) <= n; i++) {
               if (n == Math.pow(4, i)) {
                    return true;
               }
          }
          return false;
     }
}