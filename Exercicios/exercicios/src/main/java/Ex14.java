import java.util.Locale;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String o;
        do {
            System.out.println("Digite a Temperatura em Celsius");
            double c = sc.nextDouble();
            double f = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", f);
            System.out.println("Deseja repetir ? s/n)");
            o= sc.next();

        } while (o.equalsIgnoreCase("s"));


        sc.close();
    }
}
