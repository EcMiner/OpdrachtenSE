package opdracht29;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double contributie;

        System.out.println("Welke sport doet u? (v = voetbal, h = handbal)");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("v")) {
            contributie = 175.0;
        } else if (input.equalsIgnoreCase("h")) {
            contributie = 225.0;
        } else {
            System.err.println("De sport die u heeft ingevoerd bestaat niet!");
            return;
        }

        System.out.println("Wat is uw leeftijd? (leeftijd geven als niet-decimaal nummer)");
        input = scanner.nextLine();
        if (isInt(input)) {
            int leeftijd = Integer.parseInt(input);
            if (leeftijd < 0) {
                System.err.println("De leeftijd moet hoger of gelijk zijn aan 0!");
                return;
            } else if (leeftijd > 40) {
                contributie -= 25.0;
            }
        } else {
            System.err.println("De leeftijd moet een niet-decimaal nummer zijn!");
            return;
        }
        System.out.println("Hoe lang bent u al lid?");
        input = scanner.nextLine();
        if (isInt(input)) {
            int lid = Integer.parseInt(input);
            if (lid < 0) {
                System.err.println("De tijd dat u al lid bent moet hoger of gelijk zijn aan 0!");
                return;
            } else if (lid > 10) {
                contributie -= 20;
            }
        } else {
            System.err.println("De tijd dat u al lid bent moet een niet-decimaal nummer zijn!");
            return;
        }
        System.out.println("De te betalen contributie is: €" + contributie);
    }

    private static boolean isInt(String value) {
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

}
