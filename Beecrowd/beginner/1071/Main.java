import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int smallerNumber = scanner.nextInt(), higherNumber = scanner.nextInt();

        if (smallerNumber > higherNumber) {

            smallerNumber = higherNumber + smallerNumber;
            higherNumber = smallerNumber - higherNumber;
            smallerNumber =  smallerNumber - higherNumber;

        }
        
        smallerNumber += 1;

        if (smallerNumber % 2 == 0)
            smallerNumber++;

        int sumOfOddValuesBetweenTwoNumbers = 0;   

        while (smallerNumber < higherNumber) {

            sumOfOddValuesBetweenTwoNumbers += smallerNumber;
            smallerNumber += 2;

        }

        System.out.println(sumOfOddValuesBetweenTwoNumbers);

        scanner.close();
    }
}