import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counterEvenNumbers = 0;

        for (int i = 0; i < 5; i++) {
            
            if (scanner.nextInt() % 2 == 0)
                counterEvenNumbers++;
            
        }

        System.out.printf("%s valores pares\n", counterEvenNumbers);

        scanner.close();
    }
}