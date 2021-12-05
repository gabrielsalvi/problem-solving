import java.util.Scanner;

public class FusoHorario {

    public static int getArrivalTime(int departureTime, int travelTime, int timeZone) {

        int arrivalTime = departureTime + travelTime + timeZone;

        if (arrivalTime >= 24) arrivalTime -= 24;
        if (arrivalTime < 0) arrivalTime += 24;

        return arrivalTime;

    } 

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int departureTime = scanner.nextInt();
        int travelTime = scanner.nextInt();
        int timeZone = scanner.nextInt();

        System.out.println(getArrivalTime(departureTime, travelTime, timeZone));

        scanner.close();
    }
}