class Solution {
     public boolean judgeSquareSum(int c) {
          double i = 0, sum;
          double j = Math.ceil(Math.sqrt(c));
          while (i <= j) {
               sum = (i * i) + (j * j);
               if (sum < c) {
                    i++;
               } else if (sum > c) {
                    j--;
               } else {
                    return true;
               }
          }
          return false;
     }
}