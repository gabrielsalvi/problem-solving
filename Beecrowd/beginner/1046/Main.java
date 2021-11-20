import java.util.Scanner;

public class Main {

    private static int getGameTime(int start, int end) {

        if (start > end) 
            return 24 - start + end;
        else if (start < end)
            return end - start;
        else 
            return 24;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.printf("O JOGO DUROU %s HORA(S)\n", getGameTime(scanner.nextInt(), scanner.nextInt()));

        scanner.close();
    }
}