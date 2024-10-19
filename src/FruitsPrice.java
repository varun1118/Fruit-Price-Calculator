import java.util.Scanner;

public class FruitsPrice {
     private String[] fruits={"Apple","Banana","Mango","Guava","Grapes","Pineapple"};
     private double[] fruitsPrice={45,67,89,98,34};
     public void showFruitsAndPrice(){
         for (int i = 0; i < fruitsPrice.length ; i++) {
             System.out.print("Price of "+fruits[i]+" is $ ");
             System.out.println(fruitsPrice[i]);
         }
     }
     int product =0;
     public void priceCalculator(){
         boolean flag=true;
         do{
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the name of the fruit");
         String fruit = sc.next();
         System.out.print("Please enter the quantity in kilograms");
         int kg = sc.nextInt();
         for (int i = 0; i < fruits.length; i++) {
             if(fruits[i].equals(fruit)){
                 flag=false;
                 System.out.print("Price of "+fruit+"s are $");
                 System.out.println((kg*fruitsPrice[i]));
                 product=1;
             }
         }
         if(product==0){
             System.out.println("Not Valid Selection");
         }
         }while (flag);
     }
}
