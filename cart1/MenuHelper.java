package cart1;

import java.util.Scanner;

public class MenuHelper {

    private Scanner sc ; 
    private CartItems ci;

    
    public MenuHelper() { 
        sc = new Scanner(System.in);
        ci = new CartItems();
    }


    public void showMenu() {

        while(true) {
            System.out.println("\n 1. View Cart " + "\n 2. Add items " + "\n 3. Remove Item" + "\n 4. Exit");
            System.out.println("\n Enter your choice :");
            Integer choice = sc.nextInt();
            performOperation(choice);
        }
    }

    private void performOperation(int choice) {
        //System.out.println("\n .......Performing Operation......... \n");

        if (choice == 1) 
            viewCart();
        else if (choice == 2)
             addItem();
        else if (choice == 3)
             removeItem();
        else 
            System.exit(0);
    }


    private void addItem() {
        
        System.out.println("\n .... Adding to cart ..... \n");

        System.out.print("\n Enter item id : ");
        Long itemId = sc.nextLong();

        System.out.print("\n Enter Price : ");
        Double pr = sc.nextDouble();

        System.out.println("\n Enter name of product : ");
        String name = sc.next();

        System.out.println("\n Enter quantity of product : ");
        Integer quantity = sc.nextInt();

         ci.addItem(itemId,pr,name,quantity);

         System.out.println("\n ...... Item id " + itemId + " Price : " + pr + " Name "+ name +" Quantity "+quantity);
    }

    public void viewCart() {
        System.out.println("\n Cart items are........");
        ci.cartItems();
        ci.totalInCart();
    }


    public void removeItem() {
        System.out.println("Enter item ID to be removed");
        Long itemId = sc.nextLong();
        System.out.println("Enter quantity to be removed");
        Integer quantity = sc.nextInt();
        ci.removeItem(itemId,quantity);
    }


   
}
