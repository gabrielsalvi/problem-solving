import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilaBanco
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        List<Integer> customers;
        List<Integer> sortedCustomers;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++)
        {
            int numOfCustomers = Integer.parseInt(br.readLine());
            int customersInTheSamePosition = 0;

            String message = br.readLine();

            customers = Arrays.stream(message.split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            sortedCustomers = customers.stream()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());

            for (int j = 0; j < numOfCustomers; j++)
            {
                if (customers.get(j).equals(sortedCustomers.get(j)))
                {
                    customersInTheSamePosition++;
                }
            }

            System.out.println(customersInTheSamePosition);
        }
    }
}