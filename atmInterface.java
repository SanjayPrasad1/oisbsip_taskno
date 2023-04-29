import java.util.*;
public class atmInterface {
    public static void main(String[] args) {
        int balance = 0, withdraw, deposit;
        Scanner s = new Scanner(System.in);

        while (true){
            System.out.println("****** Welcome to ATM ******");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Exit");
            System.out.print("Choose the operation you want to perform: ");
            int choice = s.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter the amount you want to withdraw: ");
                    withdraw = s.nextInt();
                    if (balance >= withdraw){
                        balance = balance - withdraw;
                        System.out.println("Please collect your amount");
                    }
                    else System.out.println("Insufficient Balance!");
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter the amount to be deposited: ");
                    deposit = s.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your money has been successfully deposited!");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance: "+balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}