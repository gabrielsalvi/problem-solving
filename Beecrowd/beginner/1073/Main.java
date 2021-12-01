import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 2; i <= number; i += 2)
            System.out.printf("%s^2 = %.0f\n", i, Math.pow(i, 2));

        scanner.close();
    }
}