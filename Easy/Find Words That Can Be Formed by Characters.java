class Solution {
     public int countCharacters(String[] words, String chars) {
          short c = 0;
          for (int i = 0; i < words.length; i++) {
               String temp = chars;
               boolean canFormWord = true;
               for (int j = 0; j < words[i].length(); j++) {
                    char currentChar = words[i].charAt(j);
                    int index = temp.indexOf(currentChar);
                    if (index != -1) {
                         temp = temp.substring(0, index) + temp.substring(index + 1);
                    } 
                    else {
                         canFormWord = false;
                         break;
                    }
               }
               if (canFormWord) {
                    c += words[i].length();
               }
          }
          return c;
     }
}