import java.util.Scanner;
public class ErsteEingabe {
 public static void main(String[] args) {
 int zahl;
 Scanner keyboard = new Scanner(System.in);
 System.out.print("Bitte eine Zahl eingeben: ");
 zahl = keyboard.nextInt();
 System.out.println("Sie haben die Zahl " + zahl + " eingegeben.");
 }
}