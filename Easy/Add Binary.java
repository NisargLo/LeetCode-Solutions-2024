class Solution {
     public String addBinary(String a, String b) {
          StringBuilder str = new StringBuilder();
          int c = 0;
          int i = a.length() - 1;
          int j = b.length() - 1;
          while (i >= 0 || j >= 0 || c != 0) {
               int s = c;
               if (i >= 0) {
                    s += Integer.parseInt(a.charAt(i--) + "");
               }
               if (j >= 0) {
                    s += Integer.parseInt(b.charAt(j--) + "");
               }
               str.insert(0, s % 2);
               c = s / 2;
          }
          return str + "";
     }
}