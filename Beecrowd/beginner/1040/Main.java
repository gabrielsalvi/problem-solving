import java.util.Scanner;

public class Main {
    
    private static String studentStatus(double average) {
        if (average >= 7.0) return "Aluno aprovado.";
        if (average >= 5.0) return "Aluno em exame.";

        return "Aluno reprovado.";
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double average = Math.floor(scanner.nextDouble() * 2 + scanner.nextDouble() * 3 + scanner.nextDouble() * 4 + scanner.nextDouble() * 1) / (2 + 3 + 4 + 1);
        String studentStatus = studentStatus(average);

        System.out.printf("Media: %.1f\n", average);
        System.out.println(studentStatus);

        if (studentStatus.equals("Aluno em exame.")) {

            double exam = scanner.nextDouble();
            average = (average + exam) / 2;

            System.out.printf("Nota do exame: %.1f\n", exam);

            if (average >= 5)
                System.out.println("Aluno aprovado.");
            else
                System.out.println("Aluno reprovado.");

            System.out.printf("Media final: %.1f\n", average);
            
        }
        
        scanner.close();
    }
}