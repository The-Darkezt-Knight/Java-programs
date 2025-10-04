public class Reversed_Integer {
    public int reverse(int x) {
        char[] elements = String.valueOf(x).toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : elements) { 
        if(c == '-')
        {
            continue;
        }
            sb.append(c);
        }


        sb.reverse();

        long r = Integer.parseInt(sb.toString());

        long result = (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE)? 0 : (x<0) ? r -= r * 2 : r;
        return (int) result;
    }
    public static void main(String[] args) {
        Reversed_Integer s = new Reversed_Integer();
        System.out.println(s.reverse(1534236469));
    }
}
