import java.util.Scanner;

public class Main {
    
    private static double valueToPay(int code, int quantity) {
        switch (code) {
            case 1: return quantity * 4;
            case 2: return quantity * 4.5;
            case 3: return quantity * 5;
            case 4: return quantity * 2;
            case 5: return quantity * 1.5;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Total: R$ %.2f\n", valueToPay(scanner.nextInt(), scanner.nextInt()));

        scanner.close();
    }
}