public class DebugPen
{
   private String color;
   private String point;
   
   public DebugPen()
   {
      color = "black";
      point = "fine";
   }
   public DebugPen(String color, String point)
   {
      this.color = color; // missing "this." on the assignment of the parameter
      this.point = point; // missing "this." on the assignment of the parameter

   }
   public String getColor()
   {
      return color;
   }
   public String getPoint()
   {
      return point;
   }
}
