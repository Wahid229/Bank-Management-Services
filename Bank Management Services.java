import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void addAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        accountNumber = sc.nextInt();
        System.out.println("Enter account holder name: ");
        accountHolderName = sc.next();
        System.out.println("Enter the initial balance: ");
        balance = sc.nextDouble();
    }

    void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Deposit Successful!");
    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void checkBalance() {
        System.out.println("Account balance: " + balance);
    }
}

public class BankManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();
        int choice, flag = 1;

        while (flag == 1) {
            System.out.println("1. Add new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check balance");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.addAccount();
                    break;

                case 2:
                    account.deposit();
                    break;

                case 3:
                    account.withdraw();
                    break;

                case 4:
                    account.checkBalance();
                    break;

                case 5:
                    flag = 0;
                    System.out.println("Thank you for using our bank management system!");
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
