package opdracht15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Geef 3 (decimale) getallen om het gemiddelde ervan te berekenen:");
        Scanner scanner = new Scanner(System.in);
        String input;
        double g1;
        double g2;
        double g3;

        input = scanner.nextLine();
        if (isDouble(input)) {
            g1 = Double.parseDouble(input);
        } else {
            System.out.println("Het eerste getal moet een (decimaal) nummer zijn!");
            return;
        }
        input = scanner.nextLine();
        if (isDouble(input)) {
            g2 = Double.parseDouble(input);
        } else {
            System.out.println("Het tweede getal moet een (decimaal) nummer zijn!");
            return;
        }
        input = scanner.nextLine();
        if (isDouble(input)) {
            g3 = Double.parseDouble(input);
        } else {
            System.out.println("Het derde getal moet een (decimaal) nummer zijn!");
            return;
        }
        System.out.println("Het gemiddelde van de drie getallen is: " + ((g1 + g2 + g3) / 3));
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
