/* Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.

Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().

 

Example 1:

Input: s = "1 + 1"
Output: 2
Example 2:

Input: s = " 2-1 + 2 "
Output: 3
Example 3:

Input: s = "(1+(4+5+2)-3)+(6+8)"
Output: 23 */





import java.util.Stack;

class Solution {
    public int calculate(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();

        int number = 0;
        int result = 0;
        int sign = 1;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            } 
            else if (ch == '+') {
                result += number * sign;
                number = 0;
                sign = 1;
            } 
            else if (ch == '-') {
                result += number * sign;
                number = 0;
                sign = -1;
            } 
            else if (ch == '(') {
                st.push(result);
                st.push(sign);

                result = 0;
                sign = 1;
            } 
            else if (ch == ')') {
                result += number * sign;
                number = 0;

                int prevSign = st.pop();
                int prevResult = st.pop();

                result = prevResult + prevSign * result;
            }
        }

        // add remaining number
        result += number * sign;

        return result;
    }
}
