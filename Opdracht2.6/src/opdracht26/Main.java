package opdracht26;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Geef het aantal behaalde punten (0-100):");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (isInt(input)) {
            int score = Integer.parseInt(input);
            if (score >= 0 && score <= 100) {
                char letter;
                if (score < 60) {
                    letter = 'F';
                } else if (score >= 60 && score < 70) {
                    letter = 'D';
                } else if (score >= 70 && score < 80) {
                    letter = 'C';
                } else if (score >= 80 && score < 90) {
                    letter = 'B';
                } else {
                    letter = 'A';
                }
                System.out.println("Het behaalde letter is " + letter + ". Je hebt het vak " + (score >= 70 ? "" : "niet") + " gehaald.");
            } else {
                System.err.println("Het aantal behaalde punten moet tussen 0 en 100 liggen!");
            }
        } else {
            System.err.println("Het aantal behaalde punten moet een niet-decimaal nummer zijn!");
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
