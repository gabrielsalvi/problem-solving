import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double volume = 4.0/3 * 3.14159 * Math.pow(scanner.nextInt(), 3);

        System.out.printf("VOLUME = %.3f\n", volume);

        scanner.close();
    }
}