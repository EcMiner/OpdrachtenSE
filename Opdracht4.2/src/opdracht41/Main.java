package opdracht41;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Voer een aantal getallen in. Voer 0 als je klaar bent met getallen invullen.");
        Scanner scanner = new Scanner(System.in);

        String line;
        while ((line = scanner.nextLine()) != null) {
            if (isDouble(line)) {
                double d = Double.parseDouble(line);
                if (d > 0 && d % 5 == 0) {
                    System.out.println(d + " is deelbaar door 5!");
                } else if (d == 0) {
                    break;
                }
            } else {
                System.err.println("Het getal moet een (decimaal) getal zijn!");
            }
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

}
