import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrdenacaoPalavras
{
    public static void main(String[] args) throws IOException
    {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++)
        {
            String[] words = br.readLine().split(" ");

            Arrays.sort(words);

            Stream<String> sorted = Arrays.stream(words)
                    .sorted(Comparator.comparingInt(String::length)
                            .reversed());

            System.out.println(sorted.collect(Collectors.joining(" ")));
        }
    }
}