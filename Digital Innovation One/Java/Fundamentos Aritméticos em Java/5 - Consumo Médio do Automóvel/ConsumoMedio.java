import java.io.IOException;
import java.util.Scanner;

public class ConsumoMedio
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);

        int travelledDistance = scanner.nextInt();
        double spentFuel = scanner.nextDouble();

        double averageConsumption = travelledDistance / spentFuel;

        System.out.printf("%.3f km/l%n", averageConsumption);

        scanner.close();
    }
}