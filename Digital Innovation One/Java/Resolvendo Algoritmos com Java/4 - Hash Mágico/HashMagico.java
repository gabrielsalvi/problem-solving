import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMagico
{
    private static final Map<Character, Integer> fillAlphabet ()
    {
        Map<Character, Integer> alphabet = new HashMap<>();

        for (int i = 0; i < 26; i++)
        {
            char character = (char) (65 + i);
            alphabet.put(character, i);
        }

        return alphabet;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> alphabet = fillAlphabet();

        int cases = scanner.nextInt();

        for (int i = 0; i < cases; i++)
        {
            int lines = scanner.nextInt();
            scanner.nextLine();

            int hashValue = 0;
            for (int j = 0; j < lines; j++)
            {
                char[] chars = scanner.nextLine().toUpperCase().toCharArray();

                for (int k = 0; k < chars.length; k++)
                    hashValue += alphabet.get(chars[k]) + j + k;
            }

            System.out.println(hashValue);
        }
    }
}