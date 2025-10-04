import java.util.ArrayList;

public class Outlier_finder {

    static int findx(int[] integers) {
    int evenCount = 0, oddCount = 0;
    int even = 0, odd = 0;

    for (int n : integers) {
        if (n % 2 == 0) { evenCount++; even = n; }
        else { oddCount++; odd = n; }
        if (evenCount > 1 && oddCount == 1) return odd;   // odd outlier found
        if (oddCount > 1 && evenCount == 1) return even;  // even outlier found
    }
    return 0; // fallback (shouldn’t happen if input is valid)
}

    static int find_the_outlier(int[] integers)
    {
        int even_numbers = 0, even_outlier = 0;
        int odd_numbers = 0, odd_outlier = 0;

        for (int n : integers) {
            if(n%2 == 0){even_numbers++; even_outlier = n;}
            else{odd_numbers++; odd_outlier = n;}
            if(even_numbers > 1 && odd_outlier == 1){return odd_outlier;}
            if(odd_numbers > 1 && even_outlier == 1){return even_outlier;}
        }
        return 0;
    }

    static int find(int[] integers) {
        ArrayList<Integer> even_numbers = new ArrayList<>();
        ArrayList<Integer> odd_numbers = new ArrayList<>();
        int outlier = 0;

        for(int i = 0; i < integers.length; i++)
        {
            if(integers[i] % 2 == 0)
            {
                even_numbers.add(integers[i]);
            }
            else
            {
                odd_numbers.add(integers[i]);

            }
        }

        if(even_numbers.size() > odd_numbers.size())
        {
            System.out.println("Even");
            for(int i = 0; i < integers.length; i++)
            {
                if(integers[i] % 2 != 0)
                {
                    outlier = integers[i];
                }
            }
        }
        else if(even_numbers.size() < odd_numbers.size())
        {
            System.out.println("Odd");

            for(int i = 0; i < integers.length; i++)
            {
                if(integers[i] % 2 == 0)
                {
                    outlier = integers[i];
                }
            }
        }
    return outlier;
  }
  public static void main(String[] args) {
    int[] numbers = {12, 65, 32, 48, 92, 1012};
    System.out.println(findx(numbers));
    System.out.println(find_the_outlier(numbers));
  }
}
