package opdracht34;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef de waarde die u wil omrekenen:");
        String input = scanner.nextLine();
        if (isDouble(input)) {
            double waarde = Double.parseDouble(input);
            if (waarde >= 0) {
                System.out.println("Geef de code voor het omrekenen (C2K, C2F of F2C)");
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("c2k") || input.equalsIgnoreCase("c2f") || input.equalsIgnoreCase("f2c")) {
                    switch (input.toLowerCase()) {
                        case "c2k":
                            System.out.println(waarde + " Celsius naar Kelvin is: " + Cel2Kel(waarde));
                            break;
                        case "c2f":
                            System.out.println(waarde + " Celsius naar Fahrenheit is: " + Cel2Fahr(waarde));
                            break;
                        case "f2c":
                            System.out.println(waarde + " Fahrenheit naar Celsius is: " + Fahr2Cel(waarde));
                            break;
                    }
                } else {
                    System.err.println("De code die u heeft ingevoerd bestaat niet!");
                }
            } else {
                System.err.println("De waarde moet hoger of gelijk zijn aan 0!");
            }
        } else {
            System.err.println("De waarde moet een (decimaal) getal zijn!");
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

    private static double Cel2Kel(double cel) {
        return 273.0 + cel;
    }

    private static double Cel2Fahr(double cel) {
        return 9.0 / 5.0 * cel + 32;
    }

    private static double Fahr2Cel(double fahr) {
        return 5.0 / 9.0 * (fahr - 32);
    }

}
