import java.util.Scanner;
import java.util.Stack;

public class BalancedPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first Sting:");
        String str1 = scanner.nextLine();
        System.out.println("str1 = " + str1);
        boolean correct = isBalance(str1);
        if (correct)
            System.out.println("Balanced.....");
        else
            System.out.println("Not Balance.....");


    }

    private static boolean isBalance(String pattern) {
        Stack<Character> stack = new Stack<Character>();
        if (pattern.length() == 1) {
            return true;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (c == '{' ||
                    c == '[' ||
                    c == '(') {
                stack.push(c);
            } else if (c == '}') {
                char lastChar = stack.pop();
                if (lastChar == '[' || lastChar == '(') {
                    return false;
                }

            } else if (c == ']') {
                char lastChar = stack.pop();
                if (lastChar == '{' || lastChar == '(') {
                    return false;
                }

            } else if (c == 'c') {
                char lastChar = stack.pop();
                if (lastChar == '[' || lastChar == '{') {
                    return false;
                }

            } else {
                return false;
            }
        }
        return stack.empty() ? true : false;

    }
}
