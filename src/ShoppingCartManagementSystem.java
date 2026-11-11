import java.util.Scanner;
import java.util.ArrayList;
public class ShoppingCartManagementSystem {
    static Scanner sc = new Scanner(System.in);
    public static void productCatalog(String[]productNames , double[]productPrices){
        for(int i=0 ; i<productNames.length ; i++){
            System.out.println("Item " + (i+1) +" Product : " + productNames[i]+ " Price : " + productPrices[i]);
        }
    }

    public static void addToCart(
            String[] productNames
            ,double[] productPrices
            , ArrayList<String>cartProducts
            ,ArrayList<Double>cartPrices
            ,ArrayList<Integer>cartQuantity)
    {
        productCatalog(productNames, productPrices);
        boolean isRunning = true;
        while(isRunning){
            System.out.print("Enter the item number you want to add to cart: ");
            int itemNumber = sc.nextInt()-1;
            System.out.println("Item " + productNames[itemNumber] + " is added to cart");
            System.out.print("Enter Quantity ");
            int itemQuantity = sc.nextInt();
            System.out.println("Price :" + productPrices[itemNumber]*itemQuantity );
            cartProducts.add(productNames[itemNumber]);
            cartPrices.add(productPrices[itemNumber]);
            cartQuantity.add(itemQuantity);

            System.out.println("PRESS 1 : TO EXIT OR PRESS ANY KEY TO CONTINUE ADDING");
            int choice = sc.nextInt();
            if(choice == 1){
                isRunning = false;
            }
        }
    }
    public static void removeFromCart(
            String[] productNames
            ,double[] productPrices
            , ArrayList<String>cartProducts
            ,ArrayList<Double>cartPrices
            ,ArrayList<Integer>cartQuantity
    ){
        for(int i=0 ; i<cartProducts.size() ; i++){
            System.out.println("Item: " + i+1 + " Product : " + cartProducts.get(i)+ " Price : "+ cartPrices.get(i)+ " Quantity : " + cartQuantity.get(i));
        }
        System.out.print("Enter Item Number to  remove from cart: ");
        int itemNumber = sc.nextInt()-1;
        cartProducts.remove(itemNumber);
        cartPrices.remove(itemNumber);
        cartQuantity.remove(itemNumber);
    }
    public static void viewProducts(String[] productNames
            ,double[] productPrices
            , ArrayList<String>cartProducts
            ,ArrayList<Double>cartPrices
            ,ArrayList<Integer>cartQuantity){
        for(int i=0 ; i<cartProducts.size() ; i++){
            System.out.println("Item: " + i+1 + " Product : " + cartProducts.get(i)+ " Price : "+ cartPrices.get(i)+ " Quantity : " + cartQuantity.get(i));
        }
    }
    public static void generateBill(String[] productNames
            ,double[] productPrices
            , ArrayList<String>cartProducts
            ,ArrayList<Double>cartPrices
            ,ArrayList<Integer>cartQuantity){
        for(int i=0 ; i<cartProducts.size() ; i++){
            System.out.println("Item: " + i+1 + " Product : " + cartProducts.get(i)+ " Price : "+ cartPrices.get(i)+ " Quantity : " + cartQuantity.get(i));
            System.out.print("TOTAL : " + cartPrices.get(i)*cartQuantity.get(i) );
        }

    }


    public static void main(String[] args) {

        boolean isRunning = true;
        String[] productNames= {
                "Laptop","Mouse","Keyboard","Headphones","Monitor"
        };
        double[] productPrices = {
                50000,500,1000,2000,12000
        };

        ArrayList<String> cartProducts= new ArrayList<>();
        ArrayList<Double> cartPrices = new ArrayList<>();
        ArrayList<Integer> cartQuantity = new ArrayList<>();


        while(isRunning){
            System.out.println("Welcome to the Shopping Cart Management System");
            System.out.println("PRESS 1 : TO VIEW PRODUCTS AVAILABLE");
            System.out.println("PRESS 2 : TO ADD ITEMS IN CART");
            System.out.println("PRESS 3 : TO REMOVE ITEMS IN CART");
            System.out.println("PRESS 4 : TO VIEW PRODUCTS IN CART");
            System.out.println("PRESS 5 : TO GENERATE BILL");

            System.out.print("ENTER YOUR CHOICE : ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 -> {
                    productCatalog(productNames, productPrices);
                }
                case 2 -> {
                    addToCart(productNames,productPrices,cartProducts,cartPrices,cartQuantity);
                }
                case 3 -> {
                    removeFromCart(productNames,productPrices,cartProducts,cartPrices,cartQuantity);
                }
                case 4 -> {
                    viewProducts(productNames,productPrices,cartProducts,cartPrices,cartQuantity);
                }
                case 5 -> {
                    generateBill(productNames,productPrices,cartProducts,cartPrices,cartQuantity);
                }

            }

        }




    }
}
