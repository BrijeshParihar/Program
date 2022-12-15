package string;

import java.util.Stack;

public class LongestParenthesis {
    public static void main(String[] args) {
        String str = "(()";
        int n = str.length();

        // Create a stack and push -1
        // as initial index to it.
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);

        // Initialize result
        int result = 0;

        // Traverse all characters of given string
        for (int i = 0; i < n; i++)
        {
            // If opening bracket, push index of it
            if (str.charAt(i) == '(')
                stk.push(i);//0,

                // // If closing bracket, i.e.,str[i] = ')'
            else
            {
                // Pop the previous
                // opening bracket's index
                if(!stk.empty())
                    stk.pop();

                // Check if this length
                // formed with base of
                // current valid substring
                // is more than max
                // so far
                if (!stk.empty())
                    result
                            = Math.max(result,
                            i - stk.peek());

                    // If stack is empty. push
                    // current index as base
                    // for next valid substring (if any)
                else
                    stk.push(i);
            }
        }

        System.out.println(result);

    }
}
