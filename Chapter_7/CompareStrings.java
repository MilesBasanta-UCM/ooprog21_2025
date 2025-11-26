import java.util.Scanner;

public class CompareStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name > ");
        String inputName = sc.nextLine();

        if (inputName.equals("Carmen")) {
            System.out.println(inputName + " equals Carmen");
        } else {
            System.out.println(inputName + " does not equal Carmen");
        }

        sc.close();
    }
}