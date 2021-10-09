import java.util.Scanner;

/**
 * @author Maajid Saidy ( MJ )
 * @doel simpele rekenmachine
 */

public class Main {
    //      main method
    public static void main(String[] args) {
//      scanner wordt aangemaakt onder de naam input
        Scanner input = new Scanner(System.in);

        char karakter;
//        in deze do-while loop wordt er als eerst gevraagd naar een symbool en dan wordt die gecheckt in de isgeldig karakter methode, en als die geldig is wordt er gevraagd om 2 getallen en het antwoord berekend in de printBerekening methode. als dat niet zo is wordt er weergeven dat dit geen geldig karakter is en gaat de loop opnieuw.
        do {
            System.out.print("Operator (S = stoppen): ");
            String symbool = input.next();
            karakter = symbool.charAt(0);

            if (isGeldigekarakter(karakter)) {
                System.out.print("Eerste getal: ");
                double eersteGetal = input.nextDouble();

                System.out.print("Tweede getal: ");
                double tweedeGetal = input.nextDouble();

                printBerekening(eersteGetal, tweedeGetal, karakter);
            } else {
                System.out.println("dit is geen geldige karakter");
            }
        } while (karakter != 'S');
    }

    //      hier is een methode geschreven waar alle variabelen bij een worden genomen om het antwoord te berekenen.
    public static void printBerekening(double eersteGetal, double tweedeGetal, char karakter) {
        switch (karakter) {
            case '+':
                System.out.println("het antwoord is: " + (eersteGetal + tweedeGetal));
                System.out.println("");
                break;
            case '-':
                System.out.println("het antwoord is: " + (eersteGetal - tweedeGetal));
                System.out.println("");
                break;
            case '*':
                System.out.println("het antwoord is: " + (eersteGetal * tweedeGetal));
                System.out.println("");
                break;
            case '/':
                System.out.println("het antwoord is: " + (eersteGetal / tweedeGetal));
                System.out.println("");
                break;
            case '%':
                System.out.println("het antwoord is: " + (eersteGetal % tweedeGetal));
                System.out.println("");
                break;
        }
    }

    //    in deze methode wordt gevalideeert of er een juist karakter ingevoerd is
    public static boolean isGeldigekarakter(char karakter) {
        if (karakter == '+' || karakter == '-' || karakter == '*' || karakter == '/' || karakter == '%') {
            return true;
        }
        return false;
    }
}