package digitalwallet;


import java.util.Scanner;

public class MenuHelper {

    private Scanner sc ; // state
    private WalletRepository repository;

    
    public MenuHelper() { // initilize the state at the time of object creation
        sc = new Scanner(System.in);
        repository = new WalletRepository();
    }


    public void showMenu() {
         String menu = "\n 1. Check Balance " + "\n 2. Top Up " + "\n 3. Send Money" + "\n 4. Exit";

        
        while(true) {
            System.out.println(menu);
            System.out.println("\n Enter your choice :");
            int choice = sc.nextInt();
            performOperation(choice);
        }
    }

    private void performOperation(int choice) {
        System.out.println("\n .......Performing Operation......... \n");

        if (choice == 1) 
            checkBalance();
        else if (choice == 2)
             topUp();
        else if (choice == 3)
             sendMoney();
        else if (choice == 4)
            users();
        else if (choice == 5) 
        removeUser();
        else 
            System.exit(0);
    }


    private void checkBalance() {
        System.out.println("\n ........Checking Balance....... \n");

        System.out.print("\n Enter Wallet ID : ");
        Long walletId = sc.nextLong();
        double balance = repository.checkBalance(walletId);

        System.out.println("\n .......Balance For " + walletId + " is : " + balance + " ....... \n");
    }

    private void topUp() {
        System.out.println("\n ........Top Up Wallet...... \n");

        System.out.println("\n *** Top Up Wallet *** \n");

        System.out.print("\n Enter Wallet ID : ");
        Long walletId = sc.nextLong();

        System.out.print("\n Enter Amount : ");
        Double amount = sc.nextDouble();

        double balance = repository.topUp(walletId, amount);

        System.out.println("\n *** Wallet " + walletId + " Updated : " + balance + "  *** \n");
    }

    private void sendMoney() {
        System.out.println("\n ......Sending...... \n");

        System.out.print("\n Enter Your Wallet ID : ");
        Long fromWalledId = sc.nextLong();

        System.out.print("\n Enter Friends ID : ");
        Long toWalledId = sc.nextLong();

        System.out.print("\n Enter Amount : ");
        Double amount = sc.nextDouble();

        Integer status = repository.sendMoney(fromWalledId, toWalledId, amount);

        if (status == 0) {
            System.out.println("\n *** NOT able to Send Money *** \n");
        } else {
            System.out.println("\n *** Money Transferred Successfully *** \n");
        }


    }

    public void users() {
        System.out.println("\n Registered Users are........");
        repository.registeredUsers();

        
    }

    public void removeUser() {
        System.out.println("Enter Wallet ID to be removed");
        Long WalletId = sc.nextLong();
        repository.removeUser(WalletId);
        System.out.println("\n User has been removed");
    }
   
}
