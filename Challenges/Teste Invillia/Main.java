import java.util.Scanner;

public class Main {

    private static double calculaCombustivelNecessario(double comprimentoPista, double consumoCombustivel, int quantidadeVoltas, int reabastecimentosDesejados) {

        double percursoTotal = comprimentoPista * quantidadeVoltas;
        double kmParada = percursoTotal / reabastecimentosDesejados;

        return kmParada / consumoCombustivel;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int quantidadeVoltas, reabastecimentosDesejados;
        double comprimentoPista, consumoCombustivel;

        System.out.println("Comprimento da pista:");
        comprimentoPista = scanner.nextDouble();

        System.out.println("Número total de voltas:");
        quantidadeVoltas = scanner.nextInt();

        System.out.println("Número de paradas para reabastecer:");
        reabastecimentosDesejados = scanner.nextInt();

        System.out.println("Consumo de combustível do carro (em Km/L):");
        consumoCombustivel = scanner.nextDouble();

        scanner.close();

        System.out.printf("O número mínimo de litros necessários para percorrer até o primeiro reabastecimento é %.2f\n", calculaCombustivelNecessario(comprimentoPista, consumoCombustivel, quantidadeVoltas, reabastecimentosDesejados));
    }
}