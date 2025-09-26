import java.util.Scanner;

public class DebugFour1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius for a circle >> ");
        int radius = input.nextInt();

        DebugCircle c = new DebugCircle(radius); 
        
        System.out.println("The radius is " + c.getRadius()); // replace getRad to getRadius
        System.out.println("The diameter is " + c.getDiameter()); // replace getDia to getDiamter
        System.out.println("The area is " + c.getArea());
    }
}
