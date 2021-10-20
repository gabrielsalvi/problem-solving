import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemNumeros
{
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        int values = scr.nextInt();
        
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < values; i++)
        {
            var numero = scr.nextInt();

            if(numbers.containsKey(numero))
            {
                numbers.compute(numero, (key, val) -> val + 1);
            }
            else 
            {
                numbers.put(numero, 1);
            }
        }

        numbers.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " aparece " + e.getValue() + " vez(es)"));
    }
}