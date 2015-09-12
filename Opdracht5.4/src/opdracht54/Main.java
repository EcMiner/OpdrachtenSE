package opdracht54;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] kleuters = new int[10];
        int[] kinderen = new int[10];
        int[] volwassenen = new int[10];

        System.out.println("Geef een aantal leeftijden op om ze te categoriseren. Voer 0 in om het einde aan te geven.");
        Scanner scanner = new Scanner(System.in);

        int klIndex = 0;
        int kiIndex = 0;
        int vIndex = 0;

        int klHoogst = 0;
        int kiHoogst = 0;
        int vHoogst = 0;

        int klTotaal = 0;
        int kiTotaal = 0;
        int vTotaal = 0;

        String klIngevoerd = "";
        String kiIngevoerd = "";
        String vIngevoerd = "";

        String input;
        while ((input = scanner.nextLine()) != null) {
            if (isInt(input)) {
                int leeftijd = Integer.parseInt(input);
                if (leeftijd == 0) {
                    if (klIndex > 0 || kiIndex > 0 || vIndex > 0) {
                        break;
                    } else {
                        System.err.println("Je moet in ieder geval een getal invullen dat groter dan 0 is.");
                    }
                } else if (leeftijd < 0) {
                    System.err.println("De leeftijd moet hoger dan 0 zijn!");
                } else {
                    if (leeftijd >= 1 && leeftijd <= 3) {
                        kleuters[klIndex] = leeftijd;
                        ++klIndex;

                        klTotaal += leeftijd;

                        if (leeftijd > klHoogst) {
                            klHoogst = leeftijd;
                        }
                        klIngevoerd += ", " + leeftijd;
                    } else if (leeftijd >= 4 && leeftijd <= 17) {
                        kinderen[kiIndex] = leeftijd;
                        ++kiIndex;

                        kiTotaal += leeftijd;

                        if (leeftijd > kiHoogst) {
                            kiHoogst = leeftijd;
                        }
                        kiIngevoerd += ", " + leeftijd;
                    } else if (leeftijd >= 18) {
                        volwassenen[vIndex] = leeftijd;
                        ++vIndex;

                        vTotaal += leeftijd;

                        if (leeftijd > vHoogst) {
                            vHoogst = leeftijd;
                        }
                        vIngevoerd += ", " + leeftijd;
                    }
                }
            } else {
                System.err.println("Het getal dat je hebt ingevoerd is geen niet-decimaal getal!");
            }
        }
        System.out.println("Kleuters:");
        System.out.println("Ingevoerde leeftijden: " + (klIngevoerd.length() > 2 ? klIngevoerd.substring(2) : ""));
        System.out.println("Hoogste leeftijd: " + klHoogst);
        System.out.println("Gemiddelde leeftijd: " + (klTotaal / (klIndex + 1)));
        System.out.println("\nKinderen:");
        System.out.println("Ingevoerde leeftijden: " + (kiIngevoerd.length() > 2 ? kiIngevoerd.substring(2) : ""));
        System.out.println("Hoogste leeftijd: " + kiHoogst);
        System.out.println("Gemiddelde leeftijd: " + (kiTotaal / (kiIndex + 1)));
        System.out.println("\nVolwassenen:");
        System.out.println("Ingevoerde leeftijden: " + (vIngevoerd.length() > 2 ? vIngevoerd.substring(2) : ""));
        System.out.println("Hoogste leeftijd: " + vHoogst);
        System.out.println("Gemiddelde leeftijd: " + (vTotaal / (vIndex + 1)));
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
