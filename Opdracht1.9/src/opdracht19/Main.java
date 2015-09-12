package opdracht19;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Geef de tijd in seconden om het om te rekenen naar uren, minuten, en seconden");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (isInt(input)) {
            int gegeven = Integer.parseInt(input);
            if (gegeven > 0) {
                int uren = 0;
                int minuten = 0;
                int seconden = 0;

                if (gegeven >= 3600) {
                    uren = (gegeven - (gegeven % 3600)) / 3600;
                    gegeven -= uren * 3600;
                }
                if (gegeven >= 60) {
                    minuten = (gegeven - (gegeven % 60)) / 60;
                    gegeven -= minuten * 60;
                }
                seconden = gegeven;

                System.out.println(uren + " uur");
                System.out.println(minuten + (minuten != 1 ? " minuten" : " minuut"));
                System.out.println(seconden + (seconden != 1 ? " seconden" : " seconde"));
            } else {
                System.out.println("De tijd in seconden moet hoger zijn dan 0!");
            }
        } else {
            System.out.println("De tijd in seconden moet een niet-decimaal nummer zijn!");
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
