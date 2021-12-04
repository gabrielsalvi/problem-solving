import java.util.Scanner;

public class TrigoNoTabuleiro
{
    public static final int GRAINS_PER_GRAM = 12; 
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int amountOfTestCases = scanner.nextInt();

        for (int i = 0; i < amountOfTestCases; i++) {

            int boardPosition = scanner.nextInt();
            double amountOfGrains = Math.pow(2, boardPosition);

            long kilograms = (long) (amountOfGrains / GRAINS_PER_GRAM / 1000);

            System.out.printf("%d kg\n", kilograms);

        }

        scanner.close();
    }
}