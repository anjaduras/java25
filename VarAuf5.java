import java.util.Scanner;

public class VarAuf5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Zeit in Sekunden
        System.out.print("Geben Sie die Zeit in Sekunden ein: ");
        long sekundenGesamt = scanner.nextLong();

        // Berechnung von Tagen, Stunden, Minuten und Sekunden
        long tage = sekundenGesamt / (24 * 3600);
        long restSekunden = sekundenGesamt % (24 * 3600);

        long stunden = restSekunden / 3600;
        restSekunden = restSekunden % 3600;

        long minuten = restSekunden / 60;
        long sekunden = restSekunden % 60;

        // Ausgabe
        System.out.println(sekundenGesamt + " Sekunden entsprechen:");
        System.out.println(tage + " Tage " + stunden + " Stunden " + minuten + " Minuten " + sekunden + " Sekunden");

        scanner.close();
    }
}
