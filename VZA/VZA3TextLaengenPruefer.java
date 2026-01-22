import java.util.Scanner;

public class VZA3TextLaengenPruefer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie einen Text ein (8–20 Zeichen): ");
        String text = scanner.nextLine();

        int laenge = text.length();

        if (laenge >= 8 && laenge <= 20) {
            System.out.println("✅ Ihr Text lautet: " + text);
        } else {
            System.out.println("❌ Fehler: Der Text muss zwischen 8 und 20 Zeichen lang sein.");
            System.out.println("Sie haben " + laenge + " Zeichen eingegeben.");
        }

        scanner.close();
    }
}
