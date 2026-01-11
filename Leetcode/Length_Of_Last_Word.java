package Leetcode;
public class Length_Of_Last_Word {
    public static int lengthOfLastWord(String s) {
        String[] strings = s.trim().split(" ");
        int last_object = strings.length - 1;

        return strings[last_object].length();
    }
    public static void main(String[] args) {
        String s = " tea body mean ambulance syndicate syndrome ";
        System.out.println(lengthOfLastWord(s));
    }
}
