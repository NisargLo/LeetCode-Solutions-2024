class Solution {
     public int fib(int n) {
          double phi = (1 + Math.sqrt(5)) / 2;
          return (int)(Math.round((Math.pow(phi, n) - Math.pow(1 - phi, n)) / Math.sqrt(5)));
     }

     
     // OR

     // public int a = 0, b = 1, c;

     // public int fib(int n) {
     //      if (n < 2) {
     //           return n;
     //      }
     //      return fibo(n);
     // }

     // private int fibo(int n) {
     //      if (n >= 2) {
     //           c = a + b;
     //           a = b;
     //           b = c;
     //           fibo(n - 1);
     //      }
     //      return c;
     // }
}