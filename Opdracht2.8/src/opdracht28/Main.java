package opdracht28;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int werkUren;
        int machineLeeftijd;
        int storingenPerJaar;

        System.out.println("Hoeveel werkuren heeft uw metaaldraaibank?");
        String input = scanner.nextLine();
        if (isInt(input)) {
            werkUren = Integer.parseInt(input);
            if (werkUren < 0) {
                System.err.println("Het aantal werkuren moet hoger of gelijk zijn aan 0!");
                return;
            }
        } else {
            System.err.println("Het aantal werkuren moet een niet-decimaal nummer zijn!");
            return;
        }
        System.out.println("Hoe oude is uw metaaldraaibank?");
        input = scanner.nextLine();
        if (isInt(input)) {
            machineLeeftijd = Integer.parseInt(input);
            if (machineLeeftijd < 0) {
                System.err.println("De leeftijd moet hoger of gelijk zijn aan 0!");
                return;
            }
        } else {
            System.err.println("De leeftijd moet een niet-decimaal nummer zijn!");
            return;
        }
        System.out.println("Wat is het aantal storing per jaar van uw metaaldraaibank?");
        input = scanner.nextLine();
        if (isInt(input)) {
            storingenPerJaar = Integer.parseInt(input);
            if (storingenPerJaar < 0) {
                System.err.println("Het aantal storing per jaar moet hoger of gelijk zijn aan 0!");
                return;
            }
        } else {
            System.err.println("Het aantal storing per jaar moet een niet-decimaal nummer zijn!");
            return;
        }
        if (werkUren > 10000 || machineLeeftijd >= 7 || storingenPerJaar > 25) {
            System.out.println("Uw metaaldraaibank moet vervangen worden!");
        } else {
            System.out.println("Uw metaaldraaibank hoeft niet vervangen te worden.");
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
