import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double average = (scanner.nextDouble() * 3.5 + scanner.nextDouble() * 7.5) / (3.5 + 7.5);
        scanner.close();

        System.out.printf("MEDIA = %.5f\n", average);
    }
}