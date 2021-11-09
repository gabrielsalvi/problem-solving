import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double necessaryFuel = (scanner.nextInt() * scanner.nextInt()) / 12.0;

        System.out.printf("%.3f\n", necessaryFuel);

        scanner.close();
    }
}