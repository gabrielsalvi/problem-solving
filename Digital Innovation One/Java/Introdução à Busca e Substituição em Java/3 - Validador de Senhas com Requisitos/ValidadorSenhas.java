import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidadorSenhas
{
    private static boolean isValid(final String psw)
    {
        var passwordLength = psw.length();

        Pattern allowed = Pattern.compile("[a-zA-Z0-9]+");
        Pattern required = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");

        return passwordLength >= 6 && passwordLength <= 32 && allowed.matcher(psw).matches()
                && required.matcher(psw).matches();
    }

    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);

        while(scanner.hasNextLine())
        {
            String password = scanner.nextLine();

            if (isValid(password))
                System.out.println("Senha valida.");
            else
                System.out.println("Senha invalida.");
        }
    }
}