class BankAccount {
    int balance = 1000;

    synchronized void withdraw(int amount) {
        balance -= amount;
        System.out.println(balance);
    }
}

class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        Thread t1 = new Thread(() -> acc.withdraw(300));
        Thread t2 = new Thread(() -> acc.withdraw(300));

        t1.start();
        t2.start();
    }
}
