import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        System.out.printf("TOTAL = R$ %.2f\n", scanner.nextDouble() + scanner.nextDouble() * 0.15);

        scanner.close();
    }
}