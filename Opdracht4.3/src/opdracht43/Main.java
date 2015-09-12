package opdracht43;

public class Main {
    
    public static void main(String[] args) {
        String message = "De eerste 20 getallen van de Fibonacci reeks zijn: ";
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            if (i >= 2) {
                array[i] = array[i - 1] + array[i - 2];
            } else {
                array[i] = 1;
            }
            message += array[i] + ", ";
        }
        System.out.println(message.substring(0, message.length() - 2));
    }
    
}
