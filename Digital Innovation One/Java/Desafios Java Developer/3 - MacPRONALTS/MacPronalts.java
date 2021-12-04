import java.util.Scanner;

public class MacPronalts {

    public static double getProductValue(String productCode) {

        switch (productCode) {

            case "1001": return 1.5;
            case "1002": return 2.5;
            case "1003": return 3.5;
            case "1004": return 4.5;
            case "1005": return 5.5;
            default: return 0.0;

        }
    } 

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double purchaseValue = 0;

        for (int i = 0; i < n; i++) {

            String productCode = scanner.next();
            int quantity = scanner.nextInt();

            purchaseValue += getProductValue(productCode) * quantity;

        }

        System.out.printf("%.2f\n", purchaseValue);

        scanner.close();
    }
}