import java.util.*;
class AreaOfCircle
{
 public static void main(String args[])
 {
   double radius,area;
   Scanner obj = new Scanner(System.in);
	System.out.print(" Enter the radius of circle:");
   radius = obj.nextDouble();
   area = (3.14 * (radius*radius));
   System.out.println("Area of circle with "+radius+"is :"+area);
 }
}
