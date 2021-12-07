import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int amountOfFrogs = 0, amountOfRats = 0, amountOfRabbits = 0;
        int amountOfTestCases = scanner.nextInt();

        for (int i = 0; i < amountOfTestCases; i++) {

            int amountOfAnimal = scanner.nextInt();
            String typeOfAnimal = scanner.next();

            switch (typeOfAnimal) {

                case "C": 
                    amountOfRabbits += amountOfAnimal;
                    break;
                
                case "R":
                    amountOfRats += amountOfAnimal;
                    break;
                
                case "S":
                    amountOfFrogs += amountOfAnimal;
                    break;
            }
        }

        int totalNumberOfAnimalsUsed = amountOfRabbits + amountOfRats + amountOfFrogs;

        System.out.printf("Total: %d cobaias\n", totalNumberOfAnimalsUsed);
        System.out.printf("Total de coelhos: %d\n", amountOfRabbits);
        System.out.printf("Total de ratos: %d\n", amountOfRats);
        System.out.printf("Total de sapos: %d\n", amountOfFrogs);
        System.out.printf("Percentual de coelhos: %.2f %%\n", amountOfRabbits * 100.0 / totalNumberOfAnimalsUsed);
        System.out.printf("Percentual de ratos: %.2f %%\n", amountOfRats * 100.0 / totalNumberOfAnimalsUsed);
        System.out.printf("Percentual de sapos: %.2f %%\n", amountOfFrogs * 100.0 / totalNumberOfAnimalsUsed);

        scanner.close();
    }
}