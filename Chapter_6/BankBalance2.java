import java.util.Scanner;

public class BankBalance2   
{
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);

        double balance;
        final double INTEREST_RATE = 0.03;  
        int year = 1;
        int choice;

        System.out.print("Enter initial balance: $");
        balance = input.nextDouble();

        do 
        {
        
            balance += balance * INTEREST_RATE;

            
            System.out.printf("After year %d at %.2f interest rate, balance is $%.2f%n", 
                              year, INTEREST_RATE, balance);

            
            System.out.print("Do you want to see the balance at the end of another year?\n");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            choice = input.nextInt();

            year++;
            
        } while (choice == 1);
       
    }
}