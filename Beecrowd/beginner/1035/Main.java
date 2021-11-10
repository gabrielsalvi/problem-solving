import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        List<Integer> values = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        
        scanner.close();

        int A = values.get(0), B = values.get(1), C = values.get(2), D = values.get(3);

        if (B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0)
            System.out.println("Valores aceitos");
        else
            System.out.println("Valores nao aceitos");
    }
}