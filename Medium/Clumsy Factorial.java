class Solution {
     public int clumsy(int n) {
          if (n <= 4) {
               if (n <= 2) {
                    return n;
               } else if (n == 3) {
                    return 6;
               } else if (n == 4) {
                    return 7;
               }
          } else {
               if (n % 4 == 1 || n % 4 == 2) {
                    return n + 2;
               } else if (n % 4 == 3) {
                    return n - 1;
               } else {
                    return n + 1;
               }
          }
          return 1;
     }
}