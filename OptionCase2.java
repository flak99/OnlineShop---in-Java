import java.util.Scanner;

public class OptionCase2 {

    static void DoCase2(Scanner scanner) {
        System.out.println("*** Dodawnie do koszyka ***");
        System.out.print("Proszę podać numery produkty przedzielone sapcją--> ");
        scanner.nextLine(); // <-- dodaj to aby nextInt nie przejmmowal lini jako uz ten prompt
        String numbersLine = scanner.nextLine();

        AddProductToBucket.Add(numbersLine);

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Twój koszyk: ");
        AddProductToBucket.ShowBucket();

        System.out.println();
        System.out.println("Naciśnij Enter, aby wrócić do menu...");
        scanner.nextLine(); // czeka na wciśnięcie Enter
    }

}
