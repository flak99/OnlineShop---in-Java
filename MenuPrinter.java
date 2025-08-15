import java.util.Scanner;

public class MenuPrinter {

    static void printMainMenu() {
        MainMenuPrint.PrintMenu();
    }

    static void printSubMenu(Scanner scanner) {

        boolean isRunning = true;
        boolean wasShown = false;

        String menuString = """
                *** MENU - Lista Zakupów ***
                (1) Filtruj produkty po cenie
                (2) Dodaj produkty do koszyka
                (3) Zakończ
                """;

        while (isRunning) {

            if (!wasShown) {
                StoreProducts.AddStoreProductsToConsole();
            }

            System.out.println(" ");
            System.out.println(menuString);

            System.out.print("Wybierz opcje--> ");
            int subChoice = scanner.nextInt();

            switch (subChoice) {
                case 1 -> {
                    OptionCase1.DoCase1(scanner);
                    wasShown = true;
                }
                case 2 -> {
                    OptionCase2.DoCase2(scanner);
                }
                case 3 -> {
                    isRunning = false;
                }

            }

        }

    }

}
