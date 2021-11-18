import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static void printValues(List<Integer> values) {
        values.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        List<Integer> values = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> sortedValues = new ArrayList<>(values);

        Collections.sort(sortedValues);

        printValues(sortedValues);

        System.out.println();

        printValues(values);
        
        scanner.close();
    }
}