class Solution {
     public boolean isThree(int n) {
          int c = 0;
          for (int i = 2; i <= n / 2; i++) {
               if (n % i == 0) {
                    c++;
               }
          }
          if (c == 1) {
               return true;
          } else {
               return false;
          }
     }
}