import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbersInInterval = 0, numbersOutOfTheInterval = 0;

        int amountOfValuesToRead = scanner.nextInt();

        for (int i = 0; i < amountOfValuesToRead; i++) {

            int number = scanner.nextInt();

            if (number >= 10 && number <= 20)
                numbersInInterval++;
            else
                numbersOutOfTheInterval++;

        }

        System.out.println(numbersInInterval + " in");
        System.out.println(numbersOutOfTheInterval + " out");

        scanner.close();
    }
}