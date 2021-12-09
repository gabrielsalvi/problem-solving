import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int biggest, smallest;

        while ((biggest = scanner.nextInt()) > 0 && (smallest = scanner.nextInt()) > 0) {

            int sum = 0;

            if (smallest > biggest) {

                smallest = smallest - biggest;
                biggest = biggest + smallest;
                smallest = biggest - smallest;

            }

            for (int j = smallest; j <= biggest; j++) {

                sum += j;
                System.out.printf("%s ", j);

                if (j == biggest)
                    System.out.printf("Sum=%s\n", sum);

            }
        }

        scanner.close();
    }
}