package opdracht44;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("###.##");
        System.out.println("Wat is uw startkapitaal?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (isDouble(input)) {
            double startKapitaal = Double.parseDouble(input);
            if (startKapitaal > 0) {
                double eindKapitaal = startKapitaal;
                for (int i = 0; i < 5; i++) {
                    eindKapitaal *= 1.05;
                }
                System.out.println("Uw startkapitaal van €" + format.format(rondAf(startKapitaal, 2)) + " is na 5 jaar: €" + format.format(rondAf(eindKapitaal, 2)));
            } else {
                System.err.println("Het startkapitaal moet hoger dan 0 zijn!");
            }
        } else {
            System.err.println("Het startkapitaal moet een (decimaal) nummer zijn!");
        }
    }

    private static double rondAf(double value, int decimalen) {
        return Math.round((value * Math.pow(10, decimalen))) / Math.pow(10, decimalen);
    }

    private static boolean isDouble(String value) {
        try {
            Double.parseDouble(value);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
