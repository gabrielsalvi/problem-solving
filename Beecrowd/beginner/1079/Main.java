import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int amountOfTestCases = scanner.nextInt();

        for (int i = 0; i < amountOfTestCases; i++) {

            double weightedAverage = (scanner.nextDouble() * 2 + scanner.nextDouble() * 3 + scanner.nextDouble() * 5) / 10;
            System.out.printf("%.1f\n", weightedAverage);

        }

        scanner.close();
    }
}