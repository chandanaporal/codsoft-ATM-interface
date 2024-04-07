import java.util.Scanner;

public class ATMInterface {
    private static double balance = 1000.00; // Initial balance
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("ATM Interface");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    private static void checkBalance() {
        System.out.println("Your balance is: $" + balance);
    }
    
    private static void withdrawMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
        }
    }
    
    private static void depositMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Deposit successful. New balance: $" + balance);
    }
}
g