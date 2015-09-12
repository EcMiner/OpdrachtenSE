package opdracht13;

public class Main {

    public static void main(String[] args) {
        int tot = 0;

        for (int i = 1; i <= 10; tot += i++);

        System.out.println("Som van 1 t/m 10: " + tot);
    }

}
