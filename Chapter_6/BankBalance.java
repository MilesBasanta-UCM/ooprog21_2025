import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance;
        final double INTEREST_RATE = 0.03; 
        int year = 0;
        int choice;

        System.out.print("Enter initial bank balance > ");
        balance = sc.nextDouble();

        System.out.println("Do you want to see next year's balance?");
        System.out.print("Enter 1 for yes or any number for no >> ");
        choice = sc.nextInt();

        while (choice == 1) {
            year++;
            balance = balance + (balance * INTEREST_RATE);
            System.out.printf("After year %d at %.2f interest rate, balance is $%.2f%n", year, INTEREST_RATE, balance);

            System.out.println("\nDo you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes or any number for no >> ");
            choice = sc.nextInt();
        }
    }
}