import java.util.*;
class Largest_among_5_number
{
 public static void main(String args[])
{
 int num1,num2,num3,num4,num5;
 Scanner sc = new Scanner(System.in);
 System.out.println("enter your num1:");
  num1 = sc.nextInt();
   System.out.println("enter your num2:");
  num2 = sc.nextInt();
System.out.println("enter your num3:");
  num3 = sc.nextInt();
System.out.println("enter your num4:");
  num4 = sc.nextInt();
System.out.println("enter your num5:");
  num5 = sc.nextInt();
 if (num1>num2 &&num1>num3 && num1>num4 && num1>num5)
	System.out.println("greatest amont all 5 is "+num1);
 else if(num2>num1 &&num2>num3 && num2>num4 && num2>num5)
	System.out.println("greatest amont all 5 is "+num2);
 else if(num3>num2 &&num3>num1 && num3>num4 && num3>num5)
	System.out.println("greatest amont all 5 is "+num3);
else if (num4>num2 &&num4>num3 && num4>num1 && num4>num5)
	System.out.println("greatest amont all 5 is "+num4);
else if (num5>num2 &&num5>num3 && num5>num1 && num5>num1)
	System.out.println("greatest amont all 5 is "+num5);
else
	System.out.println("invalid");

}

}