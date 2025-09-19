

class DemoGrossPay
   {
      public static void main(String[]args)
      {
         calculateGross (10, 22.75);
         calculateGross (25, 22.75);
         calculateGross (37.5, 22.75);
         
      }
      
      public static void calculateGross(double hoursOfWork, double hourlyRate)
      {
         double  Rate = hoursOfWork * hourlyRate;
         System.out.println(hoursOfWork +  " hours at $ " + hourlyRate + " per hour is $ " + Rate);
      }
   }