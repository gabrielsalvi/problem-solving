import java.util.Scanner;

public class WebloggerBrasilShortcuts
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            int cont = 0;

            while (line.contains("_") || line.contains("*"))
            {
                if (line.contains("_") && cont % 2 == 0)
                    line = line.replaceFirst("_", "<i>");

                else if (line.contains("_") && cont % 2 != 0)
                    line = line.replaceFirst("_", "</i>");

                else if (line.contains("*") && cont % 2 == 0)
                    line = line.replaceFirst("\\*", "<b>");
                    
                else if (line.contains("*") && cont % 2 != 0)
                    line = line.replaceFirst("\\*", "</b>");

                cont++;
            }

            System.out.println(line);
        }
    }
}