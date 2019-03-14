package bankingApplication;

import bankingApplication.logic.BankAccount;

public class MainBankApp {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("Thomas Okonkwo", "T051");
        bankAccount.showMenu();
    }
}