import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] banknotes = {1, 2, 5, 10, 20, 50, 100};
        int money = scanner.nextInt();

        System.out.println(money);

        for (int i = banknotes.length - 1; i >= 0; i--) {

            int numberOfbanknotes = money / banknotes[i];
            money -= numberOfbanknotes * banknotes[i];

            System.out.printf("%d nota(s) de R$ %d,00\n", numberOfbanknotes, banknotes[i]);
        }

        scanner.close();
    }
}