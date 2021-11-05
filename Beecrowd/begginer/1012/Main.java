import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double A, B, C, triangle, circle, trapezium, square, rectangle;
        String[] values = scanner.nextLine().split(" ");
        
        A = Double.parseDouble(values[0]);
        B = Double.parseDouble(values[1]);
        C = Double.parseDouble(values[2]);

        triangle = (A * C) / 2;
        circle = (C * C) * 3.14159;
        trapezium = (A + B) * C / 2;
        square = B * B;
        rectangle = A * B;

        System.out.printf("TRIANGULO: %.3f\n", triangle);
        System.out.printf("CIRCULO: %.3f\n", circle);
        System.out.printf("TRAPEZIO: %.3f\n", trapezium);
        System.out.printf("QUADRADO: %.3f\n", square);
        System.out.printf("RETANGULO: %.3f\n", rectangle);

        scanner.close();
    }
}