package Leetcode;
import java.util.*;

public class encrypt {
  public static String maskify(String str) {
        int lenght = str.length();
        int mask_the_word = lenght - 4;
        String mask_char = "#";
        
        //This processes the changing of digits into #
        StringBuilder sb = new StringBuilder();

        if(lenght <= 4){
          mask_the_word = 0;
          return str;
        }

        else if(lenght > 1){
          for(int i = 1; i <= mask_the_word; i++)
            {
              sb.append("#");
            }
          }

        //This provides the last 4 digits of a pin
        StringBuilder last_4 = new StringBuilder();
        last_4.append(str);
        last_4.delete(0, mask_the_word);

        mask_char =sb.toString();
        String masked_output = mask_char + str.substring(mask_the_word);
        return masked_output;
        }
  public static void main(String args[]) {

    /*
     Scanner scanner = new Scanner(System.in);

     String input = scanner.nextLine();

     char[] masked_input = String.valueOf(input).toCharArray();
     StringBuilder sb = new StringBuilder();


     StringBuilder last_4 = new StringBuilder();
    last_4.append(input);
    last_4.delete(0, input.length()-4);
    

     for(int i = 0; i <= masked_input.length - 4; i++)
     {   
        sb.append("#");
     }
     System.out.println(sb.toString().concat(last_4.toString()));
     scanner.close();
     */
    Scanner scanner = new Scanner(System.in);
    String sc = scanner.nextLine();
    System.out.println(maskify(sc));
    scanner.close();

  }
}
