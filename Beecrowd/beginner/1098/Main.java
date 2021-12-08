import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("0.0");

        for (double i = 0; i <= 2; i += 0.2) {

            double j = i + 1;

            for (int k = 0 ; k < 3; k++) {
            
                if (decimalFormat.format(i).endsWith("0"))
                    System.out.printf("I=%.0f J=%.0f\n", i, j);
                else
                    System.out.printf("I=%.1f J=%.1f\n", i, j);
                
                j++;
            }
        }
    }
}