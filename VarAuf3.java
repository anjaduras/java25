import java.util.Scanner;

public class VarAuf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double UMRECHNUNGSKURS = 1.96;

        System.out.print("Geben Sie den Betrag in DM ein: ");
        double dm = scanner.nextDouble();

        double euro = dm / UMRECHNUNGSKURS;

        System.out.printf("Der Betrag in Euro beträgt: %.2f €\n", euro);

        scanner.close();
    }
}

//?