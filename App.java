import java.util.Scanner;

public class App {
public static void main(String[] args) {

    boolean isStop = false;

    MenuPrinter.printMainMenu();
    
   

    while (!isStop) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wybierz opcje--> ");
        int userChoice = scanner.nextInt();


        switch(userChoice) {
        case 1:
            ClearConsole.Clean();
            MenuPrinter.printSubMenu(scanner);
            break;
    
        default:

            break;
        }

        
    }
    

}


    
}

