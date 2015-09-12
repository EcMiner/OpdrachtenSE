package opdracht41;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Voer een aantal getallen in om het gemiddelde van de positieve getallen te berekenen. Voer 0 als je klaar bent met getallen invullen.");
        List<Double> list = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);

        String line;
        while ((line = scanner.nextLine()) != null) {
            if (isDouble(line)) {
                double d = Double.parseDouble(line);
                if (d > 0) {
                    list.add(d);
                } else if (d == 0) {
                    break;
                }
            } else {
                System.err.println("Het getal moet een (decimaal) getal zijn!");
            }
        }
        double gemiddelde = 0;
        for (double d : list) {
            gemiddelde += d;
        }
        System.out.println("Het gemiddelde van de " + list.size() + " positieve nummers is: " + (gemiddelde / list.size()));
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
