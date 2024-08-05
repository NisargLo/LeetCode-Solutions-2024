class Solution {
     public String reverseWords(String s) {
          String[] str = s.trim().split("\\s+");
          StringBuilder sb = new StringBuilder();
          for (short i = (short) (str.length - 1); i > 0; i--) {
               sb.append(str[i] + " ");
          }
          return sb.append(str[0]).toString();
     }
}