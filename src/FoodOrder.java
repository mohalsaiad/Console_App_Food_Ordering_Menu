import java.util.InputMismatchException;
import java.util.Scanner;

public class FoodOrder {

    // Food Menu
    int frenchFries = 100;
    int burger = 120;
    int pastry = 100;
    int pizza = 200;
    int coldCoffee = 100;
    int coldDrink = 80;
    int iceTea = 80;

    int quantity;
    static int total;

    int ch;
    Scanner sc = new Scanner(System.in);
    String again;

    // Displaying the Menu
    public void displayMenu() {
        System.out.println("**************** Willkommen in unserem Café ****************");
        System.out.println("=====================================================");
        System.out.println("           1.Pommes Frites          100/-");
        System.out.println("           2.Burger                 120/-");
        System.out.println("           3.Gebäck                 100/-");
        System.out.println("           4.Kalte Getränke         80/- ");
        System.out.println("           5.Eiskaffee              100/-");
        System.out.println("           6.Pizza                  200/-");
        System.out.println("           7.Eistee                 80/- ");
        System.out.println("           8.Beenden                     ");
        System.out.println("======================================================");
        System.out.println("          Was möchten Sie heute bestellen?");
    }

    // Generating the Bill
    public void generateBill() {
        System.out.println();
        System.out.println("***************** Vielen Dank für Ihre Bestellung ******************");
        System.out.println("**************** Ihre Rechnung beträgt: " + total + " *****************");
    }

    // Ordering food method
    public void order() {
        while (true) {
            try {
                System.out.println("Bitte geben Sie Ihre Wahl ein:");
                ch = sc.nextInt();

                switch (ch) {
                    case 1: // French Fries
                        System.out.println("Sie haben Pommes Frites ausgewählt.");
                        System.out.println();
                        System.out.println("Geben Sie die gewünschte Menge ein: ");
                        quantity = sc.nextInt();
                        total = total + quantity * frenchFries;
                        break;

                    case 2: // Burger
                        System.out.println("Sie haben Burger ausgewählt.");
                        System.out.println();
                        System.out.println("Geben Sie die gewünschte Menge ein: ");
                        quantity = sc.nextInt();
                        total = total + quantity * burger;
                        break;

                    case 3: // Pastry
                        System.out.println("Sie haben Gebäck ausgewählt.");
                        System.out.println();
                        System.out.println("Geben Sie die gewünschte Menge ein: ");
                        quantity = sc.nextInt();
                        total = total + quantity * pastry;
                        break;

                    case 4: // Cold Drinks
                        System.out.println("Sie haben Kalte Getränke ausgewählt.");
                        System.out.println();
                        System.out.println("Geben Sie die gewünschte Menge ein: ");
                        quantity = sc.nextInt();
                        total = total + quantity * coldDrink;
                        break;

                    case 5: // Cold Coffee
                        System.out.println("Sie haben Eiskaffee ausgewählt.");
                        System.out.println();
                        System.out.println("Geben Sie die gewünschte Menge ein: ");
                        quantity = sc.nextInt();
                        total = total + quantity * coldCoffee;
                        break;

                    case 6: // Pizza
                        System.out.println("Sie haben Pizza ausgewählt.");
                        System.out.println();
                        System.out.println("Geben Sie die gewünschte Menge ein: ");
                        quantity = sc.nextInt();
                        total = total + quantity * pizza;
                        break;

                    case 7: // Iced Tea
                        System.out.println("Sie haben Eistee ausgewählt.");
                        System.out.println();
                        System.out.println("Geben Sie die gewünschte Menge ein: ");
                        quantity = sc.nextInt();
                        total = total + quantity * iceTea;
                        break;

                    case 8: // Exit
                        System.exit(1);
                        break;

                    default:
                        System.out.println("Ungültige Wahl.");
                        break;
                }

                System.out.println();
                System.out.print("Möchten Sie noch etwas bestellen? (J/N): ");
                again = sc.next();

                if (again.equalsIgnoreCase("J")) {
                    order();
                } else if (again.equalsIgnoreCase("N")) {
                    generateBill();
                    System.exit(1);
                } else {
                    System.out.println("Ungültige Wahl.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Ungültige Eingabe! Bitte geben Sie eine Zahl ein.");
                sc.next(); // Clears the invalid input
            }
        }
    }
}
