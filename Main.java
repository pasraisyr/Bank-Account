import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MethodBank account = new MethodBank( 10000.0);

        int option;
        boolean quit = false;

        do {
            System.out.println("Press 1 to Deposit money");
            System.out.println("Press 2 to Withdraw money");
            System.out.println("Press 3 to Check balance");
            System.out.print("Make an option, press 0 to quit: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("----------------------");
                    System.out.print("Amount to deposit: ");
                    
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("----------------------------------");
                    System.out.println("$" + depositAmount + " has been deposited.");
                    System.out.println("----------------------------------");
                    break;
                case 2:
                    System.out.println("-------------------");
                    System.out.print("Amount to withdraw: ");
                    
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("----------------------------------");
                    System.out.println("Your balance: $" + account.getBalance());
                    System.out.println("----------------------------------");
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("----------------------------------");
                    System.out.println("Invalid option. Please try again.");
                    System.out.println("----------------------------------");
                    break;
            }
            System.out.println();
        } while (!quit);

        System.out.println("Thank you !");
        scanner.close();
    }
}
