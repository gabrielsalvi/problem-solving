import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%.3f km/l\n", scanner.nextInt() / scanner.nextDouble());

        scanner.close();
    }
}