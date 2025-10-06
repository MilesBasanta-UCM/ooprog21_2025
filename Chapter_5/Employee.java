public class Employee 
{
   private int employeeNumber;
   private double payRate;
   private static final int MAX_EMPLOYEE_NUMBER = 9999;
   private static final double OVERTIME_MULTIPLIER = 1.5;
   private static final double MAX_RATE = 60.00;
    
   public Employee (int employeeNumber, double payRate)
   {
      if (employeeNumber < 0 || employeeNumber > MAX_EMPLOYEE_NUMBER)
      {
         System.out.println("Employee Number should not be higher than " + MAX_EMPLOYEE_NUMBER );
      }
      if (payRate < 0 )
      {
         System.out.println("Rate should not be less than 0 ");
      }
      
      this.employeeNumber = employeeNumber;
      this.payRate = payRate;
   } 
      // getters
       
   public int getEmployeeNumber()
      {
       return employeeNumber;
      }
      
   public double getPayRate()
      {
       return payRate;
      }
      
      // calculations
   public double calculateRegularPay(double hoursWorked)
   {
      double regularHours;
      if(hoursWorked <= 40 )
      {
         regularHours = hoursWorked;
      }
      else 
      {
         regularHours = 40;
      }
      return regularHours * payRate;
   }
      
   public double calculateOvertimePay(double hoursWorked)
   {
      double overtimeWork;
      if (hoursWorked > 40 )
      {
         overtimeWork = hoursWorked - 40;
      }
      else 
      {
         overtimeWork = 0; 
      }
      return overtimeWork * payRate * OVERTIME_MULTIPLIER;
   }
}