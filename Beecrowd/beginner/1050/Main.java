import java.util.Scanner;

public class Main {

    private static String getCityNameByDDD(int ddd) {

        switch (ddd) {

            case 11: return "Sao Paulo";
            case 19: return "Campinas";
            case 21: return "Rio de Janeiro";
            case 27: return "Vitoria";
            case 31: return "Belo Horizonte";
            case 32: return "Juiz de Fora";
            case 61: return "Brasilia";
            case 71: return "Salvador";
            default: return "DDD inválido";

        }
    }

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println(getCityNameByDDD(scanner.nextInt()));

        scanner.close();
    }
}