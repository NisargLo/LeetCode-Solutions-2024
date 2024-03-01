class Solution {
     public boolean isPerfectSquare(int num) {
          if (Math.sqrt(num) > Math.floor(Math.sqrt(num))) {
               return false;
          }
          return true;
     }
}