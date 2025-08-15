import java.util.Scanner;


public class MenuPrinter {
        


    static void printMainMenu(){
        System.out.println(" ");
        System.out.println("*** MENU ***");
        System.out.println("(1) Pokaż wszystkie produkty");
        System.out.println("(2) Filtruj produkty");
        System.out.println("(3) Zamknij sklep!");
        System.out.println(" ");
    }

    static void printSubMenu(Scanner scanner){

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
            case 1->{
                System.out.println(" ");
                System.out.print("Podaj minimalną cenę --> ");
                    int minValue = scanner.nextInt();
                System.out.print("Podaj maksymalną cenę --> ");
                    int maxValue = scanner.nextInt();
                
                StoreProducts.FiltrProductsByPrice(ProductData.products, minValue, maxValue);
                wasShown = true;
            }
            case 2 ->{
             
                    System.out.println("*** Dodawnie do koszyka ***");
                    System.out.print("Proszę podać numery produkty przedzielone sapcją--> ");
                      scanner.nextLine(); // <-- dodaj to aby nextInt nie przejmmowal lini jako uz ten prompt 
                    String numbersLine = scanner.nextLine();
                    AddProductToBucket.Add(numbersLine);
                    System.out.println(" ");
                    System.out.println("Twwój koszyk: ");
            
            }
            case 3 ->{
                isRunning = false;
            }
            
        }



       }
      
        System.out.println(menuString);
        }


    }
    

