public class AccountTest2 {
    public static void main(String[] args) {
        SavingsAccount2 sa1 = new SavingsAccount2();

        System.out.println("---Transaksi amzar---");
        sa1.name = "amzar";
        sa1.deposit(5000);
        sa1.balance += sa1.calcInterest();
        sa1.withdraw(200);
        System.out.println("saldo setelah : " + sa1.balance);

        SavingsAccount2 sa2 = new SavingsAccount2();

        System.out.println("---Transaksi Juju---");
        sa2.name = "juju";
        sa2.deposit(10000);
        sa2.balance += sa2.calcInterest();
        sa2.withdraw(500);
        System.out.println("saldo setelah : " + sa2.balance);

    }// end class AccountTest
}