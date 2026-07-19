import java.util.*;
class AreaOfSqure
{
 public static void main(String args[])
 {
   float side;
   Scanner obj = new Scanner(System.in);
	System.out.print(" Enter the side of squre:");
   side = obj.nextFloat();
   
   System.out.println("Area of Squre is"+side+"is :"+(side*side));
 }
}
