import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double[] banknotes = {100, 50, 20, 10, 5, 2};
        double[] coins = {1, 0.5, 0.25, 0.1, 0.05, 0.01};

        double money = scanner.nextDouble();
        scanner.close();
        
        System.out.println("NOTAS:");

        for (int i = 0; i < banknotes.length; i++) {

            double numberOfbanknotes = Math.floor(money / banknotes[i]);
            money %= banknotes[i];

            System.out.printf("%.0f nota(s) de R$ %.2f\n", numberOfbanknotes, banknotes[i]);
        }

        System.out.println("MOEDAS:");

        for (int i = 0; i < coins.length; i++) {

            double numberOfCoins;

            if (i == coins.length -1)
                numberOfCoins = Math.round(money / coins[i]);
            else
                numberOfCoins = Math.floor(money / coins[i]);

            money %= coins[i];

            System.out.printf("%.0f moeda(s) de R$ %.2f\n", numberOfCoins, coins[i]);
        }
    }
}