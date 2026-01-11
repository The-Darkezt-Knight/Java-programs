package Leetcode;


public class Palindrome {
   public static boolean isPalindrome(int x) {
    StringBuilder sb = new StringBuilder(String.valueOf(x)).reverse();

        if(sb.toString().matches(String.valueOf(x)))
            {
                return true;
            }else{
                return false;
            }
        }
    public static void main(String[] args) {
        System.out.println(
            isPalindrome(1233212)
        );
    }
}