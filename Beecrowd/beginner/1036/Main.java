import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static double[] bhaskara(double a, double b, double c) {

        double[] roots = new double[2];
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (a == 0.0 || delta < 0) 
            return null;

        roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
        roots[1] = (-b - Math.sqrt(delta)) / (2 * a);

        return roots;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        List<Double> values = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        scanner.close();

        double roots[] = bhaskara(values.get(0), values.get(1), values.get(2));

        if (roots != null)
            System.out.printf("R1 = %.5f\nR2 = %.5f\n", roots[0], roots[1]);
        else
            System.out.println("Impossivel calcular");
    }
}