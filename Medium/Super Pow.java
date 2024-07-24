import java.math.*;

class Solution {
     public int superPow(int a, int[] b) {
          if (a == 1) {
               return 1;
          }
          StringBuilder sb = new StringBuilder();
          for (short i = 0; i < b.length; i++) {
               sb.append(b[i]);
          }
          return (new BigInteger(a + "")).modPow(new BigInteger(sb.toString()), BigInteger.valueOf(1337)).intValue();
     }
}