cdpackage opdracht23;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Geef 3 (decimale) getallen:");
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
        if (g1 > g3 && g2 > g3) {
            System.out.println("Het derde getal is het kleinste van de drie!");
        } else {
            System.out.println("Het derde getal is niet het kleinste van de drie!");
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
