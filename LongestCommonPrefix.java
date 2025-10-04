import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        if(strs.length == 0){return "";}

        String first_string = strs[0];
        Arrays.sort(strs);
        String last_string = strs[strs.length - 1];
        StringBuilder sb = new StringBuilder();
        int length = Math.min(first_string.length(), last_string.length());


        for(int i = 0; i < length; i++)
        {
            if(first_string.charAt(i) == last_string.charAt(i))
            {
                sb.append(first_string.charAt(i));
            }  
            
        }
        
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] s = {"dropoff", "droplet"};
        System.out.println(longestCommonPrefix(s));
    }
}
