import java.util.Stack;

class Solution {
     public int evalRPN(String[] tokens) {
          Stack<Integer> stack = new Stack<>();
          for (String token : tokens) {
               if (isOperator(token)) {
                    int operand_2 = stack.pop();
                    int operand_1 = stack.pop();
                    int result = performOperation(operand_1, operand_2, token.charAt(0));
                    stack.push(result);
               } else {
                    stack.push(Integer.parseInt(token));
               }
          }
          return stack.pop();
     }

     private boolean isOperator(String token) {
          return token.length() == 1 && "+-*/".contains(token);
     }

     private int performOperation(int operand_1, int operand_2, char operator) {
          switch (operator) {
               case '+':
                    return operand_1 + operand_2;
               case '-':
                    return operand_1 - operand_2;
               case '*':
                    return operand_1 * operand_2;
               case '/':
                    return operand_1 / operand_2;
               default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
          }
     }
}