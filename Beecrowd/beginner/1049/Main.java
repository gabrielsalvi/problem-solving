import java.util.Scanner;

public class Main {

    private static String getAnimalName(String subdivision, String animalClass, String feedingBehavior) {

        if (subdivision.equalsIgnoreCase("vertebrado")) {

            if (animalClass.equalsIgnoreCase("ave")) {

                if (feedingBehavior.equalsIgnoreCase("carnivoro")) return "aguia";
                if (feedingBehavior.equalsIgnoreCase("onivoro")) return "pomba";

            }

            if (animalClass.equalsIgnoreCase("mamifero")) {

                if (feedingBehavior.equalsIgnoreCase("onivoro")) return "homem";
                if (feedingBehavior.equalsIgnoreCase("herbivoro")) return "vaca";

            }
        }

        if (subdivision.equalsIgnoreCase("invertebrado")) {

            if (animalClass.equalsIgnoreCase("inseto")) {

                if (feedingBehavior.equalsIgnoreCase("hematofago")) return "pulga";
                if (feedingBehavior.equalsIgnoreCase("herbivoro")) return "lagarta";

            }

            if (animalClass.equalsIgnoreCase("anelideo")) {

                if (feedingBehavior.equalsIgnoreCase("hematofago")) return "sanguessuga";
                if (feedingBehavior.equalsIgnoreCase("onivoro")) return "minhoca";

            }
        }

        return "";
    }

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println(getAnimalName(scanner.next(), scanner.next(), scanner.next()));

        scanner.close();
    }
}