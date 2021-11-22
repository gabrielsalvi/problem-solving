import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int startHour = scanner.nextInt(), startMinute = scanner.nextInt(), endHour = scanner.nextInt(), endMinute = scanner.nextInt();
        
        int gameTimeHours = endHour - startHour;
        int gameTimeMinutes = endMinute - startMinute;

        if (startHour >= endHour && startMinute >= endMinute) 
            gameTimeHours += 24;

        if (startMinute > endMinute) {

            gameTimeMinutes += 60;
            gameTimeHours--;

        }

        System.out.printf("O JOGO DUROU %s HORA(S) E %s MINUTO(S)\n", gameTimeHours, gameTimeMinutes);

        scanner.close();
    }
}