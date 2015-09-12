package opdracht17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("###.##");
        System.out.println("Geef een prijs in Euro's die u wil omrekenen in US Dollars");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (isDouble(input)) {
            double euros = Double.parseDouble(input);
            double dollars = euros * 1.117635;
            System.out.println("€" + format.format(rondAf(euros, 2)) + " is: $" + format.format(rondAf(dollars, 2)));
        } else {
            System.err.println("De prijs in Euro's moet een (decimaal) nummer zijn!");
        }
    }

    private static double rondAf(double value, int decimalen) {
        return Math.round((value * Math.pow(10, decimalen))) / Math.pow(10, decimalen);
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
