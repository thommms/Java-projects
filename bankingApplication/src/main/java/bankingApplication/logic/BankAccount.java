package bankingApplication.logic;

import java.util.Scanner;

public class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    public BankAccount(String cName, String cid){
        customerId=cid;
        customerName=cName;
    }

    void deposit(int amount){
        if (amount != 0) {
            balance+=amount;
            previousTransaction= amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance=-amount;
            previousTransaction=-amount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposit: "+previousTransaction);
        }
        if (previousTransaction < 0) {
            System.out.println("Withdrawn: "+Math.abs(previousTransaction));
        }
        else
            System.out.println("No transaction occured");
    }

    public void showMenu(){
        char option = '\0';
        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome " + customerName + " to you account balance");
        System.out.println("Your ID is "+customerId);
        System.out.println("\n");
        System.out.println("A. Check your balance");
        System.out.println("B. Make Withdrawal");
        System.out.println("C. Deposit");
        System.out.println("D. View previous transaction");
        System.out.println("E: Exit");

        do {
            System.out.println("A. Check your balance");
            System.out.println("B. Deposit");
            System.out.println("C. Make Withdrawal");
            System.out.println("D. View previous transaction");
            System.out.println("E: Exit");
            System.out.println("==========================================================================================");
            System.out.println("Enter an option");
            System.out.println("==========================================================================================");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("----------------------------------------------------------------------------------");
                    System.out.println("Balance: " + balance);
                    System.out.println("----------------------------------------------------------------------------------\n");
                    break;
                case 'B':
                    System.out.println("----------------------------------------------------------------------------------");
                    System.out.println("Enter amount to deposit");
                    System.out.println("----------------------------------------------------------------------------------");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                case 'C':
                    System.out.println("----------------------------------------------------------------------------------");
                    System.out.println("Enter amount to withdraw");
                    System.out.println("----------------------------------------------------------------------------------");
                    int withdrawAmount = scanner.nextInt();
                    withdraw(withdrawAmount);
                    System.out.println("Amount withdrawn is "+withdrawAmount);
                    System.out.println("Balance is "+balance);
                    System.out.println("\n");
                    break;
                case 'D':
                    System.out.println("----------------------------------------------------------------------------------");
                    getPreviousTransaction();
                    System.out.println("----------------------------------------------------------------------------------");
                    System.out.println('\n');
                    break;
                case 'E':
                    System.out.println("Exiting...");
                    System.out.println("**********************************************************************************");
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Invalid option, please enter again");
                    break;
            }
        } while (option != 'E');
        System.out.println("Thank you using our service");
    }


}
