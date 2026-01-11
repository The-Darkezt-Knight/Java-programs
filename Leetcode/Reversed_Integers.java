package Leetcode;
import java.util.Arrays;

public class Reversed_Integers {
    public static int[] digitize(long n) {

        String numStr = String.valueOf(n);
        int len = numStr.length();
        int[] result = new int[len];
        
        for (int i = 0; i < len; i++) {
            result[i] = numStr.charAt(len - 1 - i) - '0';
        }
        return result;
    }

    public static int[] reverse(long n)
    {
        return new StringBuilder().append(n)
                            .reverse().
                            chars().
                            map(Character::getNumericValue).
                            toArray();
    }
    
    public static void main(String[] args) {
        long n = 123456789;
        System.out.println(Arrays.toString(digitize(n)));
    }
}