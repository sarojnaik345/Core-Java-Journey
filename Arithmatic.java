import java.util.*;
class Arithmetic 
{
	public static void main(String args[])
	{
	 float x,y,z;
	 float sum,subs,mul,div;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter two number:");
	 x = sc.nextFloat();
	 y= sc.nextFloat();
	 sum= x+y;
	 subs= x-y;
	 mul = x*y;
	 div = x/y;
	 System.out.println("addion is :"+sum);
	 System.out.println("substraction is :"+subs);
	 System.out.println("Multiplication is :"+mul);
	 System.out.println("divion is :"+div);
	}
}