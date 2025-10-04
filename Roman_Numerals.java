public class Roman_Numerals {

    public static int convert_into_roman(char c)
    {
        switch(c)
        {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static int roman_numerals(String s) {   
        int result = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int current_value = convert_into_roman(s.charAt(i));
            int next_value = (i + 1 < len) ? convert_into_roman(s.charAt(i + 1)) : 0;
            if (current_value < next_value) {
                result -= current_value;
            } else {
                result += current_value;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(roman_numerals("IV"));
    }
}
