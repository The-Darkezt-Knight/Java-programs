package Leetcode;
public class Deconstructor {
    public static String expandedForm(int num) {
        String digits = String.valueOf(num);
        StringBuilder result = new StringBuilder();
        int length = digits.length();

        for (int i = 0; i < length; i++) {
            int digit = digits.charAt(i) - '0';
            if (digit != 0) {
                if (result.length() > 0) {
                    result.append(" + ");
                }
                result.append(digit);
                for (int j = 0; j < length - i - 1; j++) {
                    result.append("0");
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(expandedForm(12));     // "10 + 2"
        System.out.println(expandedForm(45));     // "40 + 5"
        System.out.println(expandedForm(70304));  // "70000 + 300 + 4"
    }
}
