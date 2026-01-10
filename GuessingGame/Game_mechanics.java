package GuessingGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Game_mechanics {
    private static ArrayList<String> words = new ArrayList<>();

    public static ArrayList<String> get_database()
    {
        return words;
    }

    public static String get_word()
    {
            if (get_database().isEmpty()) {
            throw new IllegalStateException("No words in database. Call add_words(...) first.");
            }

            int index = (int) (Math.random() * get_database().size());
            return get_database().get(index);
    }

    public static void add_words(String word)
    {
        get_database().add(word);
    }

    public static void validate_guess()
    {
        Scanner scanner = new Scanner(System.in);

        String hidden_word = get_word();
        char[] word_bits = hidden_word.toCharArray();
        char[] correct_basis = new char[word_bits.length];
        Arrays.fill(correct_basis, '_');
        boolean status = false;

        int correct = 0;

        System.out.println(Arrays.toString(correct_basis));

        while(!status)
            {
                String guess = scanner.nextLine();
                char[] guess_bits = guess.toCharArray();

                int len = Math.min(guess.length(), hidden_word.length());

                for(int i = 0; i < len; i++)
                    {
                        if(guess_bits[i] == word_bits[i] && correct_basis[i] == '_')
                            {
                                correct_basis[i] = word_bits[i];
                                correct++;
                            }
                    }

                System.out.println(Arrays.toString(correct_basis));

                if(correct == word_bits.length)
                    {
                        System.out.println("Congratulations! You guessed it right!");
                        status = true;
                    }
            }
        scanner.close();
    }

}