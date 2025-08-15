
import java.util.List;

public class StoreProducts {
    
    String prodName, prodInfo;
    double price;
    int minValue, maxValue, id;


    StoreProducts(int id, String prodName, String prodInfo, double price){
        this.prodName = prodName;
        this.prodInfo= prodInfo;
        this.price = price;
        this.id = id;
    }

   static void AddStoreProductsToConsole(){

        System.out.println("***** LISTA PRODUKTÓW *****");
    for (int i = 0; i<ProductData.products.size(); i++){
        
        System.out.println(ProductData.products.get(i).id +"." + " " + ProductData.products.get(i).prodName + " ----- " + ProductData.products.get(i).price + " zł");
    }
    }

    
public int GetID(){
    return id;
}
    

static void FiltrProductsByPrice( List<StoreProducts> products, int minValue, int maxValue){
     int amout = 0;  
     String alertString = """
                            *** MENU - Lista Zakupów ***
                            (1) Filtruj produkty po cenie
                            (2) Dodaj produkty do koszyka
                            (3) Pokaż koszyk
                            """;
    
System.out.println(" ");
System.out.println("Produtky w przedzuale " + minValue + " - " + maxValue + " zł");
System.out.println(" ");

    for (int i=0;i<products.size();i++){
           
            if(products.get(i).price > minValue && products.get(i).price <maxValue){
                System.out.println( i+1 +"." + " " + products.get(i).prodName + " ----- " + products.get(i).price + " zł");
            amout++;
            }
    }

    if(amout == 0){
                System.out.println("Brak prodkutów spłeniających okreslone przedziały!");
                System.out.println(alertString);
            }

System.out.println(" ");
    }


}


