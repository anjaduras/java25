import java.util.Scanner;
public class BasicCalc {
    public static void main(String[] args) {
        // Scanner für Benutzereingabe
        Scanner scanner = new Scanner(System.in);
        // Eingabe der ersten Zahl
        System.out.print("Geben Sie die erste Kommazahl ein: ");
        double zahl1 = scanner.nextDouble();
        // Eingabe der zweiten Zahl
        System.out.print("Geben Sie die zweite Kommazahl ein: ");
        double zahl2 = scanner.nextDouble();
        // Rechenoperationen
        double summe = zahl1 + zahl2;
        double differenz = zahl1 - zahl2;
        double produkt = zahl1 * zahl2;
        double quotient = zahl2 != 0 ? zahl1 / zahl2 : Double.NaN; // Vermeide Division durch 0
        // Ausgabe der Ergebnisse
        System.out.println("Summe: " + summe);
        System.out.println("Differenz: " + differenz);
        System.out.println("Produkt: " + produkt);
        if (zahl2 != 0) {
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Division durch 0 ist nicht erlaubt.");
        }
        scanner.close();
    }
}
