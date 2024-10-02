import java.util.Scanner;

 

public class BankAccount {

      public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


            int option;

            boolean quit = false;

            float balance = 10000f;

            do {

                  System.out.println("Press 1 to Deposit money");

                  System.out.println("Press 2 to Withdraw money");

                  System.out.println("Press 3 to  Check balance");

                  System.out.print("Make an option, press 0 to quit: ");

                  option = scanner.nextInt();

                  switch (option) {

                  case 1:

                        float amount;

                        System.out.print("Amount to deposit: ");

                        amount = scanner.nextFloat();

                        if (amount <= 0)

                             System.out.println("Can't deposit negative amount.");

                        else {

                             balance += amount;

                             System.out.println("$" + amount + " has been deposited.");

                        }

                        break;

                  case 2:

                        System.out.print("Amount to withdraw: ");

                        amount = scanner.nextFloat();

                        if (amount <= 0 || amount > balance)

                             System.out.println("You don't have enough balance");

                        else {

                             balance -= amount;

                             System.out.println("$" + amount + " has been withdrawn.");

                        }

                        break;

                  case 3:

                        System.out.println("Your balance: $" + balance);

                        break;

                  case 0:

                        quit = true;

                        break;

                  default:

                        System.out.println("Your don't have balance");

                        break;

                  }

                  System.out.println();

            } while (!quit);

            System.out.println("Thank you");

            scanner.close();
      }
      

}