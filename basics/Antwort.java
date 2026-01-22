// Kompiliere mit: java Antwort.java
public class Antwort {

    enum Laune { GELASSEN, HMPF, KAFFEEBEDUERFTIG }
    static final String ABSENDER = "Lukas";
    static final String EMPFAENGER = "Uwe";
    static final Laune HEUTIGE_LAUNE = Laune.GELASSEN;

    public static void main(String[] args) {
        var msg = new StringBuilder();

        msg.append(salut()).append("\n\n");
        msg.append(body()).append("\n\n");
        msg.append(footer());

        System.out.println(msg);
    }

    private static String salut() {
        return "Hey " + EMPFAENGER + ",";
    }

    private static String body() {
        // Disclaimer: Enthält Spuren von Nostalgie, Minecraft und Kaffee.
        String javaOriginStory =
            "mit Java hat bei mir alles angefangen \uD83D\uDE04. " +
            "Als ich 12 war und alle Minecraft gespielt haben, habe ich Plugins für Server geschrieben. " +
            "In der Schule hatten wir Java und an der Uni war Info 2 auch Java. " +
            "Kurz: Ich spreche fließend public static void main(String[] args).";

        String annaSupport =
            "\n\nZu Anna: Ich helfe ihr sehr gern. " +
            "Wenn der Lehrer aus dem Klassenzimmer despawnt, machen wir eben Self-Study :)" +
            "Schick mir einfach Themen/Stoff oder ein paar Übungsaufgaben, dann können wir uns das ansehen.";

        String bonus =
            "\n\nOptionen:\n" +
            "  1) Quick-Fix-Call (15–30 min) für akute Compiler-Heulkrämpfe\n" +
            "  2) Lernplan \"Java\" (Klassen, Objekte, Vererbung...)\n" +
            "  3) Debug-Session: Wir jagen gemeinsam den NullPointer \uD83D\uDC3E";

        return javaOriginStory + annaSupport + bonus;
    }

    private static String footer() {
        return "\nHerzliche Grüße aus Stuttgart,\n" +
               ABSENDER + " " + emojiNachLaune();
    }

    private static String emojiNachLaune() {
        return switch (HEUTIGE_LAUNE) {
            case GELASSEN -> "\u2615\uFE0F";
            case HMPF -> "\uD83D\uDE44";
            case KAFFEEBEDUERFTIG -> "\uD83D\uDE34 \u2192 \u2615\uFE0F";
        };
    }

    // TODO: Wenn Lehrer erneut flieht, try { UnterrichtSelbstMachen(); } catch (MotivationException e) { Kaffee.nachfuellen(); }
}