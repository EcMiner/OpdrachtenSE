package opdracht33;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Voer twee getallen in om ze bij elkaar op te tellen:");
        Scanner scanner = new Scanner(System.in);

        int n1;
        int n2;

        String input = scanner.nextLine();
        if (isInt(input)) {
            n1 = toInt(input);
        } else {
            System.err.println("Het eerste getal moet een niet-decimaal nummer zijn!");
            return;
        }

        input = scanner.nextLine();
        if (isInt(input)) {
            n2 = toInt(input);
        } else {
            System.err.println("Het tweede getal moet een niet-decimaal nummer zijn!");
            return;
        }
        System.out.println("De som van de twee getallen is: " + som(n1, n2));
    }

    private static boolean isInt(String value) {
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private static int toInt(String boodschap) {
        return Integer.parseInt(boodschap);
    }

    private static int som(int n1, int n2) {
        return n1 + n2;
    }

}
