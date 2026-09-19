class M2 {
    private double balance;

    public M2(double b) {
        if (b < 0) {
            System.out.println("Invalid opening balance");
            balance = 0;
        }
        else
            balance = b;
    }

    public void topUp(double amount) {
        if (amount <= 0)
            System.out.println("Top-up rejected");
        else {
            balance += amount;
            System.out.println("Balance after top-up: " + balance);
        }
    }

    public void deduct(double amount) {
        if (amount > balance)
            System.out.println("Deduct rejected: insufficient balance");
        else
            balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        M2 wallet = new M2(500);

        wallet.topUp(200);
        wallet.deduct(1000);

        System.out.println("Final balance: " + wallet.getBalance());
    }
}