package opdracht45;

public class Main {

    public static void main(String[] args) {
        int n = 20;

        int som1 = 0;

        for (int i = 1; i <= n; som1 += i++);

        System.out.println("Som op de eerste manier gedaan: " + som1);

        int som2 = n * (n + 1) / 2;

        System.out.println("Som op de tweede manier gedaan: " + som2);

        System.out.println("Het resultaat van beide manieren komt " + (som1 == som2 ? "" : "niet ") + " met elkaar overeen.");
    }

}
