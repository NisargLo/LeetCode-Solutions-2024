class Solution {
     public int tribonacci(int n) {
          if (n == 0)
               return 0;
          if (n == 1)
               return 1;
          if (n == 2)
               return 1;
          int a = 0, b = 1, c = 1, d = 0;
          for (short i = 3; i <= n; i++) {
               d = a + b + c;
               a = b;
               b = c;
               c = d;
          }
          return d;
     }
}