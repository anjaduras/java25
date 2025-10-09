import java.math.BigInteger;
import java.util.Scanner;

public class IbanRechner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe: Bankleitzahl
        System.out.print("Bitte geben Sie die 8-stellige Bankleitzahl ein: ");
        String blz = scanner.nextLine().trim();
        while (blz.length() != 8 || !blz.matches("\\d+")) {
            System.out.print("Ungültige BLZ. Bitte 8-stellig eingeben: ");
            blz = scanner.nextLine().trim();
        }

        // Eingabe: Kontonummer
        System.out.print("Bitte geben Sie die Kontonummer ein: ");
        String konto = scanner.nextLine().trim();
        while (!konto.matches("\\d+")) {
            System.out.print("Ungültige Kontonummer. Bitte nur Ziffern eingeben: ");
            konto = scanner.nextLine().trim();
        }

        // Kontonummer auf 10 Stellen mit führenden Nullen auffüllen
        konto = String.format("%10s", konto).replace(' ', '0');

        // Schritt 1: Temporäre IBAN ohne Prüfziffer ("DE00" → "131400")
        String bban = blz + konto;
        String landesCodeAlsZahl = "131400"; // D = 13, E = 14
        String ibanNumeric = bban + landesCodeAlsZahl;

        // Schritt 2: Modulo 97 berechnen
        BigInteger bigIban = new BigInteger(ibanNumeric);
        int mod97 = bigIban.mod(BigInteger.valueOf(97)).intValue();

        // Schritt 3: Prüfziffer berechnen
        int pruefziffer = 98 - mod97;
        String pruefzifferStr = (pruefziffer < 10) ? "0" + pruefziffer : String.valueOf(pruefziffer);

        // Schritt 4: Endgültige IBAN
        String iban = "DE" + pruefzifferStr + bban;

        System.out.println("\nBerechnete IBAN: " + iban);
        System.out.println("IBAN-Länge: " + iban.length() + " Zeichen");

        scanner.close();
    }
}
