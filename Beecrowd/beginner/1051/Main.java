import java.util.Scanner;

public class Main {

    private static Double getTaxesValue(double salary) {

        if (salary > 4500.00)
            return (salary - 4500.00) * (28 / 100.0) + getTaxesValue(salary - (salary - 4500.00));

        if (salary > 3000.00 && salary <= 4500.00)
            return (salary - 3000) * (18 / 100.0) + getTaxesValue(salary - (salary - 3000));

        if (salary > 2000.00 && salary <= 3000.00)
            return (salary - 2000) * (8 / 100.0) + getTaxesValue(salary - (salary - 2000));

        return 0.0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double taxes = getTaxesValue(scanner.nextDouble());

        if (taxes != 0.0)
            System.out.printf("R$ %.2f\n", taxes);
        else
            System.out.println("Isento");

        scanner.close();
    }
}