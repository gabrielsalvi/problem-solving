import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double payment = 0.0;

        while (scanner.hasNextLine()) {
            String[] values = scanner.nextLine().split(" ");
            payment += Integer.parseInt(values[1]) * Double.parseDouble(values[2]);
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", payment);

        scanner.close();
    }
}