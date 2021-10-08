import java.io.IOException;
import java.util.Scanner;

public class AnaliseNumeros
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);

        int i, number, even = 0, odd = 0, positive = 0, negative = 0;

        for (i = 0; i < 5; i++) {
            number = scanner.nextInt();

            if (number % 2 == 0)
                even++;
            else
                odd++;

            if (number > 0)
                positive++;
            else if (number < 0)
                negative++;
        }

        scanner.close();

        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(positive + " valor(es) positivo(s)");
        System.out.println(negative + " valor(es) negativo(s)");
    }
}
