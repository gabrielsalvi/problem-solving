import java.util.Scanner;

public class Main {

    private static String getQuadrantOfPoint(double x, double y) {

        if (x > 0 && y > 0) return "Q1";
        if (x < 0 && y > 0) return "Q2";
        if (x < 0 && y < 0) return "Q3";
        if (x > 0 && y < 0) return "Q4";
        if (x != 0 && y == 0 ) return "Eixo X";
        if (x == 0 && y != 0 ) return "Eixo Y";
        
        return "Origem";
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println(getQuadrantOfPoint(scanner.nextDouble(), scanner.nextDouble()));
        
        scanner.close();
    }
}