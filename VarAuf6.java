import java.util.Scanner;
import java.text.DecimalFormat;

public class VarAuf6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00"); // Formatierung auf 2 Nachkommastellen

        // Feste Werte
        final double PREIS_PRO_KWH = 0.13;
        final double ANSCHLUSSGEBUEHR = 27.30;
        final double MWST_PROZENT = 19;

        // Zählerstände erfassen
        System.out.print("Alter Zählerstand (kWh): ");
        int alterStand = scanner.nextInt();

        System.out.print("Neuer Zählerstand (kWh): ");
        int neuerStand = scanner.nextInt();

        // Verbrauch berechnen
        int verbrauch = neuerStand - alterStand;
        double verbrauchskosten = verbrauch * PREIS_PRO_KWH;

        // Zwischensumme
        double zwischensumme = ANSCHLUSSGEBUEHR + verbrauchskosten;

        // Mehrwertsteuer
        double mwst = zwischensumme * MWST_PROZENT / 100;

        // Endbetrag
        double endbetrag = zwischensumme + mwst;

        // Rechnung ausgeben
        System.out.println("\nR E C H N U N G");
        System.out.println("Preis fuer eine kWh: " + PREIS_PRO_KWH + " EUR");
        System.out.println("Anschlussgrundgebuehr: " + df.format(ANSCHLUSSGEBUEHR) + " EUR");
        System.out.println("Verbrauch: " + verbrauch + " kWh * " + PREIS_PRO_KWH + " EUR = + " + df.format(verbrauchskosten));
        System.out.println("----------");
        System.out.println(df.format(zwischensumme) + " EUR");
        System.out.println("MwSt (" + MWST_PROZENT + "%): + " + df.format(mwst));
        System.out.println("----------");
        System.out.println("Endbetrag: " + df.format(endbetrag) + " EUR");

        scanner.close();
    }
}
