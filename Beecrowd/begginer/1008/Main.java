import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("NUMBER = " + scanner.nextInt());
        System.out.printf("SALARY = U$ %.2f\n", scanner.nextInt() * scanner.nextDouble());

        scanner.close();
    }
}