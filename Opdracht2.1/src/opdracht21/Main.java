package opdracht21;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Geef 2 (decimale) getallen om de grootste en de kleinste waarde te zien.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double g1;
        double g2;

        if (isDouble(input)) {
            g1 = Double.parseDouble(input);
        } else {
            System.err.println("Het eerte getal moet een (decimaal) getal zijn!");
            return;
        }
        input = scanner.nextLine();
        if (isDouble(input)) {
            g2 = Double.parseDouble(input);
        } else {
            System.err.println("Het tweede getal moet een (decimaal) getal zijn!");
            return;
        }
        System.out.println("Grootste waarde: " + Math.max(g1, g2));
        System.out.println("Kleinste waarde: " + Math.min(g1, g2));
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
