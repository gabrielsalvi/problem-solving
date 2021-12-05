import java.util.Scanner;

public class Dama {
    
    public static String getRequiredMovesToReachTheDestination(int x1, int y1, int x2, int y2) {

        if (x1 == x2 && y1 == y2) 
            return "0";

        if (x1 == x2 || y1 == y2 || Math.abs(x1 - x2) == Math.abs(y1 - y2)) 
            return "1";

        return "2";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            int x1 = scanner.nextInt(), y1 = scanner.nextInt(), x2 = scanner.nextInt(), y2 = scanner.nextInt();

            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) 
                break;
            
            System.out.println(getRequiredMovesToReachTheDestination(x1, y1, x2, y2));

        }
        
        scanner.close();
    }
}