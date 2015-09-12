package opdracht31;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("###.##");
        System.out.println("Geef een prijs om de btw te berekenen:");
        double prijs = vraagGebrokenGetal();
        if (prijs != -1) {
            if (prijs > 0) {
                double btw = berekenBtw(prijs);

                System.out.println("Prijs: €" + format.format(rondAf(prijs, 2)));
                System.out.println("BTW: €" + format.format(rondAf(btw, 2)));
                System.out.println("Prijs + BTW: " + format.format(rondAf(prijs + btw, 2)));
            } else {
                System.err.println("De prijs moet hoger dan 0 zijn!");
            }
        } else {
            System.err.println("De prijs moet een (decimaal) getal zijn!");
        }
    }

    private static double rondAf(double value, int decimalen) {
        return Math.round((value * Math.pow(10, decimalen))) / Math.pow(10, decimalen);
    }

    private static double vraagGebrokenGetal() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (isDouble(input)) {
            double value = Double.parseDouble(input);
            return value < 0 ? 0 : value;
        } else {
            return -1;
        }
    }

    private static double berekenBtw(double bedrag) {
        return bedrag * .19;
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
