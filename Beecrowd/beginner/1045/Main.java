import java.util.Scanner;

public class Main {

    private static String getTriangleTypes(double a, double b, double c) {

        if (a >= b + c) return "NAO FORMA TRIANGULO\n";

        boolean right = Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2);
        boolean obtuse = Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2);
        boolean acute = Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2);
        
        boolean equilateral = a == b && a == c;
        boolean isosceles = a == b || a == c || b == c;

        String triangleTypes = "";

        if (right) triangleTypes += "TRIANGULO RETANGULO\n";
        else if (obtuse) triangleTypes += "TRIANGULO OBTUSANGULO\n";
        else if (acute) triangleTypes += "TRIANGULO ACUTANGULO\n";

        if (equilateral) triangleTypes += "TRIANGULO EQUILATERO\n";
        else if (isosceles) triangleTypes += "TRIANGULO ISOSCELES\n";

        return triangleTypes;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();

        if (b > a && b >= c) {
            a = a + b;
            b = a - b;
            a = a - b;
        } else if(c > a && c >= b) {
            a = a + c;
            c = a - c;
            a = a - c;
        }

        System.out.print(getTriangleTypes(a, b, c));

        scanner.close();
    }
}