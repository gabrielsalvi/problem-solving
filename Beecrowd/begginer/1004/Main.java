import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int product = scanner.nextInt() * scanner.nextInt();
        scanner.close();

        System.out.println("PROD = " + product);
    }
}