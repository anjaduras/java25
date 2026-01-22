import java.util.Scanner;

public class VZA2PasswortCheck {

    public static void main(String[] args) {
        final String KORREKTES_PASSWORT = "zmQ15!3Z";  // festgelegtes Passwort
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie Ihr Passwort ein: ");
        String eingabe = scanner.nextLine();

        if (eingabe.equals(KORREKTES_PASSWORT)) {
            System.out.println("✅ Passwort korrekt. Zugriff gewährt.");
        } else {
            System.out.println("❌ Falsches Passwort. Zugriff verweigert.");
        }

        scanner.close();
    }
}
