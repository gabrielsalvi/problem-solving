import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int sum = scanner.nextInt() + scanner.nextInt();
        System.out.println("SOMA = " + sum);

        scanner.close();
    }
}