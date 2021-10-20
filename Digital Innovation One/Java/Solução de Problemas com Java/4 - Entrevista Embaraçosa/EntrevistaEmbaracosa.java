import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EntrevistaEmbaracosa 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word;

        while((word = br.readLine()) != null) 
        {
            boolean hasRepetition = false;

            for(int i = 0; i <= word.length() - 1; i++)
            {
                var subString = word.substring(0, i);

                if(subString.endsWith(word.substring(i)))
                {
                    System.out.println(subString);
                    hasRepetition = true;
                }
            }

            if(!hasRepetition)
                System.out.println(word);
        }
    }
}