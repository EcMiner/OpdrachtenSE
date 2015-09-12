package opdracht52;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("###.#");

        System.out.println("Om welk vak gaat het?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String vak = input;

        System.out.println("Hoeveel studenten hebben de toets gemaakt?");
        input = scanner.nextLine();

        if (isInt(input)) {
            int aantalStudenten = Integer.parseInt(input);

            String[] studenten = new String[aantalStudenten];

            System.out.println("Wat zijn de namen van de studenten?");
            int index = 0;
            while ((input = scanner.nextLine()) != null) {
                if (index < aantalStudenten - 1) {
                    studenten[index] = input;
                    index++;
                } else {
                    studenten[index] = input;
                    break;
                }
            }

            double[] cijfers = new double[aantalStudenten];

            double totaal = 0;
            double hoogsteCijfer = 0;
            int indexVoorHoogsteCijfer = 0;

            for (int i = 0; i < studenten.length; i++) {
                System.out.println("Wat is " + studenten[i] + "'s cijfer?");
                input = scanner.nextLine();

                double cijfer = 1;
                while (!isDouble(input) || ((cijfer = Double.parseDouble(input)) < 1 || cijfer > 10)) {
                    if (cijfer < 1 || cijfer > 10) {
                        System.err.println("Het cijfer moet tussen 1 en 10 liggen! Probeer het opnieuw.");
                    } else {
                        System.err.println("Het cijfer moet een (decimaal) nummer zijn! Probeer het opnieuw.");
                    }
                    input = scanner.nextLine();
                }
                cijfer = Double.parseDouble(input);
                cijfers[i] = cijfer;
                totaal += cijfer;
                if (cijfer > hoogsteCijfer) {
                    hoogsteCijfer = cijfer;
                    indexVoorHoogsteCijfer = i;
                }
            }

            System.out.println("Het gemiddelde cijfer is een " + format.format(rondAf(totaal / cijfers.length, 1)));
            System.out.println("Het hoogst behaalde cijfer voor het vak " + vak + " is een " + format.format(rondAf(hoogsteCijfer, 1)) + " behaald door " + studenten[indexVoorHoogsteCijfer]);
            System.out.println("Het volledige overzicht van de behaalde cijfers:");
            for (int i = 0; i < studenten.length; i++) {
                System.out.println(studenten[i] + ": " + format.format(rondAf(cijfers[i], 1)));
            }
        } else {
            System.err.println("Het aantal studenten moet een niet-decimaal nummer zijn!");
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

    private static boolean isInt(String value) {
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

}
