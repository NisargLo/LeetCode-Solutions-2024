class Solution {
     public int myAtoi(String s) {
          s = s.trim();
          int digit, result = 0, sign = 1, index = 0;
          if (s.length() == 0) {
               return 0;
          }
          String str = new String("");
          if (s.charAt(0) == '-' || s.charAt(0) == '+') {
               sign = (s.charAt(index) == '+' ? 1 : -1);
               index++;
          }
          while (index < s.length()) {
               if (Character.isDigit(s.charAt(index)) == false) {
                    break;
               }
               digit = Integer.parseInt(s.charAt(index) + "");
               if (result > (Integer.MAX_VALUE - digit) / 10) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
               }
               result = (result * 10) + digit;
               index++;
          }
          return result * sign;
     }
}