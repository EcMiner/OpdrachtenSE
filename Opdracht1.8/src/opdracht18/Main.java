package opdracht18;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("###.#");
        double totalPoints = 100d;

        System.out.println("Geef het aantal punten (0-100) om het cijfer te berekenen.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (isInt(input)) {
            double punten = (double) Integer.parseInt(input);
            if (punten >= 0 && punten <= 100) {
                double cijfer = ((totalPoints / (totalPoints - (totalPoints * .25))) * (punten - (totalPoints * .25)) / 10) + 1;
                if (cijfer > 10) {
                    cijfer = 10;
                }
                System.out.println("Het cijfer is: " + format.format(rondAf(cijfer, 1)));
            } else {
                System.err.println("Het behaalde aantal punten moet 0 of hoger zijn, en 100 of lager zijn!");
            }
        } else {
            System.err.println("Het behaalde aantal punten moet een niet-decimaal nummer zijn!");
        }
    }

    private static double rondAf(double value, int decimalen) {
        return Math.round((value * Math.pow(10, decimalen))) / Math.pow(10, decimalen);
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
