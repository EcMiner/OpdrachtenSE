package opdracht35;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Geef een jaartal op om te kijken of het een schrikkeljaar is:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (isInt(input)) {
            int jaartal = Integer.parseInt(input);
            if (jaartal > 0) {
                if (jaartal % 400 == 0 || (jaartal % 4 == 0 && jaartal % 100 != 0)) {
                    System.out.println("Het jaartal " + jaartal + " is een schrikkeljaar!");
                } else {
                    System.out.println("Het jaartal " + jaartal + " is geen schrikkeljaar!");
                }
            } else {
                System.err.println("Het jaartal moet hoger dan 0 zijn");
            }
        } else {
            System.err.println("Het jaartal moet een niet-decimaal nummer zijn!");
        }
    }

    private static boolean isInt(String integer) {
        try {
            Integer.parseInt(integer);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

}
