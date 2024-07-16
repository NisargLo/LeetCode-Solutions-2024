import java.math.*;

class Solution {
     public String multiply(String num1, String num2) {
          BigInteger bi1 = new BigInteger(num1);
          BigInteger bi2 = new BigInteger(num2);
          bi1 = bi1.multiply(bi2);
          return bi1 + "";
     }
}