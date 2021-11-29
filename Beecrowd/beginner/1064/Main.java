import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counterPositiveNumbers = 0;
        double average = 0.0;

        for (int i = 0; i < 6; i++) {

            double number = scanner.nextDouble();
            
            if (number > 0) {

                average += number;
                counterPositiveNumbers++;

            }
            
        }

        average /= counterPositiveNumbers;

        System.out.printf("%s valores positivos\n", counterPositiveNumbers);
        System.out.printf("%.1f\n", average);

        scanner.close();
    }
}