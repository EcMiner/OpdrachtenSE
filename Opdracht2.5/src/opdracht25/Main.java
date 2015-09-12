package opdracht25;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Geef twee getallen om te bepalen of het ene getal een veelvoud is van het andere:");
        Scanner scanner = new Scanner(System.in);
        String input;
        double g1;
        double g2;

        input = scanner.nextLine();
        if (isDouble(input)) {
            g1 = Double.parseDouble(input);
        } else {
            System.out.println("Het eerste getal moet een (decimaal) nummer zijn!");
            return;
        }
        input = scanner.nextLine();
        if (isDouble(input)) {
            g2 = Double.parseDouble(input);
        } else {
            System.out.println("Het tweede getal moet een (decimaal) nummer zijn!");
            return;
        }
        System.out.println("Het ene getal is " + (g1 % g2 == 0 ? "een" : "geen") + " veelvoud van het andere getal!");
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
