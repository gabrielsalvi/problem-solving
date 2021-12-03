import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int amountOfCases = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < amountOfCases; i++) {

            String[] line = scanner.nextLine().split(" ");

            Rational r1 = new Rational(line[0], line[2]);
            Rational r2 = new Rational(line[4], line[6]);

            String operator = line[3];

            Rational result = Rational.calculateOperation(operator, r1, r2);

            int mdc = Rational.calculateMDC(result.getNumerator(), result.getDenominator());

            System.out.printf("%s/%s = %s/%s\n", result.getNumerator(), result.getDenominator(), result.getNumerator()/mdc, result.getDenominator()/mdc);

        }

        scanner.close();
    }
}

class Rational {

    private int numerator;
    private int denominator;

    public Rational() {}

    public Rational(String numerator, String denominator) {

        this.numerator = Integer.parseInt(numerator);
        this.denominator = Integer.parseInt(denominator);

    }

    public Rational(int numerator, int denominator) {

        this.numerator = numerator;
        this.denominator = denominator;

    }

    public static Rational calculateOperation(String operator, Rational r1, Rational r2) {

        switch (operator) {

            case "+":
                return Rational.add(r1, r2);

            case "-":
                return Rational.subtraction(r1, r2);
            
            case "*":
                return Rational.multiplication(r1, r2);

            case "/":
                return Rational.division(r1, r2);

            default:
                return new Rational();
        }
    }

    public static int calculateMDC(int numerator, int denominator) {
        
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);

        if(numerator % denominator == 0)
		    return denominator;
        else
            return calculateMDC(denominator, numerator % denominator);

    }

    private static Rational add(Rational r1, Rational r2) {
        
        int numerator = r1.numerator * r2.denominator + r2.numerator * r1.denominator;
        int denominator = r1.denominator * r2.denominator;

        return new Rational(numerator, denominator);
    }

    private static Rational subtraction(Rational r1, Rational r2) {
        
        int numerator = r1.numerator * r2.denominator - r2.numerator * r1.denominator;
        int denominator = r1.denominator * r2.denominator;

        return new Rational(numerator, denominator);
    }

    private static Rational multiplication(Rational r1, Rational r2) {
        
        int numerator = r1.numerator * r2.numerator;
        int denominator = r1.denominator * r2.denominator;

        return new Rational(numerator, denominator);
    }

    private static Rational division(Rational r1, Rational r2) {
        
        int numerator = r1.numerator * r2.denominator;
        int denominator = r2.numerator * r1.denominator;

        return new Rational(numerator, denominator);
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }
}