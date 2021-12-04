import java.util.Scanner;

public class Xadrez
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt(), column = scanner.nextInt();

        if ((row + column) % 2 == 0) 
            System.out.println("1");
        else 
            System.out.println("0");

        scanner.close();
    }
}