class Solution {
     public void reverseString(char[] s) {
          int low = 0, high = s.length - 1;
          char temp;
          for (;low < high; low++, high--) {
               temp = s[low];
               s[low] = s[high];
               s[high] = temp;
          }
     }
}