import java.util.Scanner;

public class VarAuf7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Zahl vom Benutzer einlesen
        System.out.print("Geben Sie eine Zahl (maximal 5-stellig) ein: ");
        int zahl = scanner.nextInt();

        if (zahl < 0 || zahl > 99999) {
            System.out.println("Ungültige Eingabe! Bitte eine Zahl zwischen 0 und 99999 eingeben.");
        } else {
            // Einzelne Stellen extrahieren
            int zehntausender = zahl / 10000;
            int tausender = (zahl % 10000) / 1000;
            int hunderter = (zahl % 1000) / 100;
            int zehner = (zahl % 100) / 10;
            int einer = zahl % 10;

            // Quersumme berechnen
            int quersumme = zehntausender + tausender + hunderter + zehner + einer;

            // Ausgabe
            System.out.println("Die Quersumme von " + zahl + " ist: " + quersumme);
        }

        scanner.close();
    }
}
