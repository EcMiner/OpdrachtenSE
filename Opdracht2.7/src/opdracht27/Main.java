package opdracht27;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gewicht;
        double lengte;
        Geslacht geslacht;

        System.out.println("Wat is uw gewicht (in kg)?");
        String input = scanner.nextLine();
        if (isDouble(input)) {
            gewicht = Double.parseDouble(input);
        } else {
            System.err.println("Uw gewicht moet een (decimaal) nummer zijn!");
            return;
        }

        System.out.println("Wat is uw lengte (in cm)?");
        input = scanner.nextLine();
        if (isDouble(input)) {
            lengte = Double.parseDouble(input);
        } else {
            System.err.println("Uw lengte moet een (decimaal) nummer zijn!");
            return;
        }
        System.out.println("Wat is uw geslacht?");
        input = scanner.nextLine();
        geslacht = Geslacht.getFromString(input);
        if (geslacht == null) {
            System.err.println("U heeft een onbekend geslacht ingevoerd! (moet zijn: m, man, v, vrouw).");
            return;
        }
        double bmi = gewicht / Math.pow(lengte / 100, 2);
        System.out.println("Uw BMI is: " + bmi);
        System.out.println("De normale BMI waarde van uw geslacht ligt tussen " + geslacht.getNormaalMin() + " en " + geslacht.getNormaalMax());
        System.out.println("Het gezonde gewicht bij uw lengte ligt tussen " + lengteEnBMINaarGewicht(lengte, geslacht.getNormaalMin()) + " en " +lengteEnBMINaarGewicht(lengte, geslacht.getNormaalMax()));
    }

    private static double lengteEnBMINaarGewicht(double lengte, double bmi) {
        return bmi * (Math.pow(lengte / 100, 2));
    }

    private static boolean isDouble(String value) {
        try {
            Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private static enum Geslacht {

        MAN(20, 25), VROUW(19, 24);

        private final int normaalMin;
        private final int normaalMax;

        private Geslacht(int normaalMin, int normaalMax) {
            this.normaalMin = normaalMin;
            this.normaalMax = normaalMax;
        }

        public int getNormaalMin() {
            return normaalMin;
        }

        public int getNormaalMax() {
            return normaalMax;
        }

        public static Geslacht getFromString(String value) {
            return value != null ? (value.equalsIgnoreCase("m") || value.equalsIgnoreCase("man") ? MAN : (value.equalsIgnoreCase("v") || value.equalsIgnoreCase("vrouw") ? VROUW : null)) : null;
        }
    }

}
