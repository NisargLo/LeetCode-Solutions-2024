class Solution {
     public boolean lemonadeChange(int[] bills) {
          short five = 0, ten = 0;
          for (int x : bills) {
               if (x == 5) {
                    five++;
               } else if (x == 10) {
                    if (five > 0) {
                         five--;
                         ten++;
                    } else {
                         return false;
                    }
               } else {
                    if (five > 0 && ten > 0) {
                         ten--;
                         five--;
                    } else if (five > 2) {
                         five -= 3;
                    } else {
                         return false;
                    }
               }
          }
          return true;
     }
}