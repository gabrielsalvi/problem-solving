import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countPositiveNumbers = 0;

        while (scanner.hasNext()) {

            if (scanner.nextDouble() > 0)
                countPositiveNumbers++;
        }

        System.out.println(countPositiveNumbers + " valores positivos");

        scanner.close();
    }
}