package opdracht55;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[6];

        for (int i = 0; i < 6000; i++) {
            int rand = random.nextInt(6);
            array[rand] = array[rand] + 1;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("Nummer " + (i + 1) + " is " + array[i] + " keer gegooid");
        }
    }

}
