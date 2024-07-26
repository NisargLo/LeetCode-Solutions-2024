class Solution {
     public String clearDigits(String s) {
          Stack<Character> st = new Stack<>();
          StringBuilder sb = new StringBuilder("");
          for (byte i = 0; i < s.length(); i++) {
               if (Character.isDigit(s.charAt(i))) {
                    st.pop();
               } else {
                    st.push(s.charAt(i));
               }
          }
          if (st.isEmpty()) {
               return "";
          }
          while (!st.isEmpty()) {
               sb.append(st.pop());
          }
          return sb.reverse().toString();

          
          /*
               StringBuilder ans =  new StringBuilder();
               for (int i = 0; i < s.length(); i++) {
                    if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                         ans.deleteCharAt(ans.length()-1);
                    }
                    else {
                         ans.append(s.charAt(i));
                    }
               }
               return ans.toString();
           */
     }
}