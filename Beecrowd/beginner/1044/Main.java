import java.util.Scanner;

public class Main {

    private static boolean areMultiples(int a, int b) {
        return a % b == 0 || b % a == 0;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        if (areMultiples(scanner.nextInt(), scanner.nextInt()))
            System.out.println("Sao Multiplos");
        else
            System.out.println("Nao sao Multiplos");

        scanner.close();
    }
}