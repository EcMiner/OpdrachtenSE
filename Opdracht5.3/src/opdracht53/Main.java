package opdracht53;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Voer een aantal getallen in (maximaal 20). Voer 0 in om het einde aan te geven.");
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[20];
        int index = 0;
        String input;
        while ((input = scanner.nextLine()) != null) {
            if (isInt(input)) {
                int getal = Integer.parseInt(input);
                if (getal == 0) {
                    if (index >= 1) {
                        break;
                    } else {
                        System.err.println("Je moet in ieder geval 1 getal invullen dat geen 0 is!");
                    }
                } else {
                    if (index < array.length) {
                        array[index] = getal;
                        ++index;
                    }
                }
            } else {
                System.err.println("Het nummer dat u heeft ingevuld is geen niet-decimaal getal!");
            }
        }

        System.out.println("Voer een getal in om in de opgegeven nummers te zoeken hoe vaak het aanwezig is.");
        input = scanner.nextLine();
        while (!isInt(input)) {
            System.err.println("Het opgegeven getal is geen niet-decimaal getal!");
            input = scanner.nextLine();
        }

        int aanwezig = 0;
        int zoek = Integer.parseInt(input);
        for (int i = 0; i < index; i++) {
            if (array[i] == zoek) {
                ++aanwezig;
            }
        }
        System.out.println("Het getal " + zoek + " is " + aanwezig + " keer aanwezig in de opgegeven getallen.");
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
