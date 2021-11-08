import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        List<Double> pointA = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        List<Double> pointB = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        double distance = Math.sqrt(Math.pow(pointB.get(0) - pointA.get(0), 2) + Math.pow(pointB.get(1) - pointA.get(1), 2));

        System.out.printf("%.4f\n", distance);

        scanner.close();
    }
}