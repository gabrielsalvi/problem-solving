import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double average = (scanner.nextDouble() * 2 + scanner.nextDouble() * 3 + scanner.nextDouble() * 5) / 10;
        scanner.close();

        System.out.printf("MEDIA = %.1f\n", average);
    }
}