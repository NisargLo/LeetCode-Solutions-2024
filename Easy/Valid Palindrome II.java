public class Solution {
     public boolean validPalindrome(String s) {
          if (s.equals(" ")) {
               return true;
          }
          boolean b = true;
          String s1 = new String(s);
          int start, end, start1, end1;
          byte i;
          for (start = 0, end = s.length() - 1; start <= (s.length() / 2); start++, end--) {
               if (s.charAt(start) != s.charAt(end)) {
                    for (i = 0; i < s.length(); i++) {
                         String c = new String(s.charAt(i) + "");
                         s = s1.replaceAll(c, "");
                         for (start1 = 0, end1 = s.length() - 1; start1 <= (s.length() / 2); start1++, end1--) {
                              if (s.charAt(start1) != s.charAt(end1)) {
                                   b = false;
                              }
                         }
                         if (b == false && i == s1.length()) {
                              return false;
                         } else {
                              return true;
                         }
                    }
               }
          }
          return true;
     }
}