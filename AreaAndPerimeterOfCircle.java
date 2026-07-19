import java.util.*;
class AreaAndPerimeterOfCircle
{
 public static void main(String args[])
 {
   double radius,area,perimeter;
   Scanner obj = new Scanner(System.in);
	System.out.print(" Enter the radius of circle:");
   radius = obj.nextDouble();
   area = (3.14 * (radius*radius));
   perimeter = 2 * (22/7)*radius;
   System.out.println("Area of circle with "+radius+"is :"+area);
   System.out.println("Perimter  of circle with "+radius+"is :"+perimeter);
 }
}
