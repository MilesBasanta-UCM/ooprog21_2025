import java.util.Scanner;

class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter employee number: ");
        int employeeNumber = scanner.nextInt();

        
        System.out.print("What is your regular pay rate? ");
        double payRate = scanner.nextDouble();

        
        Employee employee = new Employee(employeeNumber, payRate);

        
        System.out.print("How many hours did you work this week? ");
        double hoursWorked = scanner.nextDouble();
        
        
        double regularPay = employee.calculateRegularPay(hoursWorked);
        double overtimePay = employee.calculateOvertimePay(hoursWorked);

        
        System.out.printf("Regular Pay  is  $%.2f\n", regularPay);
        System.out.printf("Overtime Pay is  $%.2f\n", overtimePay);

        scanner.close();
    }
}
