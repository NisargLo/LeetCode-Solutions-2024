class Solution {
     public String complexNumberMultiply(String num1, String num2) {
          String[] one = num1.split("\\+");
          String[] two = num2.split("\\+");
          byte a = Byte.parseByte(one[0]);
          byte b = Byte.parseByte(one[1].replace("i", ""));
          byte c = Byte.parseByte(two[0]);
          byte d = Byte.parseByte(two[1].replace("i", ""));
          return (a * c - b * d) + "+" + (a * d + b * c) + "i";
     }
}