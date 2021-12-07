import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int highest = 0, position = 0;

        for (int i = 1; i <= 100; i++) {

            int number = scanner.nextInt();

            if (number > highest) {

                highest = number;
                position = i;

            }
        }

        System.out.println(highest);
        System.out.println(position);

        scanner.close();
    }
}