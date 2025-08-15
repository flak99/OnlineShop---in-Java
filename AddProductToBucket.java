

public class AddProductToBucket {

     static void Add(String line){

       System.out.println("Ddodano: " + "Produkty numer --> "+ line);

        String[] productsNumberArray = line.split(" ");

        for (String p : productsNumberArray){
            System.out.println(p);
        }
        
    }

    static void ShowBucket(){

    }
    
}
