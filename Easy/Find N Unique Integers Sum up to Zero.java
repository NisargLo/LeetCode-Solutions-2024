class Solution {
     public int[] sumZero(int n) {
          short g = 1;
          int[] b = new int[n];
          for (int i = 0; i < n / 2; i++) {
               b[i] = g;
               b[n - i - 1] = -g;
               g++;
          }
          return b;
     }
}