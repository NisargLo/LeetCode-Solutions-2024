class Solution {
     public int a = 0, b = 1, c;

     public int fib(int n) {
          if (n < 2) {
               return n;
          }
          return fibo(n);
     }

     public int fibo(int n) {
          if (n >= 2) {
               c = a + b;
               a = b;
               b = c;
               fibo(n - 1);
          }
          return c;
     }
}