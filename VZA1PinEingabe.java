import java.util.Scanner;

public class VZA1PinEingabe {

    public static void main(String[] args) {
        final String KORREKTE_PIN = "2884";  // festgelegte PIN
        Scanner scanner = new Scanner(System.in);

        System.out.println("Handy wird eingeschaltet...");
        System.out.print("Bitte geben Sie Ihre PIN ein: ");
        String eingabe = scanner.nextLine().trim();

        if (eingabe.equals(KORREKTE_PIN)) {
            System.out.println("✅ PIN korrekt. Willkommen!");
        } else {
            System.out.println("❌ Falsche PIN. Zugriff verweigert.");
        }

        scanner.close();
    }
}
