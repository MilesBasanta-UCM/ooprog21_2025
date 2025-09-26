// This class uses a DebugBox class
// to instantiate two Box objects
import java.util.Scanner;
public class DebugFour3{
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      int w, l, h;
      
      System.out.print("Enter width of box >> ");
      w = input.nextInt(); //change nextInteger() to nextInt()
      
      System.out.print("Enter length of box >> ");
      l = input.nextInt(); // change nextDouble() to nextInt() to match the int type
      
      System.out.print("Enter height of box >> ");
      h = input.nextInt();
      
      DebugBox box1 = new DebugBox(); //wrong class  change fixDebugBox to DebugBox
      DebugBox box2 = new DebugBox(w, l, h); //incorrect method name it is DebugBox() instead of FixDebugBox() and fixed error from box1 to box2
      
      System.out.println("The dimensions of the first box are");
      box1.showData();
      
      System.out.print(" The volume of the first box is ");
      showVolume(box1);
      
      System.out.println("The dimensions of the second box are");
      box2.showData();
      
      System.out.print(" The volume of the second box is ");
      showVolume(box2); //fixed box2.showVolume() to call static method
   }  
   
   public static void showVolume(DebugBox aBox){
      double vol = aBox.getVolume();
      System.out.println(vol);
   }
}