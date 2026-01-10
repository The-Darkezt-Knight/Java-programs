public class Shortest_Word_Finder {
    public static int findShort(String s) {
    String[] words = s.split(" ");
    int minLength = words[0].length();

    for(int i = 0; i < words.length; i++)
    {
        if (words[i].length() < minLength) {
            minLength = words[i].length();
        }
    }
        System.out.println(minLength);
        return minLength;
    }

    public static void main(String[] args) {
        findShort("Animal teen Filipino Water");
    }
}
