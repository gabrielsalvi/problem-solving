import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PedraPapelTesouraLagartoSpock
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 0; i < num; i++)
        {
            String word1 = scanner.next();
            String word2 = scanner.next();

            System.out.println(Game.getWinner(word1, word2));
        }
    }
}

class Game
{
    private static final Map<String, String[]> rules = new HashMap<>();

    static {
        rules.put("pedra", new String[]{"tesoura", "lagarto"});
        rules.put("tesoura", new String[]{"papel", "lagarto"});
        rules.put("papel", new String[]{"pedra", "spock"});
        rules.put("lagarto", new String[]{"papel", "spock"});
        rules.put("spock", new String[]{"pedra", "tesoura"});
    }

    public static String getWinner(String a, String b)
    {
        for (int i = 0; i < rules.get(a).length; i++)
        {
            if (rules.get(a)[i].equals(b))
                return "fernanda";
            else if (rules.get(b)[i].equals(a))
                return "marcia";
        }

        return "empate";
    }
}