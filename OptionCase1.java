import java.util.Scanner;

public class OptionCase1 {

    static void DoCase1(Scanner scanner) {
        System.out.println(" ");
        System.out.print("Podaj minimalną cenę --> ");
        int minValue = scanner.nextInt();
        System.out.print("Podaj maksymalną cenę --> ");
        int maxValue = scanner.nextInt();
        StoreProducts.FiltrProductsByPrice(ProductData.products, minValue, maxValue);

    }

}
