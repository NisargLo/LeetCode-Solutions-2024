class Solution {
     public int getSum(int a, int b) {
          int c;
          while (b != 0) {
               c = (a & b) << 1;
               a = a ^ b;
               b = c;
          }
          return a;
     }
}