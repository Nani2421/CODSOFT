import java.util.Scanner;

public class atmInterface {

    public static class BankAccount { 

        private double balance;

        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        public double getBalance() {
            return balance;
        }

        public boolean withdraw(double amount) {
            if (amount > balance) {
                return false;
            }

            balance -= amount;//balance = balance - amount.
            return true;
        }

        public void deposit(double amount) {
            balance += amount;//balance = balance + amount.
        }
    }

    public static class ATM {

        private BankAccount account;

        public ATM(BankAccount account) {
            this.account = account;
        }

        public void run() {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\nATM Menu:");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.println("Enter your choice: ");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        withdraw(scanner);
                        break;
                    case 2:
                        deposit(scanner);
                        break;
                    case 3:
                        checkBalance();
                        break;
                    case 4:
                        System.out.println("Exiting ATM. Thank you for using our services!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            } while (choice != 4);
        }

        public void withdraw(Scanner scanner) {
            System.out.println("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();

            if (account.withdraw(amount)) {
                System.out.println("Withdrawal successful. Please collect your cash.");
            } else {
                System.out.println("Insufficient funds. Your current balance is $" + account.getBalance());
            }
        }

        public void deposit(Scanner scanner) {
            System.out.println("Enter amount to deposit: ");
            double amount = scanner.nextDouble();

            account.deposit(amount);
            System.out.println("Deposit successful. Your new balance is $" + account.getBalance());
        }

        public void checkBalance() {
            System.out.println("Your current balance is $" + account.getBalance());
        }
    }

    public static void main(String[] args) {
        // Set initial balance.
        BankAccount account = new BankAccount(1000.00); 
        ATM atm = new ATM(account);
        atm.run();
    }
}
