package LeetCode;

public class ExpressionEvauator {
    public static void main(String[] args) {
        System.out.println(evaluateExpression("1 + 2 * 3"));
    }

    private static int evaluateExpression(String s) {
        int result = 0;
        int num = 0;
        char sign = '+';
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + ch - '0';
            }
            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {
                if (sign == '+') {
                    result += num;
                } else if (sign == '-') {
                    result -= num;
                } else if (sign == '*') {
                    result *= num;
                } else if (sign == '/') {
                    result /= num;
                }
                sign = ch;
                num = 0;
            }
        }
        return result;
    }
}
