import java.util.Scanner;

public class Main {

    private static boolean isTriangle(double a, double b, double c) {
        return a > Math.abs(b - c) && a < b + c;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();

        if(isTriangle(a, b, c)) 
            System.out.printf("Perimetro = %.1f\n", a + b + c);
        else
            System.out.printf("Area = %.1f\n", (a + b) * c / 2);
        
        scanner.close();
    }
}