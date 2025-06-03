package Pertemuan14;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    // ERROR: Cannot override the final method from BankAccount
    /*
    @Override
    public void displayAccountInfo() {
        System.out.println("Savings Account Info");
    }
    */

    // Solusi: Tambah method baru untuk info tambahan
    public void showAdditionalInfo() {
        System.out.println("This is a savings account.");
    }
}
