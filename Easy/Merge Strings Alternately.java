class Solution {
     public String mergeAlternately(String word1, String word2) {
          String s = "";
          int a = 0, b = 0;
          for (int i = 0; i < word1.length() || i < word2.length(); i++) {
               if (i < word1.length()) {
                    s += word1.charAt(a++);
               }
               if (i < word2.length()) {
                    s += word2.charAt(b++);
               }
          }
          return s;
     }
}