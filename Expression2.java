import java.util.*;
class Expression2
{
 public static void main(String args[])
 {
   int m,n,o,p, expression;
   Scanner obj = new Scanner(System.in);
	System.out.print(" Enter the number:");
System.out.print(" Enter the m:");
   m = obj.nextInt();
System.out.print(" Enter the n:");
	n = obj.nextInt();
System.out.print(" Enter the o:");
	o = obj.nextInt();
System.out.print(" Enter the p:");
	p = obj.nextInt();

expression=((m*n*o*p)/(o+p+n))/m;
System.out.print(" sum of the expression: ((x*y)+(x+y)/(x*y*z))/m = "+expression);
sc.close();
 }
}