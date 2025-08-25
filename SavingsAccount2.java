public class SavingsAccount2 {
    public double balance;
    public double interestRate;
    public String name;

    public void displayCustomer() {
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Rate: " + interestRate);
    }// end method displayCustomer

    public void deposit(int x) {
        if (x <= 0) {
            System.out.println("Aware : Penyetoran harus positif");
            return;
        }
        balance += x;
        System.out.println("Setor : " + x + " | " + "Saldo sekarang : " + balance);

    }

    public void withdraw(double y) {
        if (y < 0) {
            System.out.println("Aware, jumlah pengambilan saldo harus positif!!");
            return;
        }
        if (y > balance) {
            System.out.println("Aware : Saldo anda tidak mencukupi!");
            return;
        }
        balance -= y;
        System.out.println("Tarik : " + y + " | " + "Saldo serkarang : " + balance);
    }

    public double calcInterest() {
        double interest = balance * interestRate / 12;
        return interest;

    }// end method calcInterest

}
// end class SavingsAccount