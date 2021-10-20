import java.util.Scanner;

public class CombinacaoStrings
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        while (scanner.hasNextLine())
        {
            String[] words = scanner.nextLine().split(" ");

            String wordA = words[0], wordB = words[1], output = "";
            String largest = "", shortest = "", remainder;

            boolean sameLength = false;

            if (wordA.length() > wordB.length())
            {
                largest = wordA;
                shortest = wordB;
            }
            else if (wordA.length() < wordB.length())
            {
                largest = wordB;
                shortest = wordA;
            }
            else
            {
                sameLength = true;
            }

            if (sameLength)
            {
                for (int i = 0; i < wordA.length(); i++)
                {
                    output += String.valueOf(wordA.charAt(i)) + wordB.charAt(i);
                }
            }
            else
            {
                remainder = largest.substring(shortest.length());

                for (int i = 0; i < shortest.length(); i++)
                {
                    output += String.valueOf(wordA.charAt(i)) + wordB.charAt(i);
                }

                output += remainder;
            }

            System.out.println(output);
        }
    }
}