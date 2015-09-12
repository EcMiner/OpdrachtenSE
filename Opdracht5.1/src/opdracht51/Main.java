package opdracht51;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];

        String message = "De twintig willekeurige getallen zijn: ";

        int min = 151;
        int minDupAmount = 0;
        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt(150);
            if (array[i] < min) {
                min = array[i];
                minDupAmount = 1;
            } else if (min == array[i]) {
                ++minDupAmount;
            }
            message += array[i] + ", ";
        }
        System.out.println(message.substring(0, message.length() - 2));
        System.out.println("Het kleinste getal is: " + min + " en komt " + minDupAmount + " keer voor.");
    }

}
