import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ComprasMercado
{
    public static void main(String[] args) throws IOException
    {
        Set<String> items = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++)
        {
            items.clear();

            if (i >= 1) System.out.println();

            String[] splitItems = br.readLine().split("\\s+");
            Arrays.stream(splitItems).forEach(items::add);

            items.stream().sorted().forEach(item -> System.out.print(item + " "));
        }
    }
}