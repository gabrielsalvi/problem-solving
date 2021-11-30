import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int evenNumbersCount = 0, oddNumbersCount = 0, positiveNumbersCount = 0,negativeNumbersCount = 0;

        for (int i = 0; i < 5; i++) {
            
            int number = scanner.nextInt();

            if (number % 2 == 0)
                evenNumbersCount++;
            else
                oddNumbersCount++;

            if (number > 0)
                positiveNumbersCount++;
            else if (number < 0)
                negativeNumbersCount++;
            
        }

        System.out.printf("%s valor(es) par(es)\n", evenNumbersCount);
        System.out.printf("%s valor(es) impar(es)\n", oddNumbersCount);
        System.out.printf("%s valor(es) positivo(s)\n", positiveNumbersCount);
        System.out.printf("%s valor(es) negativo(s)\n", negativeNumbersCount);

        scanner.close();
    }
}