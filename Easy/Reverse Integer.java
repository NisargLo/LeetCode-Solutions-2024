class Solution {
     int reverse(int x) {
          long s = 0;
          while (x != 0) {
               s = (s * 10) + (x % 10);
               x /= 10;
          }
          if (s < Integer.MIN_VALUE || s > Integer.MAX_VALUE) {
               return 0;
          } else {
               return (int) s;
          }
     }
}