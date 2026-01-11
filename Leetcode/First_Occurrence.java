package Leetcode;
class First_Occurence
{
    public int strStr(String haystack, String needle) {
        int result = (haystack.contains(needle))? haystack.indexOf(needle) :  -1;
        return result;
    }
    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "leeto";
        First_Occurence obj = new First_Occurence();
        System.out.println(obj.strStr(s1, s2));
    }
}