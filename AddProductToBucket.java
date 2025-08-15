public class AddProductToBucket {

    static int[] productsNumberArray;
    static String[] bucket;
 

     static void Add(String line){

       System.out.println("Ddodano: " + "Produkty numer --> "+ line);

       //Zmiana typu liczb z STRING na INIT
       String[] splitLine = line.split(" ");
        productsNumberArray = new int[splitLine.length];

        //dodanie do tablicy produkct

        for(int i =0; i< splitLine.length;i++){
            productsNumberArray[i] = Integer.parseInt(splitLine[i]);
        }
        
        
    }

    static void ShowBucket(){
        double orderValue = 0.0;
       ;
            
        
        for(int i = 0; i<ProductData.products.size(); i++){
            for(int j =0; j< productsNumberArray.length; j++ ){
             
            if(ProductData.products.get(i).id == productsNumberArray[j] ){
                
                System.out.println(ProductData.products.get(i).prodName + " ---> " + ProductData.products.get(i).price + " zł");
                orderValue += ProductData.products.get(i).price;

            }
            }
        
        }

        System.out.println(" ");
        System.out.println("Wartość koszyka ---> " + orderValue + " zł");

    }
    
}
