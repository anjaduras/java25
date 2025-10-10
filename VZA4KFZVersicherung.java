import java.util.Scanner;

public class VZA4KFZVersicherung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingaben
        System.out.print("Grundbetrag (€): ");
        double grundbetrag = scanner.nextDouble();

        System.out.print("Alter des Fahrers: ");
        int alter = scanner.nextInt();

        System.out.print("Jährliche Fahrleistung (km): ");
        int kilometer = scanner.nextInt();

        System.out.print("Wird das Fahrzeug in einer Garage abgestellt? (ja/nein): ");
        String garage = scanner.next().toLowerCase();

        // Startwert
        double versicherungsbetrag = grundbetrag;

        // Altersabhängige Anpassung
        if (alter <= 25) {
            versicherungsbetrag += 0.4 * grundbetrag; // +40%
        } else {
            versicherungsbetrag -= 0.1 * grundbetrag; // -10%
        }

        // Kilometerabhängige Anpassung
        if (kilometer > 15000) {
            versicherungsbetrag += 0.2 * grundbetrag; // +20%
        } else {
            versicherungsbetrag -= 0.1 * grundbetrag; // -10%
        }

        // Garagenabhängige Anpassung
        if (garage.equals("ja")) {
            versicherungsbetrag -= 0.05 * grundbetrag; // -5%
        } else {
            versicherungsbetrag += 0.05 * grundbetrag; // +5%
        }

      
        System.out.printf("%nDer zu zahlende Versicherungsbetrag beträgt: %.2f €%n", versicherungsbetrag);

        scanner.close();
    }
}

  // naja muss man noch alles anpassen when i will understand it