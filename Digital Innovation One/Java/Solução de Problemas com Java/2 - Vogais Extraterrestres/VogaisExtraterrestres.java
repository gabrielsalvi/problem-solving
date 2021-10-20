import java.util.Scanner;
import java.util.regex.Pattern;

public class VogaisExtraterrestres
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext())
        {
            String[] vowels = scanner.nextLine().split("");
            var line = scanner.nextLine();

            int count = 0;

            for (String v : vowels)
                count += Pattern.compile(v).matcher(line).results().count();

            System.out.println(count);
        }
    }
}