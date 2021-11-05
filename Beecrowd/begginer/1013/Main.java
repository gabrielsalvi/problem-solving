import java.util.Scanner;

public class Main {

    public static int higherNumber(int a, int b) {
        return (a + b + Math.abs(a-b)) / 2;
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int a, b, c, higher;
        String values[] = scanner.nextLine().split(" ");

        a = Integer.parseInt(values[0]);
        b = Integer.parseInt(values[1]);
        c = Integer.parseInt(values[2]);

        higher = higherNumber(a, b);
        higher = higherNumber(higher, c);

        System.out.println(higher + " eh o maior");
        
        scanner.close();
    }
}