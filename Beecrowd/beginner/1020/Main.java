import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();

        int years = days / 365;
        int months = (days % 365) / 30;
        days = days % 365 % 30;

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", years, months, days);

        scanner.close();
    }
}