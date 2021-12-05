import java.util.Scanner;

public class ParOuImpar {

    public static String getOutput(int number) {

        String output = "";
        
        if (number == 0) return "NULL";

        if (number % 2 == 0)
            output += "EVEN";
        else
            output += "ODD";

        if (number > 0)
            output += " POSITIVE";
        else
            output += " NEGATIVE";

        return output;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int amountOfTestCases = scanner.nextInt();

        for (int i = 0; i < amountOfTestCases; i++)
            System.out.println(getOutput(scanner.nextInt()));

        scanner.close();
    }
}