import java.math.BigInteger;

class Solution {
     public int[] plusOne(int[] digits) {
          /*
          Simple Way :-

          String str = "";
          for (int i = 0; i < digits.length; i++) {
               str += digits[i] + "";
          }
          BigInteger one = new BigInteger("1");
          BigInteger result = new BigInteger(str).add(one);
          String numStr = result.toString();
          int[] digit = new int[numStr.length()];
          for (int i = 0; i < numStr.length(); i++) {
               digit[i] = Integer.parseInt(numStr.charAt(i) + "");
          }
          return digit;
          */

          // Faster Way :-
          for (int i = digits.length - 1; i >= 0; i--) {
               if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
               }
               digits[i] = 0;
          }
          digits = new int[digits.length + 1];
          digits[0] = 1;
          return digits;
     }
}