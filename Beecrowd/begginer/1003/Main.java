import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("SOMA = " + (scanner.nextInt() + scanner.nextInt()));

        scanner.close();
    }
}