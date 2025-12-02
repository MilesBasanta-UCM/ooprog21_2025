// Application lists valid shipping codes
// A, C, T, or H
// then prompts user for a code
// Application accepts a shipping code
// and determines if it is valid
import java.util.*;

public class DebugEight1
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in); 
      char userCode;
      String entry;
      boolean found = false;   // Should start as false
      char[] okayCodes = {'A','C','T','H'};

      System.out.println("Enter shipping code for this delivery.");
      System.out.print("Valid codes are: ");
      for(int x = 0; x < okayCodes.length; ++x)   
      {
          System.out.print(okayCodes[x]);
          if(x != (okayCodes.length - 1))
             System.out.print(", ");     
      }

      System.out.print(" >> ");
      entry = input.nextLine(); 

      userCode = entry.charAt(0);   // index should be 0, not 1

      for(int i = 0; i < okayCodes.length; ++i)
      {
         if(userCode == okayCodes[i])   // Use ==, not =
         {
            found = true;
            break;  
         }
      }

      if(found)
         System.out.println("Good code");
      else
         System.out.println("Sorry code not found");
   }
}