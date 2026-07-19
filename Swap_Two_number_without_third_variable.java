import java.util.*;
class Swap_Two_number_without_third_variable
{
	public static void main(String srg[])
	{
	 int a,b;
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the two number: ");
	 a= sc.nextInt();
	 System.out.print("Enter the two number: ");
	 b= sc.nextInt();
	 System.out.println(" two number are a="+a+" and b = "+b);
	 a=a+b;
	 b=a-b;
	 a=a-b;
	System.out.println("After swap the two number are \n a ="+a+" and b="+b);
	}

}