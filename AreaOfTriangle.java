import java.util.*;
class AreaOfTriangle
{
 public static void main(String args[])
 {
   float base, height, area;
   Scanner obj = new Scanner(System.in);
	System.out.println(" Enter the base and height:");
	System.out.print("enter base:");
   base = obj.nextFloat();
	System.out.print("enter height:");
   height = obj.nextFloat();
   area =(base*height)/2;
   System.out.println("Division of two number ie"+base+"and "+height+"is :"+area);
 }
}
