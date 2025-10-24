import java.util.Scanner;

public class DebugSix1 {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int days;
      double money = 0.01;
      int day = 1;

      System.out.print("Enter number of days >> "); // missing semicolon
      days = keyboard.nextInt();

      while(day <= days) // change the condition to day <= days instead of days < day
      {
         System.out.println("After day " + day + " you have " + money); // change the variable days to day
       money = money *= 2; // multiply the money by 2
         ++day;
      }
   }
}
