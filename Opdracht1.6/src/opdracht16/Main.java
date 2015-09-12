package opdracht16;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String naam = JOptionPane.showInputDialog("Wat is uw naam?");
        String leeftijd = JOptionPane.showInputDialog("Hallo, " + naam + ", wat is uw leeftijd?");
        while (!isInt(leeftijd)) {
            leeftijd = JOptionPane.showInputDialog("Sorry, " + naam + ", maar de leeftijd die u heeft ingevoerd is geen getal, probeer het opnieuw");
        }
        JOptionPane.showMessageDialog(null, "Hallo, " + naam + ", uw leeftijd is " + leeftijd + ". U mag " + (Integer.parseInt(leeftijd) < 18 ? "geen " : "") + " alcohol drinken.");
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
