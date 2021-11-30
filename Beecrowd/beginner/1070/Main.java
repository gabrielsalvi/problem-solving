import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        int oddNumbersCount = 0;

        if (number % 2 == 0)
            number++;

        while (oddNumbersCount < 6) {

            System.out.println(number);
            oddNumbersCount++;

            number += 2;

        }

        scanner.close();
    }
}