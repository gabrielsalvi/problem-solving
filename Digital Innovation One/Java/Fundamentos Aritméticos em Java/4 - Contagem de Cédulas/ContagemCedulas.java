import java.io.IOException;
import java.util.Scanner;

public class ContagemCedulas
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);

        int banknote, i, money;
        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};

        money = scanner.nextInt();

        System.out.printf("%d\n", money);

        for (i = 0; i < 7; i++) {
            banknote = money / banknotes[i];
            money = money % banknotes[i];
            
            System.out.printf("%d nota(s) de R$ %d,00\n", banknote, banknotes[i]);
        }

        scanner.close();
    }
}