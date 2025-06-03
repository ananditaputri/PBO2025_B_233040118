package Pertemuan14;

public class TestBankAccount {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123456");
        sa.deposit(1500);
        sa.displayAccountInfo(); // memanggil method final
        sa.showAdditionalInfo();
    }
}
