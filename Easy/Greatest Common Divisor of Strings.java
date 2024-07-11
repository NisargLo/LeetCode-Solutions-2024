class Solution {
     public String gcdOfStrings(String str1, String str2) {
          if (str1.length() < str2.length()) {
               return gcdOfStrings(str2, str1);
          }
          if (!str1.startsWith(str2)) {
               return "";
          }
          if (str2.isEmpty()) {
               return str1;
          }
          return gcdOfStrings(str1.substring(str2.length()), str2);
     }
}


/* 
     OR

     class Solution {
          public String gcdOfStrings(String str1, String str2) {
               if (!(str1 + str2).equals(str2 + str1)) {
                    return "";
               }

               int gcdLength = gcd(str1.length(), str2.length());
               return str1.substring(0, gcdLength);
          }

          private int gcd(int a, int b) {
               while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
               }
               return a;a
          }
     }
*/