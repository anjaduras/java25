import java.util.Scanner;

public class VarAuf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die erste Zahl ein: ");
        double zahl1 = scanner.nextDouble();

        System.out.print("Geben Sie die zweite Zahl ein: ");
        double zahl2 = scanner.nextDouble();

        // Berechnungen
        double summe = zahl1 + zahl2;
        double differenz = zahl1 - zahl2;
        double produkt = zahl1 * zahl2;
        double quotient;

        if (zahl2 != 0) {
            quotient = zahl1 / zahl2;
        } else {
            quotient = Double.NaN; // "Not a Number"
        }

        System.out.println("\nErgebnisse:");
        System.out.println("Summe: " + summe);
        System.out.println("Differenz: " + differenz);
        System.out.println("Produkt: " + produkt);
        if (zahl2 != 0) {
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Quotient: Division durch 0 nicht möglich!");
        }

        scanner.close();
    }
}
