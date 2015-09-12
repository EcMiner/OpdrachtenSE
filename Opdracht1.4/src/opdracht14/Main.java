package opdracht14;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("###.##");
        System.out.println("Geef een prijs om de btw te berekenen:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (isDouble(input)) {
            double prijs = Double.parseDouble(input);
            double btw = prijs * .19;

            System.out.println("Prijs: €" + format.format(rondAf(prijs, 2)));
            System.out.println("BTW: €" + format.format(rondAf(btw, 2)));
            System.out.println("Prijs + BTW: " + format.format(rondAf(prijs + btw, 2)));
        } else {
            System.err.println("De prijs moet (decimaal) een nummer zijn!");
        }
        scanner.close();
    }

    private static double rondAf(double value, int decimalen) {
        return Math.round((value * Math.pow(10, decimalen))) / Math.pow(10, decimalen);
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
