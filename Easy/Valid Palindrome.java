class Solution {
     public boolean isPalindrome(String s) {
          if (s.equals(" ")) {
               return true;
          }
          String s2 = new String(s.replaceAll("[^a-zA-Z0-9]", ""));
          String s1 = new String(s2.toLowerCase());
          if (s1.equals("")) {
               return true;
          }
          int start = 0, end = s1.length() - 1;
          for (; start <= (s1.length() / 2); start++, end--) {
               if (s1.charAt(start) != s1.charAt(end)) {
                    return false;
               }
          }
          return true;
     }
}