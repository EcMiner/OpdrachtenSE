package opdracht210;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("###.##");
        System.out.println("Wat is uw maandsalaris?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (isDouble(input)) {
            double salaris = Double.parseDouble(input);
            if (salaris > 0) {
                double verhoging = Math.max(75, salaris * .05);
                System.out.println("Uw verhoging is: €" + format.format(rondAf(verhoging, 2)));
                System.out.println("Uw nieuwe maandsalaris word: €" + format.format(rondAf(salaris + verhoging, 2)));
            } else {
                System.err.println("Uw maandsalaris moet hoger dan €0,- zijn!");
            }
        } else {
            System.err.println("Uw maandsalaris moet een (decimaal) nummer zijn!");
        }
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
