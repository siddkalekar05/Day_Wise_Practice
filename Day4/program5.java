import java.util.*;

class Client5{
    public static void main(String[] args) {
        int balance = 50000;
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Deposit \n2. Withdraw");
        System.out.println("Enter your choice: ");
        int x = sc.nextInt();

        switch (x) {
            case 1:
                System.out.println("Enter amount to deposit: ");
                int aMount = sc.nextInt();
                balance += aMount;
                System.out.println("Total bank balance: " + balance);
                break;

            case 2:
                System.out.println("Enter the number of withdrawal attempts: ");
                int times = sc.nextInt();

                for (int i = 0; i < times; i++) {
                    System.out.println("Enter the amount for withdrawal: ");
                    int amount = sc.nextInt();

                    if (amount <= 10000 && amount <= balance) {
                         balance -= amount;
                        System.out.println("Withdrawal successful! Remaining balance: " + balance);
                    } else if (amount > 10000) {
                        System.out.println("Amount exceeds the withdrawal limit of 10,000.");
                    } else if (amount > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        System.out.println("Invalid withdrawal attempt.");
                    }
                }
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
