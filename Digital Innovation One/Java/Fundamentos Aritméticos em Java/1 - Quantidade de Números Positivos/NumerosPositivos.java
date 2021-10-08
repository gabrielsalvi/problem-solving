import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumerosPositivos
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = 0, count = 0;
        double number;

        while (i < 6)
        {
            number = Double.parseDouble(br.readLine());

            if (number > 0.0)
            {
                count++;
            }
            i++;
        }

        System.out.println(count + " valores positivos");
    }
}