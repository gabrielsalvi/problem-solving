import java.util.*;

public class MelhorAmigoPablo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Set<String> namesYes = new LinkedHashSet<>();
        Set<String> namesNo = new LinkedHashSet<>();

        String line = scanner.nextLine();

        while (!line.equals("FIM"))
        {
            var names = line.split(" ");

            if (names[1].equals("SIM"))
                namesYes.add(names[0]);
            else
                namesNo.add(names[0]);

            line = scanner.nextLine();
        }

        String bestFriendOfPablo = namesYes.stream().max(Comparator.comparingInt(String::length)).get();

        namesYes.stream().sorted().forEach(System.out::println);
        namesNo.stream().sorted().forEach(System.out::println);

        System.out.println("\nAmigo do Pablo:\n" + bestFriendOfPablo);
    }
}