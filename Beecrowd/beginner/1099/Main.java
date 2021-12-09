import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int amountOfTestCases = scanner.nextInt();

        for (int i = 0; i < amountOfTestCases; i++) {

            int sumOfConsecutiveOddNumbers = 0;
            int highest = scanner.nextInt(), lowest = scanner.nextInt();

            if (lowest > highest) {

                lowest = lowest - highest;
                highest = highest + lowest;
                lowest = highest - lowest;

            }

            for (int j = lowest + 1; j < highest; j++) {

                if (j % 2 != 0) sumOfConsecutiveOddNumbers += j;

            }

            System.out.println(sumOfConsecutiveOddNumbers);
        }

        scanner.close();

    }
}