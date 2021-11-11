import java.util.Scanner;

public class Main {

    private static String getInterval(double value) {

        if (value < 0 || value > 100) return "Fora de intervalo";
        if (value <= 25) return "Intervalo [0,25]";
        if (value <= 50) return "Intervalo (25,50]";
        if (value <= 75) return "Intervalo (50,75]";
        
        return "Intervalo (75,100]";
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println(getInterval(scanner.nextDouble()));

        scanner.close();
    }
}