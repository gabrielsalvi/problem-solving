import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class OrdenandoParesImpares
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int aux, N = Integer.parseInt(st.nextToken());

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int i = 0; i < N; i++)
        {
            st = new StringTokenizer(br.readLine());
            aux = Integer.parseInt(st.nextToken());

            if (aux % 2 == 0)
            {
                even.add(aux);
            } else
            {
                odd.add(aux);
            }
        }

        even.stream()
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        odd.stream()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList())
            .forEach(System.out::println);
    }
}