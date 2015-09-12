package opdracht32;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Geef 3 (decimale) getallen om het gemiddelde ervan te berekenen:");

        double g1 = vraagGebrokenGetal();

        if (g1 == -1) {
            System.err.println("Het eerste getal moet een (decimaal) nummer zijn!");
            return;
        } else if (g1 <= 0) {
            System.err.println("Het eerste getal moet hoger zijn dan 0!");
            return;
        }

        double g2 = vraagGebrokenGetal();

        if (g2 == -1) {
            System.err.println("Het tweede getal moet een (decimaal) nummer zijn!");
            return;
        } else if (g2 <= 0) {
            System.err.println("Het tweede getal moet hoger zijn dan 0!");
            return;
        }

        double g3 = vraagGebrokenGetal();

        if (g3 == -1) {
            System.err.println("Het derde getal moet een (decimaal) nummer zijn!");
            return;
        } else if (g3 <= 0) {
            System.err.println("Het derde getal moet hoger zijn dan 0!");
            return;
        }
        System.out.println("Het gemiddelde van de drie getallen is: " + ((g1 + g2 + g3) / 3));
    }

    public static double vraagGebrokenGetal() {
        String input = scanner.nextLine();
        if (isDouble(input)) {
            double value = Double.parseDouble(input);
            return value < 0 ? 0 : value;
        } else {
            return -1;
        }
    }

    private static boolean isDouble(String value) {
        try {
            Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

}
