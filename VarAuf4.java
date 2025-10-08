import java.util.Scanner;

public class VarAuf4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der zurückgelegten Strecke
        System.out.print("Geben Sie die zurückgelegte Strecke in km ein: ");
        double strecke = scanner.nextDouble();

        // Eingabe der verbrauchten Kraftstoffmenge
        System.out.print("Geben Sie die verbrauchte Kraftstoffmenge in Litern ein: ");
        double kraftstoff = scanner.nextDouble();

        // Berechnung des durchschnittlichen Verbrauchs auf 100 km
        double verbrauchPro100km = (kraftstoff / strecke) * 100;

        // Ausgabe
        System.out.printf("Der durchschnittliche Kraftstoffverbrauch beträgt: %.2f Liter/100km\n", verbrauchPro100km);

        scanner.close();
    }
}