package opdracht22;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Geef een getal (1-4):");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (isInt(input)) {
            int getal = Integer.parseInt(input);
            if (getal >= 1 && getal <= 4) {
                String[] array = new String[]{"klaveren", "ruiten", "harten", "schoppen"};
                System.out.println("Resultaat: " + array[getal - 1]);
            } else {
                System.err.println("Het getal mag allee: 1, 2, 3 of 4 zijn!");
            }
        } else {
            System.err.println("Het getal moet een niet-decimaal getal zijn!");
        }
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
