import java.util.*;

public class BasicATM {
    static Scanner scanner = new Scanner(System.in);
    static double balance = 1000.00;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> checkBalance();
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid option.");
            }
        }
    }

    static void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    static void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}
