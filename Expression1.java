import java.util.*;
class Expression1
{
 public static void main(String args[])
 {
   int x,y,z,m, expression;
   Scanner obj = new Scanner(System.in);
	System.out.print(" Enter the number:");
System.out.print(" Enter the x:");
   x = obj.nextInt();
System.out.print(" Enter the y:");
	y = obj.nextInt();
System.out.print(" Enter the z:");
	z = obj.nextInt();
System.out.print(" Enter the m:");
	m = obj.nextInt();
expression=((x*y)+(x+y)/(x*y*z))/m;
System.out.print(" sum of the expression: ((x*y)+(x+y)/(x*y*z))/m = "+expression);
sc.close();
 }
}