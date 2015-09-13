package opdracht17;

import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class Main {

    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("###.##");
        System.out.println("Geef een prijs in Euro's die u wil omrekenen in US Dollars");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (isDouble(input)) {
            double euros = Double.parseDouble(input);
            double dollars = euros * getEURtoUSDRate();
            System.out.println("€" + format.format(rondAf(euros, 2)) + " is: $" + format.format(rondAf(dollars, 2)));
        } else {
            System.err.println("De prijs in Euro's moet een (decimaal) nummer zijn!");
        }
    }

    public static double getEURtoUSDRate() {
        try {
            URL url = new URL("http://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20%28%22EURUSD%22%29&env=store://datatables.org/alltableswithkeys");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(url.openStream());

            Element element = (Element) doc.getElementsByTagName("rate").item(0);
            return Double.parseDouble(element.getElementsByTagName("Rate").item(0).getTextContent());
        } catch (ParserConfigurationException | IOException | SAXException | DOMException | NumberFormatException e) {
            return 1.117635;
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
