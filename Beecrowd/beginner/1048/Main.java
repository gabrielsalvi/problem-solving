import java.util.Scanner;

public class Main {

    private static int getReadjustmentRate(double salary) {

        if (salary >= 0 && salary <= 400) return 15;
        if (salary <= 800) return 12;
        if (salary <= 1200) return 10;
        if (salary <= 2000) return 7;
        if (salary > 2000) return 4;

        return 0;
    }

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        double salary = scanner.nextDouble();
        
        int readjustmentRate = getReadjustmentRate(salary);
        double moneyEarned = salary * (readjustmentRate / 100.0);

        System.out.printf("Novo salario: %.2f\n", salary + moneyEarned);
        System.out.printf("Reajuste ganho: %.2f\n", moneyEarned);
        System.out.printf("Em percentual: %s %%\n", readjustmentRate);

        scanner.close();
    }
}