import java.util.*;
class Addition
{
	public static void main(String Args[])
	{
	 int a,b,c;
	 Scanner obj = new Scanner(System.in);
	 System.out.println("enter two number:");
	 a = obj.nextInt();
	 b = obj.nextInt();
	 c = a+b;
	 System.out.print("Addition of "+a+" and "+b+"is : "+c);

	}
}