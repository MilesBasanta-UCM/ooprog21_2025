import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs
{
   public static void main(String[]args)
   {
    String nameInput;
    int nameConfirmation;
    
    do
    {
      nameInput = JOptionPane.showInputDialog(null, "What is your name?");
      if(nameInput == null)
      {
      JOptionPane.showMessageDialog(null, "Operation Finished");
      return;
      }
      nameConfirmation = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            
    } 
    while (nameConfirmation == JOptionPane.NO_OPTION);
      String nameOutput = "Hello, " + nameInput;
      JOptionPane.showMessageDialog(null, nameOutput);
    }
}