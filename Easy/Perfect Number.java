class Solution {
     public boolean checkPerfectNumber(int num) {
          int c = 0;
          for (int i = 1; i < num - 1; i++) {
               if (num % i == 0)
                    c += i;
          }
          return c == num;

          /*   faster...
          
               return (num == 6 || num == 28 || num == 496 || num == 8128 || num == 33550336);
          */
     }
}