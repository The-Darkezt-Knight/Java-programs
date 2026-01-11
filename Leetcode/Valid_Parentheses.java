package Leetcode;
import java.util.Stack;

public class Valid_Parentheses {
    public static boolean isValid(String s) {  
        Stack<Character> stack = new Stack<>();
        int length = s.length();

        for(int i = 0;i < length; i++)
        {   
            char ch = s.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{')
            {
                stack.push(s.charAt(i));
                System.out.println(stack);
            }

            if(ch == ')' || ch == ']' || ch == '}')
            {
                if(stack.isEmpty()){return false;}
                char c = stack.pop();
                if(c == '(' && ch != ')'
                 || c == '[' && ch != ']'
                 || c == '{' && ch != '}')
                {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s ="(){}}{";
        System.out.println(isValid(s));
    }
}
